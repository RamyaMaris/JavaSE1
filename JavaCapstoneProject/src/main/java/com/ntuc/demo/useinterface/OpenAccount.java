
package com.ntuc.demo.useinterface;

import com.ntuc.demo.interfaces.Open;
import java.util.Scanner;

public class OpenAccount implements Open{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scan.nextInt();
        System.out.println("Enter the Citizenship: ");
        String status = scan.next();
        System.out.println("Enter the type of account to open[fixed / recurring]: ");
        String typeAccount = scan.next();
        OpenAccount open = new OpenAccount();
        int res = open.acceptApplicant(age,status,typeAccount);
        if(res == 1)
            System.out.println("You are Eligible");
        else
            System.out.println("Not Eligible");
    }
    
    @Override
    public int acceptApplicant(int age, String status, String typeAccount) {
        int i = 0;
       if(age > 18 && status.equalsIgnoreCase("SC"))
       {
           System.out.println("You can open either fixed or recurring account");
           i = 1;
       }
       else if(age > 18 && status.equalsIgnoreCase("PR"))
       {
           System.out.println("You can open only recurring account.");
           i = 1;
       }
       else if(age <= 18)
       {
           System.out.println("You are not eligible to open account.");
           i = 0;
       }
       else 
       {
           System.out.println("Enter wrong");
           i = 0;
       }
       return i;
    }

   
}
