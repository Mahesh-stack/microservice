package com.practice;

public class Threading {
    public static void main(String[] args) {

        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.start();
        d2.start();
        d3.start();

        System.out.println(d1.getName()+d1.getId()+d1.getState());
        System.out.println(d2.getName()+d2.getId()+d2.getState());
        System.out.println(d3.getName()+d3.getId()+d3.getState());


    }
}
