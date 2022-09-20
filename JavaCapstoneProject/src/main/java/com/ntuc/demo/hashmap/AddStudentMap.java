
package com.ntuc.demo.hashmap;

import java.util.*;

public class AddStudentMap {
     public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        TeacherMap[] teachers = new TeacherMap[2];
        StudentMap[] students = new StudentMap[2];
        Map<Integer, String> teachersmap = new HashMap<>();

        // Adding Teachers
        for (int i = 0; i < teachers.length; i++) {
            System.out.println("Enter Teacher ID");
            int id = scan.nextInt();
            System.out.println("Enter Teacher Name");
            String name = scan.next();
            teachers[i] = new TeacherMap(id, name);
            teachersmap.put(id, name);
        }

        // Adding Students
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter Student id");
            int sid = scan.nextInt();
            System.out.println("Enter the First name of the Student");
            String sfname = scan.next();
            System.out.println("Enter the Last name of the Student");
            String slname = scan.next();
            System.out.println("Enter Teacher id");
            int tid = scan.nextInt();
            students[i] = new StudentMap(sid, sfname, slname, tid);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getSid()
                    + " " + students[i].getSfname()
                    + " " + students[i].getSsname()
                    + " " + teachersmap.get(students[i].getTid()));
        }
    }
}
