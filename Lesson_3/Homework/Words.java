package Lesson_3.Homework;

import java.util.*;

public class Words {

        public Words() {
            ArrayList<String> wrdList = new ArrayList<>();
            //System.out.println(wrdList.size());
            wrdList.add("word1");
            wrdList.add("word2");
            wrdList.add("word3");
            wrdList.add("word4");
            wrdList.add("word5");
            wrdList.add("word6");
            wrdList.add("word7");
            wrdList.add("word8");
            wrdList.add("word9");
            wrdList.add("word10");
            wrdList.add("word1");
            wrdList.add("word12");
            wrdList.add("word3");
            wrdList.add("word14");
            wrdList.add("word15");
            wrdList.add("word16");
            wrdList.add("word7");
            wrdList.add("word18");
            wrdList.add("word19");
            wrdList.add("word20");
            // System.out.println(list.size());
            System.out.println(wrdList);

//        Iterator<String> iter = wrdList.iterator();

        Map<String, Integer> hmList = new HashMap<>();

        for (int i = 0; i < (wrdList.size()-1); i++) {


            Iterator<String> iter = wrdList.iterator();
        int sum = 0;
        String tmp = wrdList.get(i);
        while (iter.hasNext()) {
            if (iter.next().equalsIgnoreCase(tmp)) {
                sum++;
            }
        }
//            int sum = 0;
//            if (!wrdList.get(i).equals(0)) {
//                sum++;
//            }
            hmList.put(wrdList.get(i), sum);
//            iter.hasNext() {
                //int i = 0;
                //for (int i = 0; i < (wrdList.size()-1); i++) {
//                if () {
//                    sum++;
//                    hmList.put(wrdList.get(i), sum);
//                    //iter.remove();
//                }

//            }
        }
            System.out.println(hmList);
//
//    }

    }
}
