package com.practice.coding;

import java.util.concurrent.Callable;

public class LoanProcessing implements Callable {
    String customerName;

    public LoanProcessing(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String call() throws InterruptedException{
        System.out.println("Loan is Processing for " + customerName + "-" + Thread.currentThread().getName());
        Thread.sleep(2000);
        return "Loan Approved for " + customerName;
    }
}
