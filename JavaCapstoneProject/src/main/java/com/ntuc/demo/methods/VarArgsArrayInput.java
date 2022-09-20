
package com.ntuc.demo.methods;

import com.ntuc.demo.array.ArrayInputReturn;


public class VarArgsArrayInput {

    public static void main(String args[]) {
       ArrayInputReturn air = new ArrayInputReturn();
       String[] namesInTitle = VarArgsTitleCase.namesTitle(air.getArray());
        for (int i = 0; i < namesInTitle.length; i++) {
            System.out.println(namesInTitle[i]);
        }
    }
}
