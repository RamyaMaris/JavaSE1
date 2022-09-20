
package com.ntuc.demo.pojoobjects;

import java.util.Calendar;

public class StudentSample {
     public String firstName;
    public String lastName;
    public int grade;
    public Calendar dob;

    public String fullName() {
        return lastName + " " + firstName;
    }

    public int getGrade() {
        return grade;
    }

    public int getAge(Calendar today) {
        System.out.println(dob.get(Calendar.YEAR));
        System.out.println(today.get(Calendar.YEAR));
        return today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
    }
}
