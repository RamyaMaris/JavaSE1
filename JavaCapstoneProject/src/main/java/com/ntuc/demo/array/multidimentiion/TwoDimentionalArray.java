
package com.ntuc.demo.array.multidimentiion;

public class TwoDimentionalArray {
    public static void main(String args[]) {
        int[][] arr = {{1, 2}, {3, 4, 5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "
                        + arr[i][j]);
            }
        }
    }
}
