
package com.ntuc.demo.constructor;
public class NoArgsConstructor {

    int i = 0;

    public NoArgsConstructor() {
        i = 5;
        System.out.println("Constructor is called");
    }

    public static void main(String args[]) {
        NoArgsConstructor nac = new NoArgsConstructor();
        System.out.println("Value f i: " + nac.i);
    }
}
