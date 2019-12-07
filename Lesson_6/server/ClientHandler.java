package Lesson_6.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.HashSet;

public class ClientHandler {
    private Socket socket;
    DataInputStream in;
    DataOutputStream out;
    MainServ serv;
    String nick;

    String name;


    public ClientHandler(MainServ serv, Socket socket){
        try {
            this.socket = socket;
            this.serv = serv;
            this.in = new DataInputStream(socket.getInputStream());
            this.out = new DataOutputStream(socket.getOutputStream());


            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        while (true) {
                            String msg = in.readUTF();
                            if (msg.startsWith("/auth")) {
                                String[] tokens = msg.split(" ");
                                String newNick = AuthService.getNickByLoginAndPass(tokens[1], tokens[2]);
                                if (newNick != null) {
                                    if (!serv.isNickBusy(newNick)){
                                    sendMsg("/authok");
                                    nick = newNick;
                                    serv.subscribe(ClientHandler.this);
                                    break;
                                    } else {
                                        sendMsg("Данный пользователь уже онлайн");

                                    } return;

                                }
                                else {
                                    sendMsg("Неверный логин/пароль");
                                }
                            }
                        }

                        //личное сообшение


                        //сообщение всем
                        while (true) {
                            String msg = in.readUTF();
                            if (msg.equals("/end")) {
                                out.writeUTF("/serverClosed");
                                break;
                            }
                            if (msg.startsWith("/w")){
                                String[] tokensW = msg.split(" ", 3);
                                if (serv.isNickBusy(tokensW[1])) {
                                    serv.whisperMsg(tokensW[1], tokensW[2]);
                                    sendMsg(tokensW[1] + " шепчет: " + tokensW[2]);

                                } else {
                                    sendMsg("Данный пользователь не в сети");
                                }

                            } else {
                                serv.broadcastMsg(nick + ": " + msg);
                            }
                        }

                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            in.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        serv.unsubscribe(ClientHandler.this);
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMsg(String msg) {
        try {
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNick() {
       return nick;
    }
}
