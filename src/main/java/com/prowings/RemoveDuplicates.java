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
    }
}
