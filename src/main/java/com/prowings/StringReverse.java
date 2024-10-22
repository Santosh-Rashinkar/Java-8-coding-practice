package com.prowings;

import java.util.Arrays;

public class StringReverse {

    public String reverseString(String s){

        System.out.println("Given string is :" + s);

        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println("Reversed String is :" + sb);
        return new String(sb);
    }
    public String reverseString1(String s ){

        System.out.println("Given string is :" + s);

        StringBuffer sb = new StringBuffer();

        for(int i = s.length()-1;i>=0;i--){

            sb.append(s.charAt(i));
        }
        System.out.println("Reversed String is :" + sb);

        return new String(sb);
    }
    public static String reverseString2(String s){

        System.out.println("Given string is :" + s);

        char[] array = s.toCharArray();

        int counter =0;
        for(int i =s.length()-1;i >=0;i--){

            array[counter++] = s.charAt(i);
        }
        return new String(array);
    }
    public static void main(String[] args) {
        StringReverse sr = new StringReverse();
        sr.reverseString("Shree");
        sr.reverseString1("ShreeRam");
        System.out.println("after reverse : "+reverseString2("Krishna"));
    }

}
