package com.prowings;

import java.util.Arrays;
import java.util.List;

public class EvenNumber {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("EVEN Number in the list: ");
        printEvenNumbers(numbers);

        printEvenNumbersUsingJava8(numbers);
    }
        public static void printEvenNumbers(List<Integer> numbers){
            for(Integer number : numbers){

                if(number % 2 == 0){
                    System.out.println(number);
                }
            }
        }
        public static void printEvenNumbersUsingJava8(List<Integer> numbers){

            System.out.println("This Method is print even Number using java 8 stream");

              numbers.stream().filter(number -> number % 2 == 0).forEach(System.out:: println);

        }


}
