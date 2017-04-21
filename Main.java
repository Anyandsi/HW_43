package com.company;

public class Main {

    public static void main(String[] args){
        //printFiveTimes();
        //printCounts();
        //testJoin();
        //task6(); doesn't synchronized
        //task7(); synchronized
    }

    private static int number = 10;

    // #1 - HelloThread.java

    // #2 ----------------------------------------------------------------------------------------
    public static void printFiveTimes(){
        HelloThread thread1 = new HelloThread();
        HelloThread thread2 = new HelloThread();
        HelloThread thread3 = new HelloThread();
        HelloThread thread4 = new HelloThread();
        HelloThread thread5 = new HelloThread();

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    // #3 - CounterThread.java

    // #4 ----------------------------------------------------------------------------------------

    public synchronized static void printCounts(){
        CounterThread thread1 = new CounterThread(1, 4, 23, "T1");
        CounterThread thread2 = new CounterThread(8, 2, 34, "T2");
        CounterThread thread3 = new CounterThread(0, 13, 103, "T3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

    // #5 ----------------------------------------------------------------------------------------
    public static void testJoin(){
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println(currentThread().getName() + " started");

                for (int i = 0; i < 5; i++) {
                    System.out.println("Множественный вывод");
                }

                System.out.println(currentThread().getName() + " finished");

            }
        };

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // #6 ----------------------------------------------------------------------------------------

    public static void notSynchInc(){
        for(int i = 0; i < 1000; i++){
            Main.number += 1;
        }
        System.out.println(Main.number + " " + Thread.currentThread().getName());
    }


    public static void task6(){
       new IncTask6().start();
       new IncTask6().start();
    }

    // #7 ----------------------------------------------------------------------------------------
    public synchronized static void synchInc(){
        for(int i = 0; i < 1000; i++){
            Main.number += 1;
        }
        System.out.println(Main.number + " " + Thread.currentThread().getName());
    }

    private static void task7() {
        new IncTask7().start();
        new IncTask7().start();
    }
}
