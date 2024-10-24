package com.prowings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("apple","banana","orange","banana","grape","apple","mango","orange","kiwi","apple");

        List<String> uniqueFruites = fruits.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique fruits : " + uniqueFruites);

        List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,20,40,60);

        removeDuplicatesElements(numbers);
    }

    public static void removeDuplicatesElements(List<Integer> nums){
        
        List<Integer> uniqueNumbers = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Unique Numbers : " + uniqueNumbers);
    }
}
