
package com.ntuc.demo.pojoobjects;

import java.util.Scanner;

public class AddStudentTeacher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       // Teacher[] teacher = new Teacher[2];
        Student[] stud = new Student[3];
        

        for (int i = 0; i < stud.length; i++) {
            System.out.println("Enter Student id:");
            int sid = scan.nextInt();
//            stud[i].setId(sid);

            System.out.println("Enter Student First Name:");
            String studfname = scan.next();
//            stud[i].setFirstName(studfname);

            System.out.println("Enter Student Last Name:");
            String studlname = scan.next();
//            stud[i].setLastName(studlname);
            
            System.out.println("Enter Teacher id:");
            int techid = scan.nextInt();
            
            System.out.println("Enter Teacher First Name:");
            String teachfname = scan.next();
            
            System.out.println("Enter Teacher Last Name:");
            String teachlname = scan.next();
            
            stud[i] = new Student(sid, studfname, studlname, new Teacher(techid, teachfname, teachlname));
        }
        
            System.out.println("Display-->");
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].toString());
        }
    }
}
