package com.practice;

public class Account {
    double accBal = 10000.00;

    synchronized void withDraw(double amount) {
        System.out.println("Available balance is :: " + accBal);
        System.out.println("Withdrawing amount is  ::" + amount);
        if (accBal < amount) {
            System.out.println("Insufficient Balance");
            System.out.println("Waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception is running");
            }
        }
        accBal = accBal - amount;
        System.out.println(amount + "Amount withdrawn successfully");
        System.out.println("New Available Balance is ::" + accBal);
    }

    public void deposit(double amt) {

        System.out.println("Available balance is before deposit::" + accBal);
        System.out.println("Amount to be deposited ::" + amt);
        accBal = accBal + amt;

        System.out.println("Amount deposited successfully");
        System.out.println("New Available balance is ::" + accBal);
    }
}
