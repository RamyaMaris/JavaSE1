
package com.ntuc.demo.date;

import java.util.Date;

public class DateClassDemo {
    public static void main(String[] args) {
        Date d = new Date();
        double secs = d.getTime()/1000;
        double mins = secs / 60;
        double hours = mins / 60;
        double days = hours / 24;
        double months = days / 30;
        double years = days / 365; //convert using days/365 for accuracy as not all
        //month have 30 days
        
        System.out.println("Since 00:00:00 from Jan 1st 1970..");
        System.out.println(secs +" Seconds or ");
        System.out.println(mins +" Minues or ");
        System.out.println(hours +" Hours or ");
        System.out.println(days +" Days or ");
        System.out.println(months +" Months or ");
        System.out.println(years +" Years ");
        System.out.println(" Have Passed ");
    }
}
