package com.prowings;
import java.util.Scanner;

public class CheckNumber{
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");

        int num = sc.nextInt();

        CheckNumber c = new CheckNumber();
        c.checkNumber(num);

        sc.close();
    }
    public  void checkNumber(int number) {

        if(number > 0){
            System.out.println("Positive Number");
        } else if (number < 0) {
            System.out.println(" Nigative Number");
        } else {
            System.out.println("Zero");
        }
    }
}