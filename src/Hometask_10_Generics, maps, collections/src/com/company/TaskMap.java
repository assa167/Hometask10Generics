package com.company;
import java.util.HashMap;
import java.util.Map;

//Task 3. Create Map vehicles: vehicles.put("BMW", 5); print.
public class TaskMap {
    public static void main(String[] args) {
        Map<String, Integer>carMap = new HashMap<>();
        carMap.put("BMW", 5);
        carMap.put("Audi", 8);
        carMap.put("Jaguar", 1);
        System.out.println(carMap);
    }
}
