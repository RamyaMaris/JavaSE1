
package com.ntuc.demo.array;

public class ArrayDeclare {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Declaration of an Array
        int[] intArray = new int[5];
        String[] strArray = new String[6];
        
        //Initializing an integer Array
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;
        intArray[4] = 5;
        
        strArray[0] = "India";
        strArray[1] = "Singapore";
        strArray[2] = "Malaysia";
        strArray[3] = "Uk";
        strArray[4] = "US";
        strArray[5] = "Australia";
        
        //read Array
        System.out.println("Printing elements from the integer array");
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        
        System.out.println("Printing elements from the string array");
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);
        System.out.println(strArray[2]);
        System.out.println(strArray[3]);
        System.out.println(strArray[4]);
        System.out.println(strArray[5]);
        
        //Another type of array intialization
        String[] cities = {"Singapore","India","US"};
        System.out.println("-----------");
        for (int i = 0; i < cities.length; i++) {
            System.out.println(cities[i]);
        }

    }
}
