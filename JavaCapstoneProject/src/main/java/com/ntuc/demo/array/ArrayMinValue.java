
package com.ntuc.demo.array;

public class ArrayMinValue {
    public static void main(String[] args) {
        int[] arr = {1,0,-3,-4,5,6,7,21};
        System.out.println(finMin(arr));
    }
    static int finMin(int[] a)
    {
        int minval = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i] < minval)
                minval = a[i];
        }
        return minval;
    }
}
