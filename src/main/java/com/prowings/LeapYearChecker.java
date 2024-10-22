package com.prowings;

import java.util.Scanner;
import java.util.function.Predicate;

public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year : ");

        int year = sc.nextInt();

        LeapYearChecker obj = new LeapYearChecker();

        Predicate<Integer> leapYearPredicate = y -> y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);

        obj.checkLeapYear(year);
       // obj.checkLeapYear1(year,leapYearPredicate);

        sc.close();
    }
    public void checkLeapYear(int year) {

        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public void checkLeapYear1(int year, Predicate<Integer>leapYearPredicate){
        if (leapYearPredicate.test(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
