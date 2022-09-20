
package com.ntuc.demo.array;

import java.util.Arrays;

public class ArraySortUsingStaicMethod {
    static int[] num_arr = {1,2,3,4,6,5,8,7,9,0};
    
    public static void main(String args[]) {
        sort_array();
    }
    
    static void sort_array(){
        // Sorting array
        Arrays.sort(num_arr);
        for (int i = 0; i < num_arr.length; i++) {
            System.out.println(num_arr[i]);
        }
    }
}
