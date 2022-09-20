
package com.ntuc.demo.overload;

public class OverLoadSample1 {
    public static void main(String args[]) {
        OverLoadSample1 ab = new OverLoadSample1();
        System.out.println("Method Overloading : Different parameters/ different datatypes/ return ");
        ab.add(10,20);
        ab.add(0, 0,10);
        ab.add(10.0,10.0);


    }

    void add(int i, int j) {
        System.out.println(i + j);
    }

    // overload with the # arguments
    void add(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    // Overload with the changed datatypes
    void add(double x, double y) {
        System.out.println(x + y);
    }
}
