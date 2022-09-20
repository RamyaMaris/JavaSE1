
package com.ntuc.demo.array.multidimentiion;

public class DrawShape {

    static String s="";

    public static void main(String args[]) {
        int rows = 20;
        int cols = 3;
        char[][] table = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                table[row][col] = '*';
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                s += " " + table[row][col];
            }
            System.out.println(s);
        }
    }
}
