
package com.ntuc.array.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListGetInput {
        Scanner sc = new Scanner(System.in);
        static ArrayList value = new ArrayList<>();
    public static void main(String[] args) {
        ArrayListGetInput al = new ArrayListGetInput();
        al.inputArrayList();
        System.out.println("ArrayList : ");
        for (int i = 0; i < value.size(); i++) {
            System.out.println(value.get(i));
        }
    }
    public void inputArrayList()
    {
        String val = sc.next();
        if(!val.equalsIgnoreCase("exit"))
        {
            value.add(val);
            inputArrayList();
        }
    }
}
