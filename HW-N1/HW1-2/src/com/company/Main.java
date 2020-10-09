package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var classA = new A();
        classA.Method1();
        classA.Method2();
        classA.Method3();

        var classB = new B();
        classB.Method1();
        classB.Method2(classA.x);
    }
}

class A{
    public A() {
        System.out.println("Hello Java");
    }

    public int x;

    public void Method1(){
        System.out.println("Class A Method1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number x: ");
        x = scanner.nextInt();
        System.out.println("x = " + x);
        System.out.println();
    }

    public void Method2(){
        System.out.println("Class A Method2");
        System.out.println("x + 12 = "+(x+12));
        System.out.println();
    }

    public void Method3(){
        System.out.println("Class A Method3");
        if (x % 2 == 0)System.out.println("the x is even");
        else System.out.println("the x is odd");
        System.out.println();
    }
}

class B extends A{
    public int y;

    public void Method1(){
        System.out.println("Class B Method1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number y: ");
        y = scanner.nextInt();
        System.out.println("y = " + y);
        System.out.println();
    }

    public void Method2(int x){
        System.out.println("Class B Method2");
        System.out.println("x + y = "+(x + y));
    }
}