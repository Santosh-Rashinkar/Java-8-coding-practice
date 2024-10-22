package com.prowings;

public class PalindromeChecker {

    public static void main(String[] args){
        PalindromeChecker pc = new PalindromeChecker();
        pc.palindromeCheck("RADAR");
    }

    public void palindromeCheck(String s){

        String reverseString = "";
        for(int i =s.length()-1;i>=0;i--){

            reverseString = reverseString + s.charAt(i);
        }
        if(s.equals(reverseString)){
            System.out.println("IS PALINDROME ");
        }
        else{
            System.out.println("IS NOT PALINDROME");
        }
    }
}