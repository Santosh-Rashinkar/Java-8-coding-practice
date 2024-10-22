package com.prowings;

import java.util.stream.Stream;

public class FibonacciSeries {
    int numberOfTerms = 8;

    public static void main(String[] args) {
        FibonacciSeries fb = new FibonacciSeries();

        fb.printFibonacci(fb.numberOfTerms);
        fb.printFibonacci((short) fb.numberOfTerms);
    }

    public void printFibonacci(int number) {

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series up to " + number + " terms using simple way ");

        for (int i = 0; i < number; ++i) {
            System.out.print(a + " ");

            int c = a + b;

            a = b;

            b = c;
        }
        System.out.println();
    }

    public void printFibonacci(short num) {

        System.out.println("Fibonacci Series up to " + num + " terms using java 8 :");

        Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(num)  // Use the method parameter instead of numberOfTerms
                .map(n -> n[0])
                .forEach(n -> System.out.print(n + " "));

        System.out.println();  // To add a line break after the series
    }
}
