
package com.ntuc.demo.date;

import java.util.Date;


public class DateConstruct {
    public static void main(String[] args) {
       /* Deprecated Constructor Date(int year, int month, int Date) creates a date as 
        year - a year after 1900
        month - a month between 0-11
        date - day of the month between 1-31*/  
       
       Date d = new Date(0, 0, 0);
        System.out.println("d : " + d);// outputs Sun Dec 31 00:00:00 IST 1899
        Date d1 = new Date(0,0,1); // outputs the date as Mon Jan 01 00:00:00 IST 1900
        System.out.println("d1 : " + d1);// outputs Sun Dec 31 00:00:00 IST 1899
        
    }
}
