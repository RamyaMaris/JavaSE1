
package com.ntuc.demo.overload;

public class OverLoadSample {
    public static void main(String args[]) {
        OverLoadSample ab = new OverLoadSample();
        System.out.println("Method Overloading : Different parameters/ different datatypes/ return ");
        int res = ab.add(15, 20);
        System.out.println(res);
        int res1 = ab.add(15, 20, 30);
        System.out.println(res1);
        double d = ab.add(15.0, 20.0);
        System.out.println(d);
    }

    int add(int i, int j) {
        return i + j;
    }

    // overload with the # arguments
    int add(int i, int j, int k) {
        return i + j + k;
    }

    // Overload with the changed datatypes
    double add(double x, double y) {
        return x + y;
    }
}
