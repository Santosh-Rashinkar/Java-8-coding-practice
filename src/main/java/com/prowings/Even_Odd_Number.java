package com.prowings;

public class Even_Odd_Number {

    private int limit;
    private int number = 1;
    private boolean isOdd = true;

    public Even_Odd_Number(int limit)
    {
        this.limit = limit;
    }
    public synchronized void printOdd() {

        while (number <= limit) {
            while (!isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number <= limit) {

                System.out.println("Odd Thread : " + number);
                number++;
                isOdd = false;
                notify();
            }

        }
    }
    public synchronized void printEven() {

        while (number <= limit) {
            while (isOdd) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            if (number <= limit) {
                System.out.println("Even Thread : " + number);
                number++;
                isOdd = true;
                notify();
                }
            }
        }
    public static void main(String[] args) {
        int limit = 100;
        Even_Odd_Number obj1 = new Even_Odd_Number(limit);

        Thread  t1 = new Thread(() -> obj1.printOdd(),"Odd-Thread");
        Thread  t2 = new Thread(() -> obj1.printEven(),"Even-Thread");

        t1.start();
        t2.start();

    }
}