
package com.ntuc.demo.abstracts;

public class DemoExtendAbstract extends DemoAbstract{
   public static void main(String args[]) {
       DemoExtendAbstract dem = new DemoExtendAbstract();
       dem.validateApplicant();
    }

    @Override
    public void validateApplicant() {
        System.out.println("The applicant is valid");
    } 
}
