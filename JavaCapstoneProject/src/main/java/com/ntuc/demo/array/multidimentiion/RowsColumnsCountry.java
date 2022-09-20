package com.ntuc.demo.array.multidimentiion;

import java.util.Scanner;

public class RowsColumnsCountry {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        String[][] country = new String[4][2];
        String line = "";
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 2; col += 2) {
                System.out.println("Enter Country: ");
                country[row][col] = scan.next();
                System.out.println("Enter Capital of "+country[row][col]+" : ");
                country[row][col + 1] = scan.next();
            }
        }
        String heading = String.format("%-15s %-15s", "Country", "Capital\n_________________________\n");
        System.out.println(heading);
        for (int i = 0; i < 4; i++) {
            line = String.format("%-15s %-15s\n", country[i][0], country[i][1]);
            System.out.println(line);
        }
    }
}
