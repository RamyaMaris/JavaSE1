
package com.ntuc.demo.enumerate;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddStudentEnum {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TeacherEnum[] teacher = new TeacherEnum[2];
        StudentEnum[] student = new StudentEnum[2];
        
        Map<Integer, String> teacherMap = new HashMap<>();
         // Adding Teachers
        for (int i = 0; i < teacher.length; i++) {
            System.out.println("Enter Teacher ID");
            int id = scan.nextInt();
            System.out.println("Enter Teacher Name");
            String name = scan.next();
            teacher[i] = new TeacherEnum(id, name,TeacherEnum.Course.SCIENCE);
            teacherMap.put(id, name);
        }

        // Adding Students
        for (int i = 0; i < student.length; i++) {
            System.out.println("Enter Student id :");
            int sid = scan.nextInt();
            System.out.println("Enter the first name :");
            String sfname = scan.next();
            System.out.println("Enter the Last name :");
            String slname = scan.next();
            
            System.out.println("Enter the teacher id :");
            int tid = scan.nextInt();
            
            student[i] = new StudentEnum(sid, sfname, slname, tid);
            
        }
        
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].getSid() 
                    +" " + student[i].getSfname()
                    + " " + student[i].getSsname()
                    + " " + teacherMap.get(student[i].getTid()));
        }
    }
}
