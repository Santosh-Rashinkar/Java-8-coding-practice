package com.prowings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> evenNumbers = findEvenNumbers(numbers);

        System.out.println("List of Even Numbers : " + evenNumbers);
    }
        public static List<Integer>findEvenNumbers(List<Integer> numbers){
            return numbers.stream()
                    .filter(n -> n %2==0)
                    .collect(Collectors.toList());
        }
    }
