
package com.ntuc.demo.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculationEnum {
    public static void main(String[] args) {
      System.out.println("Enter date of birth : [YYYY-MM-DD]format: ");
        Scanner scan = new Scanner(System.in);
        String input_dob = scan.next();
        
        LocalDate dob = LocalDate.parse(input_dob);
        LocalDate current_date = LocalDate.now();
        
        long years = ChronoUnit.YEARS.between(dob, current_date);
        
        System.out.println("You are " + years + " years old");
    }
}
