package com.company;
import java.util.Scanner;

//10. Create enum for days of the week.
//        Write a program which will be printing the number of a day according to day of the week.
//        Example:
//        If today is Sunday - print 1;
//        If today is Monday - print 2
//        ...
// 1) Use switch(day of the week) to pass the day of the week.

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести день недели");
        String day = scanner.next();
        Day d = Day.valueOf(day);
        switch (d) {
            case SUNDAY:
                System.out.println("1");
                break;
            case MONDAY:
                System.out.println("2");
                break;
            case TUESDAY:
                System.out.println("3");
                break;
            case WEDNESDAY:
                System.out.println("4");
                break;
            case THURSDAY:
                System.out.println("5");
                break;
            case FRIDAY:
                System.out.println("6");
                break;
            case SATURDAY:
                System.out.println("7");
                break;
            default:
                System.out.println("Введенного дня не существует");

        }
    }

        enum Day {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY

        }

}