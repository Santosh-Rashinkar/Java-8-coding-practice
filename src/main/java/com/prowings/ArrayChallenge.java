//package com.prowings;
//
//import java.util.Arrays;
//
//public class ArrayChallenge {
//
//    public static String arrayChallenge(int[] arr){
//        Arrays.sort(arr);
//
//        int largest = arr[arr.length - 1];
//
//        int[] rest = Arrays.copyOfRange(arr, 0, arr.length - 1);
//
//        if (canSum(rest, largest, rest.length)) {
//            return "true";
//        }
//
//        return "false";
//    }
//    private static boolean canSum(int[] arr, int target, int n) {
//        // Base cases
//        if (target == 0) return true;
//        if (n == 0 && target != 0) return false;
//
//        // Exclude the last element and check the remaining elements
//        if (arr[n - 1] > target) {
//            return canSum(arr, target, n - 1);
//        }
//
//        // Include or exclude the last element
//        return canSum(arr, target - arr[n - 1], n - 1) || canSum(arr, target, n - 1);
//    }
//    public static void main(String[] args) {
//        // Test cases
////        int[] arr1 = {5, 7, 16, 1, 2};
////        System.out.println(arrayChallenge(arr1)); // Output: false
//
//        int[] arr2 = {3, 5, -1, 8, 12};
//        System.out.println(arrayChallenge(arr2)); // Output: true
//    }
//}


package com.prowings;

import java.util.Arrays;

public class ArrayChallenge {

    public static String arrayChallenge(int[] arr){
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];

        int[] rest = Arrays.copyOfRange(arr, 0, arr.length - 1);

        if (canSum(rest, largest, rest.length)) {
            return "true";
        }

        return "false";
    }
    private static boolean canSum(int[] arr, int target, int n) {
        // Base cases
        if (target == 0) return true;
        if (n == 0 && target != 0) return false;

        // Exclude the last element and check the remaining elements
        if (arr[n - 1] > target) {
            return canSum(arr, target, n - 1);
        }

        // Include or exclude the last element
        return canSum(arr, target - arr[n - 1], n - 1) || canSum(arr, target, n - 1);
    }

    public static void main(String[] args) {
        // Test case 1
        int[] arr1 = {5, 7, 16, 1, 2};
        System.out.println(arrayChallenge(arr1)); // Output: false

        // Test case 2
        int[] arr2 = {3, 5, -1, 8, 12};
        System.out.println(arrayChallenge(arr2)); // Output: true
    }
}
