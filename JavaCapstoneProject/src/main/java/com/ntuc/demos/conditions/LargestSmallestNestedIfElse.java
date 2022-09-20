
package com.ntuc.demos.conditions;

import java.util.Scanner;

public class LargestSmallestNestedIfElse {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int val1 = sc1.nextInt();
        int val2 = sc1.nextInt();
        int val3 = sc1.nextInt();
        
        System.out.println("Largest number is    :: " + findLargest(val1, val2, val3));
        System.out.println("Smallest number is   :: " + findSmallest(val1, val2, val3));
    }
    
    public static int findLargest(int x, int y, int z)
    {
        int largest = 0;
        if(x >= y)
        {
            if(x >= z)
                largest = x;
            else
                largest = z;
        }
        else
        {
            if(y >= z)
                largest = y;
            else
                largest = z;
        }
        return largest;
    }
    public static int findSmallest(int x, int y, int z)
    {
        int smallest = 0;
        if(x <= y)
        {
            if(x <= z)
                smallest = x;
            else
                smallest = z;
        }
        else
        {
            if(y <= z)
                smallest = y;
            else
                smallest = z;
        }
        return smallest;
    }
}
