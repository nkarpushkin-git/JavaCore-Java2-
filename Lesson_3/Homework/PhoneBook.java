package Lesson_3.Homework;

import java.util.*;


public class PhoneBook {
    //
    public PhoneBook() {

        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        ArrayList<String> phoneNum = new ArrayList<>();


        phoneBook.put("Ivanov", null);
        phoneBook.put("Petrov", null);
        phoneBook.put("Sidorov", null);

//        phoneNum.add("1521");
//        System.out.println(phoneNum);
        // phoneBook.put("Ivanov", "1233");



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

        phoneBook.get("Ivanov").add("12435");

//        phoneBook.get("Ivanov").add(12435);
//
//        public String add (String tel) {
//            return phoneNum.add(tel);
//        }
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
