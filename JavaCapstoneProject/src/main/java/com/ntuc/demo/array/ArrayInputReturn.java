
package com.ntuc.demo.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInputReturn {

    public String[] getArray() {
        ArrayList<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String input = "";
        System.out.println("Enter names and type done when you are finished:");
        while (!input.toLowerCase().equals("done")) {
            if (!input.equals("")) {
                names.add(input);
            }
            input = scan.next();
        }
        String[] arr = (String[]) names.toArray(new String[names.size()]);  
        return arr;

    }
}
