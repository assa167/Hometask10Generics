package com.company;
import java.time.DayOfWeek;

//Task 2. Create ENUM and print.
public class TaskEnum {
    public static void main(String[]args){
        Day current = Day.TUESDAY;
        System.out.println(current);
    }

}
enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

