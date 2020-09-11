package com.company;
import java.util.ArrayList;

//Task 5. Create ArrayList of Strings. Add 5 different Strings to it.
//Using any cycle print all the values of the ArrayList to the console.
public class TaskArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("Red");
        list.add("Blue");
        printArray(list);

        System.out.println("Количество строк: " + list.size());
        //System.out.println(list);  //выводит в 1 строчку
            }

    private static void printArray(ArrayList<String> list) {
        System.out.println(list.get(0) +"\n" + list.get(1) + "\n" + list.get(2) +"\n" + list.get(3) +"\n"  + list.get(4) +"\n");
    }


}
