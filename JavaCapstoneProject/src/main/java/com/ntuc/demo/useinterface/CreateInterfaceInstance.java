
package com.ntuc.demo.useinterface;

import com.ntuc.demo.interfaces.FirstInterface;
import java.util.ArrayList;
import java.util.List;

public class CreateInterfaceInstance {
    public static void main(String args[]) {
        FirstInterface fi = new DemoImplement();
        List<String> l = new ArrayList<String>();
    }
}
