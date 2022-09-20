
package com.ntuc.demo.array;

public class ArrayMaxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,21};
        System.out.println(finMax(arr));
    }
    static int finMax(int[] a)
    {
        int maxval = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > maxval)
                maxval = a[i];
        }
        return maxval;
    }
}
