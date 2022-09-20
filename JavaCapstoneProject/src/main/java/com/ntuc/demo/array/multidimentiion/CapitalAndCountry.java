
package com.ntuc.demo.array.multidimentiion;

import java.util.Scanner;

//Sridhar sir code..

public class CapitalAndCountry {
    static String s = "";

    static Scanner scan = new Scanner(System.in);

    public static void main(String args[]) {
        int rows = 3;
        int cols = 2;
        String[][] table = new String[rows][cols];

        for (int country = 0; country < rows; country++) {
                            System.out.println("Enter Country and capital:" );
            for (int captital = 0; captital < cols; captital++) {
                table[country][captital] = String.format("%-15s", scan.next());
            }
        }

        String head = String.format("%-10s %-10s", "Country", "Capital");
        System.out.println(head);
        System.out.println("--------------------------------");
        for (int country = 0; country < rows; country++) {
            for (int capital = 0; capital < cols; capital++) {
                s = s + table[country][capital];
            }
            
            System.out.println("[" +s +"]");
//            System.out.println(s);
//            System.out.println("]");
            s = "";
        }
    }
}
