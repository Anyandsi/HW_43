package com.company;

public class CounterThread extends Thread{
    protected int start;
    protected int step;
    protected int end;
    protected String str;

    public CounterThread(int start, int step, int end, String str) {
        this.start = start;
        this.step = step;
        this.end = end;
        this.str = str;
    }

    @Override
    public void run(){
        for (int i = start; i < end; i+= step) {
            System.out.println(i + " " + str);
        }
    }
}
