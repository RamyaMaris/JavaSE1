
package com.ntuc.demo.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;


public class AgeCalculationPeriod {
    public static void main(String[] args) {
        System.out.println("Enter date of birth : [YYYY-MM-DD]format: ");
        Scanner scan = new Scanner(System.in);
        String input_dob = scan.next();
        
        LocalDate dob = LocalDate.parse(input_dob);
        LocalDate current_date = LocalDate.now();
        
        if((dob != null) && (current_date != null)){
            Period i =  Period.between(dob, current_date);
        System.out.println("You are " + i.getYears() + " years old");
            
        }
        
    }
}
