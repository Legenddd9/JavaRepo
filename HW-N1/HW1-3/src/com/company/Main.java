package com.company;

import java.awt.*;
import java.util.*;
import java.util.List;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getLength;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = scanner.nextInt();
        System.out.print("Enter number b: ");
        int b = scanner.nextInt();

        int[] randInts = new int[40];
        int[] evenInts = new int[40];
        int[] oddInts = new int[40];

        Random rand = new Random();

        for (int i=0 ; i<40 ; i++){
            int randomNum = 0;
            if (a > b){
                 randomNum = rand.nextInt((a - b) + 1) + b;
            }
            else if (a < b ){
                randomNum = rand.nextInt((b - a) + 1) + a;
            }
            randInts[i] = randomNum;
        }

        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : randInts)
        {
            if (num % 2 == 0){
                evenInts[evenIndex] = num;
                evenIndex++;
            }
            else {
                oddInts[oddIndex] = num;
                oddIndex++;
            }
        }
        System.out.println();
        System.out.println("Evens count = "+count(evenInts));
        System.out.println("Odds count = "+count(oddInts));

        int evenSum = GetSumArray(evenInts);
        int oddSum = GetSumArray(oddInts);

        System.out.println();
        System.out.println("evenSum = " + evenSum);
        System.out.println("oddSum = " + oddSum);
        System.out.println();


        for (int i=0 ; i<5 ; i++){
            int evenoddRandom = 0;
            if (evenSum > oddSum){
                evenoddRandom = rand.nextInt((evenSum - oddSum) + 1) + oddSum;
            }
            else if (evenSum < oddSum ){
                evenoddRandom = rand.nextInt((oddSum - evenSum) + 1) + evenSum;
            }
            System.out.println("evenoddRandom = " + evenoddRandom);
        }

    }


    private static int count(int[] array)
    {
        int count = 0;
        for(int i : array)
        {
            if(i > 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int GetSumArray(int[] intarr){
        int count = 0;
        for (int num : intarr){
            count+=num;
        }
        return count;
    }


}

