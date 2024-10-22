package com.prowings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramChecker {
    public  static void main(String[] args){

        String str1 = "listen";
        String str2 = "silent";

        boolean result = isAnagram(str1, str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);


        boolean result1 = areAnagram1(str1,str2);
        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result1);
    }
        public static boolean isAnagram(String str1, String str2) {
            if (str1 == null || str2 == null) {
                return false;
            }

            String sortedStr1 = str1.chars()
                    .sorted()
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining());
            String sortedStr2 = str2.chars()
                    .sorted()
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(Collectors.joining());

            return sortedStr1.equals(sortedStr2);

        }
        public static boolean areAnagram1(String str1, String str2) {

        if(str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
            str1= str1.toLowerCase();
            str2= str2.toLowerCase();

        if(str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }
}