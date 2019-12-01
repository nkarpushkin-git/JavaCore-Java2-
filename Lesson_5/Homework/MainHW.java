package Lesson_5.Homework;


import java.util.regex.Matcher;

public class MainHW {
    public final int SIZE = 10000000;
    public final int HALF = SIZE / 2;
    public float[] arr = new float[SIZE];
    public long a = System.currentTimeMillis();

    public static void main(String[] args) {
        MainHW treadsTest = new MainHW();

//        treadsTest.oneTread();
//        treadsTest.twoTreads();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                treadsTest.oneTread();

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                treadsTest.secondTread();

            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                treadsTest.thirdTread();

            }
        });



        t1.start();

        t2.start();
        t3.start();

        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    public void oneTread() {
        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }

//            long a = System.currentTimeMillis();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
                for (int i = 0; i < SIZE; i++) {
                    arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }

                System.out.println("One: " + (System.currentTimeMillis() - a));
            }
//        }).start();



//    public void twoTreads() {
//        for (int i = 0; i < SIZE; i++) {
//            arr[i] = 1;
//        }
//
//        long a = System.currentTimeMillis();
//
//        int h = HALF;
//
//        float[] a2 = new float[h];

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                float[] a1 = new float[h];
//                System.arraycopy(arr, 0, a1, 0, h);
//
//                System.out.println("Two1: " + (System.currentTimeMillis() - a));
//
//                for (int i = 0; i < h; i++) {
//                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//
//                }
//                System.arraycopy(a1, 0, arr, 0, h);
//                System.out.println("Two1.1: " + (System.currentTimeMillis() - a));
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//                System.arraycopy(arr, h, a2, 0, h);
//                System.out.println("Two2: " + (System.currentTimeMillis() - a));
//                for (int i = 0; i < h; i++) {
//                    a2[i] = (float) (a2[i] * Math.sin(0.2f + 1 / 5) * Math.cos(0.2f + 1 / 5) * Math.cos(0.4f + 1 / 2));
//                }
//
//
//                System.arraycopy(a2, 0, arr, h, h);
//
//
//                System.out.println("Two2.2: " + (System.currentTimeMillis() - a));
//            }

//        }).start();


    public void secondTread() {
        int h = HALF;
        for (int i = 0; i < h; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();



                float[] a1 = new float[h];
                System.arraycopy(arr, 0, a1, 0, h);

                System.out.println("Second.1: " + (System.currentTimeMillis() - a));

                for (int i = 0; i < h; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));

                }
                System.arraycopy(a1, 0, arr, 0, h);
                System.out.println("Second.2: " + (System.currentTimeMillis() - a));
            }


    public void thirdTread() {
        int h = HALF;
        for (int i = h; i < SIZE; i++) {
            arr[i] = 1;
        }


        float[] a2 = new float[h];
                System.arraycopy(arr, h, a2, 0, h);
                System.out.println("Third.1: " + (System.currentTimeMillis() - a));
                for (int i = 0; i < h; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + 1 / 5) * Math.cos(0.2f + 1 / 5) * Math.cos(0.4f + 1 / 2));
                }


                System.arraycopy(a2, 0, arr, h, h);


                System.out.println("Third.2: " + (System.currentTimeMillis() - a));
            }

    }
//    }




