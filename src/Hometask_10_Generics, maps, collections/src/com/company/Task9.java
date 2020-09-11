package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


//Task9. Create ArrayList<Integer> and add 100 random numbers (Use Math.random()).
//        Create HashSet<Integer> and add all unique numbers from the ArrayList.
// не знаю как вторую часть сделать hash set
public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        int o = 0;
        for (int i = 0; i < 100; i++) {
            o = rand.nextInt(100);
            list.add(o);
        }
        System.out.println(list);

//        HashSet<list> Hash = new HashSet<>();
//        System.out.println(Hash);
//        Hash.add(o);
//        System.out.println(Hash);


    }
}