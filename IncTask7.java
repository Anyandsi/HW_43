package com.company;

import static com.company.Main.synchInc;

public class IncTask7 extends Thread{

    @Override
    public void run(){
        synchInc();
    }

}
