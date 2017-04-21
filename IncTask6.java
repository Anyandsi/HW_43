package com.company;

import static com.company.Main.notSynchInc;

public class IncTask6 extends Thread{

    @Override
    public void run(){
        notSynchInc();
    }

}
