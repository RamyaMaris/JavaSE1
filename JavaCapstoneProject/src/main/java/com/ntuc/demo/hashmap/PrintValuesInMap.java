
package com.ntuc.demo.hashmap;

import java.util.*;

public class PrintValuesInMap {
    public static void main(String args[]) {
        Map<Integer, String> data = new HashMap<>();
        
        data.put(1, "david");
        data.put(2, "Alex");
        data.put(3, "Simon");

        System.out.println(data.keySet().toString() + " " + data.values().toString());
        String s = data.get(3);
        System.out.println(s);
        
    }
}
