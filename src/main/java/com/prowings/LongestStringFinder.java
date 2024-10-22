package com.prowings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringFinder {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("apple", "banana", "orange", "kiwi", "watermelon", "grape");

        String longestString = strings.stream().max(Comparator.comparingInt(String :: length)).orElse(null);

        System.out.println("Longest String : " + longestString);

    }
}
