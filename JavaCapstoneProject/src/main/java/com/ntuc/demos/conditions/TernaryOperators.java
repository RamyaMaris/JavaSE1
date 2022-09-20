
package com.ntuc.demos.conditions;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String args[]) {
        Scanner value1 = new Scanner(System.in);
        int i = value1.nextInt();
//        Scanner value2 = new Scanner(System.in);
//        int j = value2.nextInt();
        
//        System.out.println(getBigger(10, 20));
//        System.out.println(getBigger(i, j));
        System.out.println(isEligibleVote(i));

    }

    public static int getBigger(int x, int y) {
        
        return x > y ? x : y; // usage of ternary operator
    }
    public static String isEligibleVote(int x)
    {
      return x >= 18 ? "You can Eligible to Vote" : "You are not Eligible to vote";
    }
}

