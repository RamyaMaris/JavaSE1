
package com.ntuc.demo.useinterface;

import com.ntuc.demo.interfaces.FirstInterface;
import com.ntuc.demo.interfaces.SecondInterface;

public class DemoImplement implements FirstInterface, SecondInterface{
     public static void main(String args[]) {
        DemoImplement di = new DemoImplement();
        di.anyMethod();
    }

    @Override
    public void anyMethod() {
        System.out.println("Hello from anyMethod");
        System.out.println(FirstInterface.s);
    }

    @Override
    public void someMethod() {
        System.out.println("Hello from anyMethod");
    }
}
