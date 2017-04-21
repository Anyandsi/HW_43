package com.company;

public class HelloThread extends Thread{

    public HelloThread() {
    }

    @Override
    public void run(){
        System.out.println("Hello, world !" + " " + currentThread().getName());
    }
}
