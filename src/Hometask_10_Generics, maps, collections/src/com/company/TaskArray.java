package com.company;
import java.lang.Math;
import java.util.Arrays;

//Create an array of 15 random integers from the segment [0;   9].
// Display the array on the screen. Count how many in the array of even
// elements and display this number on the screen on a separate line.
public class TaskArray {
    public static void main(String[] args) {
        int[] isArray = new int[15];
        for (int i = 0; i < isArray.length; i++) {
            isArray [i] = (int) (1 + Math.random() * 9);
        }
        for (int i = 0; i <isArray.length; i++){
            System.out.println(isArray[i]);
        }
    }
}