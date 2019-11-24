package Lesson_3.Homework;

/**
 * Задание:
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
 * из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 * 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.*;


public class MainHW3 {
    public static void main(String[] args) {

        Words words = new Words();
        System.out.println(words);
        //phoneBook
//
        // public void PhoneBook() {

        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> Ivanov = new ArrayList<>();

        Ivanov.add("123215646");
//            phoneNum.add("1222");
//        phoneNum.add("1521");
//        phoneBook.get(name).add(pNum);
//        System.out.println(phoneNum);
       // phoneBook.put("Ivanov", "1233");
        phoneBook.put("Petrov", null);
        //phoneBook.get("Ivanov").add("2311231");
        //phoneBook.put("Sidorov", phoneBook.get().add("123"));

//        phoneBook.get(name).add(phoneNum);


//            phoneBook.put("Иванов", phoneNum.add("12"));
//            phoneBook.put("Петров", "222");
//            phoneBook.put("Сидоров", "111");
//            phoneBook.put("Дятлов", "333");
//            phoneBook.put("Кутузов", "444");
//            phoneBook.put("Маслов", "555");
//            phoneBook.put("Бойко", "777");
//            phoneBook.put("Имершвили", "666");

        System.out.println(phoneBook);

        //  phoneBook.get(name).add(pNum);


//         Iterator<String> iter = states.iterator();
//
//        while (iter.hasNext()) {
//            if (iter.next().equalsIgnoreCase("Германия")) {
//                iter.remove();
//            }
//        }

//   Random random = new Random();
//        Map<String, Integer> hm = new HashMap<>();

//        for (int i = 0; i < 100; i++) {
//            int num = random.nextInt(10);
//            Integer res = hm.get(num);
//            hm.put(num, res == null ? 1 : res + 1);
    }
}





