package com.prowings;

import java.util.Scanner;

public class PrimeChecker {
     public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
        int number = sc.nextInt();
        checkAndPrintPrime(number);
     }
    public static void checkAndPrintPrime(int number){

         boolean result = isPrime(number);
         System.out.println(number +(result ? " : is a prime number" : " is not a prime number"));
    }
    public static boolean isPrime(int num){

        if(num < 1) return false;
        if(num == 2) return true;
        if(num % 2 ==0) return false;

        int divisor = 2;
        while(divisor * divisor <= num){

            if(num % divisor == 0 )return false;
            divisor++;
        }
        return true;
    }
}