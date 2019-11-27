package Lesson_4.Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainReg {
    public static void main(String[] args) {
        System.out.println(find("Java"));
        System.out.println(find("1Gava678"));
        System.out.println(find("Javadsadff"));
        System.out.println(find("Java8password"));
        System.out.println(find("123asd789Fgh1 31415"));
        System.out.println(find("123asd789Fgh13141513423Jk"));

    }

    public static boolean find (String str) {
//        Pattern pattern = Pattern.compile(".*\\d.*${4,20}");
        Pattern pattern = Pattern.compile("\\d|[a-z]|[A-Z]|.\\S{8,20}");
        Matcher matcher = pattern.matcher(str);

        return matcher.matches();
    }
}
