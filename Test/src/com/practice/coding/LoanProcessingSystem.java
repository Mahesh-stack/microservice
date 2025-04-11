package com.practice.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LoanProcessingSystem {
    public static void main(String[] args) throws Exception{

        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> fut = new ArrayList<>();
        String[] customers = {"John", "Emma", "David", "Sophia", "Chris"};

        Arrays.stream(customers).forEach(cut -> {
            LoanProcessing processing = new LoanProcessing(cut);
            Future<String> fr = executor.submit(processing);
            fut.add(fr);
        });

        for(Future<String> str : fut){
            System.out.println(str.get  ());
        }
    }
}
