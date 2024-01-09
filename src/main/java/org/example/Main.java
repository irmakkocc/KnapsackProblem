package org.example;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File inputFile=new File("ks_10000_0");
        Scanner scanner=new Scanner(inputFile);
        int value, weight;
        value = scanner.nextInt();
        weight = scanner.nextInt();

        ArrayList<Integer> val=new ArrayList<Integer>();
        ArrayList<Integer> wt=new ArrayList<Integer>();
        ArrayList<KnapsackItem> items=new ArrayList<>();

        int kapasite= 1000000;

        for (int i=0;i<value;i++){
            val.add(scanner.nextInt());
            wt.add(scanner.nextInt());
            items.add(new KnapsackItem(i+1, val.get(i),wt.get(i)));
        }


        FractionalKnapsack.knap(items,kapasite);
        scanner.close();


    }
}