package com.prowings;

import java.util.Arrays;

public class SortArray {

    public static int[] sortArray(int[] arr){

        int[] sortedArray = arr.clone();

        for(int i =0; i < sortedArray.length-1;i++){
            for(int j = 0; j < sortedArray.length-1 -i;j++){
                if(sortedArray[j] > sortedArray[j +1 ]){
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j +1];
                    sortedArray[j +1] = temp;
                }
            }
        }
        return sortedArray;
    }
    public static int[] selectionSort(int[] arr) {

        int [] sortedArray = arr.clone();

        for(int i = 0; i < sortedArray.length-1;i++){
            int minIndex = i;
            for(int j = i + 1 ; j <sortedArray.length;j++){
                if(sortedArray[j] < sortedArray[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[minIndex];
                sortedArray[minIndex] = temp;
            }
        }
        return sortedArray;
    }
        public static void main(String[] args) {

        int[] numbers = {10,40,60,20,50,30,70};
        int [] sortedNumbers = sortArray(numbers);
        System.out.println("Sorted Array : " + Arrays.toString(sortedNumbers));

        int[] nums = {9,2,5,8,6,3,7,1,4};
        int[] sortedNumbs1 = selectionSort(nums);
        System.out.println("Sorted Array : "+ Arrays.toString(sortedNumbs1));

    }
}
