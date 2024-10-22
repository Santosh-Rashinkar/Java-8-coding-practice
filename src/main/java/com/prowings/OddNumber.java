package com.prowings;

import java.util.Arrays;
import java.util.List;

public class OddNumber {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        CheckAndPrintOddNumber(numbers);

        List<Integer> list1 = Arrays.asList(11,12,13,14,15,16,17,18,19,20);
        printOddNumbersUsingStream(list1);
    }
    public static void CheckAndPrintOddNumber(Integer[] numbers){

        System.out.println("odd number in the list");

        for(Integer number : numbers){
            if(number % 2 != 0){
                System.out.println(number);
            }
        }
    }
    public static void printOddNumbersUsingStream(List<Integer> numbers){

        System.out.println("This Method is print odd Number using java 8 stream");

        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out:: println);
    }
}
