package com.company;


import java.util.*;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeMap.size;

//Task 6. Create ArrayList of Strings. Add 10 different Strings to it.
//        Using any cycle find the longest String in the list and print it out.
//        If there are several String with the same legth - print each from a new line.
//
//        1) Create ArrayList of String and initialize it.
//        2) All values with the highest length should be printed out.
//??
public class Task6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Jango");
        list.add("Micky");
        list.add("Ben");
        list.add("Margo");
        list.add("Nikolas");
        list.add("Veneamin");
        list.add("Nick");
        list.add("Rock");
        list.add("Arnold");
        list.add("Zerro");

       list = list.stream().sorted().collect(Collectors.toList());
       int maxLen = list.get(list.size()-1).length();
       for ();  //записать for each который проходится по всему массиву и выделяет с самой длинной строчкой






    }


}


