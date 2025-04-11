package com.practice;

public class TestAccount {
    public static void main(String[] args) {
        Account a1 = new Account();
        WithDraw wd = new WithDraw(a1,12000.0);
        wd.start();

        Deposit d1 = new Deposit(a1,2000);
        d1.start();
    }
}
