package com.practice;

public class WithDraw extends Thread {

    Account a1;
    double amt;

    WithDraw(Account a1, double amt) {
        this.a1 = a1;
        this.amt = amt;
    }

    @Override
    public void run(){
        a1.withDraw(amt);
    }
}
