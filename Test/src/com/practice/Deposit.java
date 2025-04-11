package com.practice;

public class Deposit extends Thread {

    Account a1;
    double amt;

    Deposit(Account a1, double amt){
        this.a1=a1;
        this.amt=amt;
    }
    @Override
    public void run(){
        a1.deposit(amt);
    }
}
