package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        var classC = new C();

        classC.Method1();
        classC.Method2();
        classC.Method3();
        classC.Method4();
        classC.Method5();
        classC.Method6();
    }
}

class C{
    public int a;
    public int b;
    public int c;

    private char method2;
    private char method3;
    private int method5;

    public void Method1() throws IOException {
        System.out.println("Method N1");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number a: ");
        a = in.nextInt();

        System.out.print("Enter a number b: ");
        b = in.nextInt();

        System.out.print("Enter a number c: ");
        c = in.nextInt();
        System.out.println();
    }

    public void Method2(){
        System.out.println("Method N2");
        String aStr = String.valueOf(a);
        System.out.println("Last number of a is - " + aStr.charAt(aStr.length()-1));
        method2 = aStr.charAt(aStr.length()-1);
        System.out.println();
    }

    public void Method3(){
        System.out.println("Method N3");
        String bStr = String.valueOf(b);
        System.out.println("First number of b is - " + bStr.charAt(0));
        method3 = bStr.charAt(0);
        System.out.println();
    }
    public void Method4(){
        System.out.println("Method N4");
        int sum = 0;
        while (c > 0) {
            sum = sum + c % 10;
            c = c / 10;
        }
        System.out.println("Sum Of Digits of c - "+sum);
        System.out.println();
    }
    public void Method5(){
        System.out.println("Method N5");
        int meth2 = Character.getNumericValue(method2);
        int meth3 = Character.getNumericValue(method3);
        method5 = meth2 * meth3;
        System.out.println("Sum Of Second And Third Methods Output - "+meth2 * meth3);
        System.out.println();
    }
    public void Method6(){
        System.out.println("Method N6");
        int meth3 = Character.getNumericValue(method3);
        System.out.println("Sum Of Third And Third Fifth Output - "+meth3 + method5);
        System.out.println();
    }
}