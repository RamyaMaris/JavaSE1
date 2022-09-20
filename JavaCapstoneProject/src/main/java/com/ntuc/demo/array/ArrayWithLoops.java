
package com.ntuc.demo.array;

public class ArrayWithLoops {
    public static void main(String[] args) {
        ArrayWithLoops awl = new ArrayWithLoops();
        awl.arrayLoops();
        
    }
    void arrayLoops(){
        int[] intArray = new int[15];
        String[] strArray = new String[10];
        
        //Intializing the value in IntegerArray using loop
        for(int i =0; i< 15; i++){
            intArray[i] = i + 10;
        }
        
        //Read values from Integer Array using loops
        for(int i = 0; i<15; i++)
        {
            System.out.println("Element at index "+i + "is " + intArray[i]);
        }
        System.out.println("----------------------");
        //Intializing the value in StringArray using loop
        for(int i =0; i< 10; i++){
            strArray[i] = "Hello " + i;
        }
        
        //Read values from String Array using loops
        for(int i = 0; i<10; i++)
        {
            System.out.println("Element at index "+i + "is " + strArray[i]);
        }
    }
}
