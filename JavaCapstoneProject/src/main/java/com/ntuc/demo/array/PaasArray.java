
package com.ntuc.demo.array;
public class PaasArray {
    void PrintArray(int[] arr) {

    }
    public static void main(String args[]) {
        int[] arr = {1, 2, 3,};
        PaasArray pa = new PaasArray();
        pa.PrintArray(arr);
        int[] arr1 = pa.maxOFArray();
        ShowElements(arr);
    }
    int[] maxOFArray() {
        int[] arr = new int[2];
        PrintArray(arr);
        return arr;
    }
    static void ShowElements(int[] arr){
        PaasArray pa = new PaasArray();
        pa.PrintArray(arr);
    }
    
}

