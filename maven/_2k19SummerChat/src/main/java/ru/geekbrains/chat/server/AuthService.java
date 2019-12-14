package ru.geekbrains.chat.server;

import java.sql.*;

public class AuthService {
    private static Connection connection;
    private static Statement stmt;

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:users.db");
            stmt = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addUser(String login, String pass, String nick) {
        try {
            String query = "INSERT INTO main (login, password, nickname) VALUES (?, ?, ?);";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, login);
            ps.setInt(2, pass.hashCode());
            ps.setString(3, nick);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addBlock(int sourceId, String nick) {
        try {
            int blckId = getIDbyNick(nick);
            String query = "INSERT INTO bList (id, bId) VALUES (?, ?);";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, sourceId);
//            ps.setInt(2, pass.hashCode());
            ps.setInt(2, blckId);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int getIDbyNick(String nick) {
        try {
            ResultSet rs = stmt.executeQuery("SELECT id FROM main WHERE nickname = '" + nick + "'");
//            int myHash = pass.hashCode(); // 137
            if (rs.next()) {
//                String nick = rs.getString(1);
//                int dbHash = rs.getInt(2);
//                if (myHash == dbHash) {
//                    return nick;
//                }
                int id = rs.getInt(1);
                return  id;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static String getNickByLoginAndPass(String login, String pass) {
        try {
            ResultSet rs = stmt.executeQuery("SELECT nickname, password FROM main WHERE login = '" + login + "'");
            int myHash = pass.hashCode(); // 137
            if (rs.next()) {
                String nick = rs.getString(1);
                int dbHash = rs.getInt(2);
                if (myHash == dbHash) {
                    return nick;
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
