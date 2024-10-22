package com.prowings;

 class A {

public static void m1(){
    System.out.println("Parent------M1");
  }
}
class B extends A {

    public static void m1(){

        System.out.println("Child------M1");
    }
}
public class StaticMethodScinario{
     public static void main(String[] args){
        A a1 = new B();
        B b1 = new B();
        A a = new A();

        a1.m1();

        b1.m1();

        a.m1();
     }
}



