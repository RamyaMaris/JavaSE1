
package com.ntuc.demo.useinterface;

import com.ntuc.demo.interfaces.Bank;
import java.util.Scanner;

public class CitiBank implements Bank{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        CitiBank cb = new CitiBank();
        //Select Account type
        System.out.println("Select the deposit type (fixed/recurring: ");
        String acctType = scan.next();
        if (acctType.toLowerCase().equals("fixed")) {
            System.out.println("Enter the amount to deposit: ");
            float getAmount = scan.nextFloat();
            System.out.println("Enter the number of months of deposit: ");
            int gettDepositPeriod = scan.nextInt();
            float calcInterest = cb.fixedDeposit(getAmount, gettDepositPeriod);
            System.out.println("The interest on FD of " + getAmount + " for a period of " + gettDepositPeriod + " months is " + calcInterest);
        } else if (acctType.equalsIgnoreCase("Recurring")) {
            System.out.println("Enter the amount to deposit: ");
            float getAmount = scan.nextFloat();
            System.out.println("Enter the number of months of deposit: ");
            int gettDepositPeriod = scan.nextInt();
            float calcInterest = cb.recurringDeposit(getAmount, gettDepositPeriod);
            System.out.println("The interest on RD of " + getAmount + " for a period of " + gettDepositPeriod + " months is " + calcInterest); 
    }
}

    @Override
    public float fixedDeposit(float amount, int tDepositPeriod) {
        float interest = 3.5f;
        float calcInterest = (amount * tDepositPeriod * interest) / 100;
        return calcInterest; 
    }

    @Override
    public float recurringDeposit(float amount, int tDepositPeriod) {
        float interest = 2.5f;
        float calcInterest = (amount * tDepositPeriod * interest) / 100;
        return calcInterest; 
    }
}
