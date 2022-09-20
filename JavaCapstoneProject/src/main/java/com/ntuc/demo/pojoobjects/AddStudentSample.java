
package com.ntuc.demo.pojoobjects;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AddStudentSample {
    public static void main(String args[]) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2005);
        cal.set(Calendar.MONTH, 5);
        cal.set(Calendar.DATE, 20);

        StudentSample student = new StudentSample();
        student.firstName = "John";
        student.lastName = "Doe";
        student.grade = 4;
        student.dob = cal;

        System.out.println(student.firstName + " " + student.lastName + " is "+ student.getAge(new GregorianCalendar()) + " Years old");

    }
}
