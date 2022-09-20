
package com.ntuc.demo.methods;
public class VarArgsArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        VarArgsArray var = new VarArgsArray();
        var.showNums(10,20,30,40);
        int[] arr = {10,20,30,40};
        var.showNums(arr);
    }
    
    void showNums(int... x){
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}