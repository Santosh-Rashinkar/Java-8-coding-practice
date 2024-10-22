package com.prowings;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        MergeArrays obj = new MergeArrays();

        int[] mergedArray = obj.mergedArrays(arr1,arr2);

        System.out.println("Merged Array : " + Arrays.toString(mergedArray));
    }
    public int[] mergedArrays(int[] arr1,int[]arr2){

        int[] merged = new int [arr1.length + arr2.length];

        System.arraycopy(arr1,0,merged,0,arr1.length);

        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);

        return merged;
    }


}
