package com.practice.coding;

public class Amazon {
    private String user;
    private String password;
    private String balance;

    public Amazon(String user, String password, String balance){
        this.user = user;
        this.password = password;
        this.balance = balance;
    }
    {
        System.out.println("Non static Menthod called");
    }
     void details(){
         System.out.println("Details : " +user+","+password+","+balance);
    }

    public static void main(String[] args) {
        Amazon a1 = new Amazon("Mahesh", "abgh2hq", "75000");
        a1.details();

        try {
            Amazon a2 = (Amazon) a1.clone();
            a2.details();
        }catch (CloneNotSupportedException clone){
            System.out.println(clone.getCause());
        }

    }

}
