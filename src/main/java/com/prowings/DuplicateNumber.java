package com.prowings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateNumber {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 5, 6, 7};
        int[] arr2 = {3, 6, 7, 8, 20};

        DuplicateNumber dn = new DuplicateNumber();

        int[] duplicateNumbers = dn.findDuplicates(arr1, arr2);

        System.out.print("Duplicates: ");

        for(int num : duplicateNumbers){
            System.out.print(num + " ");
        }
    }
    public int[] findDuplicates(int[] arr1,int[] arr2 ){

        if(arr1 == null || arr2 == null){
            return new int[0];
        }

        Set<Integer> set = new HashSet<>();
        List <Integer> duplicates = new ArrayList<>();

        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num)){
                duplicates.add(num);
            }
        }
        int [] duplicateNumbers = new int[duplicates.size()];

        for(int i = 0; i < duplicates.size();i++){
            duplicateNumbers[i] = duplicates.get(i);
        }
        return duplicateNumbers;
    }
}
