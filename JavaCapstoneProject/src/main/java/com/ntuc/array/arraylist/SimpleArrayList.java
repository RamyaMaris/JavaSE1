
package com.ntuc.array.arraylist;

import java.util.ArrayList;

public class SimpleArrayList {
    public static void main(String args[]) {
        //declare ArrayList
        ArrayList cars = new ArrayList<String>();
        // Add elements to ArrayList
        cars.add("BMW");
        cars.add("Hyundai");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Merc");
        
        // show items in ArrayList
        System.out.println(cars);
        
        // Access Specific element in ArrayList
        System.out.println(cars.get(0));
        
        // Change Element in ArrayList
        cars.set(0, "Volvo");
        System.out.println(cars.get(0));
        
        //remove elements from ArrayList
        cars.remove(3);
        
        System.out.println(cars);
        // get the length of ArrayList
        
        System.out.println(cars.size());
        //clear all elements in an ArrayList
        cars.clear();
    }
}
