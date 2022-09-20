
package com.ntuc.demo.useinterface;

import com.ntuc.demo.interfaces.Bank;
import java.util.Scanner;

public class MayBank implements Bank{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MayBank cb = new MayBank();
        //select account type
        System.out.println("Select the deposit type (fixed/recurring): ");
        String accType = scan.next();
        if(accType.toLowerCase().equalsIgnoreCase("fixed"))
        {
            
            System.out.println("Enter the amount to deposit: ");
            float getAmount = scan.nextFloat();
            System.out.println("Enter the number of months of deposit");
            int getDepositPeriod = scan.nextInt();
            float calcInterest = cb.fixedDeposit(getAmount, getDepositPeriod);
            System.out.println("The interest on FD of "+getAmount+ " for a period of "+ getDepositPeriod +" months is " + calcInterest);
            
        }
        else if(accType.equalsIgnoreCase("Recurring"))
        {
            System.out.println("Enter the amount to deposit: ");
            float getAmount = scan.nextFloat();
            
            System.out.println("Enter the number of months of deposit: ");
            int getDepositPeriod = scan.nextInt();
            float calcInterest = cb.recurringDeposit(getAmount, getDepositPeriod);
            System.out.println("The interest on RD of " + getAmount + " for a period of " + getDepositPeriod + " months is " + calcInterest);
                
        }
        
    }

    @Override
    public float fixedDeposit(float amount, int depositPeriod) {
         float interest = 3.0f;
        float calcInterest = (amount * depositPeriod * interest) / 100;
        return calcInterest;
    }

    @Override
    public float recurringDeposit(float amount, int depositPeriod) {
         float interest = 2.0f;
        float calcInterest = (amount * depositPeriod * interest) / 100;
        return calcInterest;
    }
}
