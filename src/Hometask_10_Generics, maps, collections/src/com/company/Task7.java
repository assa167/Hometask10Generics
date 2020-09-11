package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Task 7. Create HashMap<String, String> and add 10 pairs:
//        watermelon, berry;
//        banana, fruit;
//        cherry, berry;
//        pineapple, fruit;
//        melon, vegetable;
//        cranberry, berry;
//        apple, fruit;
//        iris, flower;
//        potato, vegetable;
//        carrot, vegetable;
//
//        Print the content of the map, each pair from a new line.
//        Example:
//        watermelon - berry;
//        cherry - berry;
public class Task7 {
    public static void main(String[] args) {
    HashMap<String, String> itHash = new HashMap<>();
    itHash.put("watermelon", "fruit" );
    itHash.put("banana", "fruit");
    itHash.put("cherry", "berry");
    itHash.put("pineapple", "fruit");
    itHash.put("melon", "vegetable");
    itHash.put("cranberry", "berry");
    itHash.put("apple", "fruit");
    itHash.put("iris", "flower");
    itHash.put("potato", "vegetable");
    itHash.put("carrot", "vegetable");
        Set<Map.Entry<String, String>> set = itHash.entrySet();
        for (Map.Entry<String, String> me : set) {
            System.out.println(me.getKey() + " - " + me.getValue() + ";");
            }
    }
}

