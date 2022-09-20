
package com.ntuc.demo.array;

import com.ntuc.demo.pojoobjects.Student;
import com.ntuc.demo.pojoobjects.Teacher;
public class ArrayCloneStudent {
    public static void main(String[] args) {
        Student[] studArr = new Student[3];
        
        studArr[0] = new Student(10, "James", "A", 3, new Teacher(1,"Teacher","one"));
        studArr[1] = new Student(11,"Smith", "B", 3, new Teacher(1,"Teacher","two"));
        studArr[2] = new Student(12, "Maria", "C", 2, new Teacher(1,"Teacher","one"));
                
        Student[] cloneArray = studArr.clone();
        System.out.println("Clone Array-->");
        for (int i = 0; i < cloneArray.length; i++) {
            
            System.out.println(cloneArray[i].toString());
        }
        //System.out.println("\nClone Array->"+Arrays.toString(cloneArray));
        
        studArr[0].setFirstName("Ramya");
        studArr[1].setTeacherId(2);
        System.out.println("Student Array-->");
        for (int i = 0; i < studArr.length; i++) {
            
         System.out.println(studArr[i].toString());
        }
        
        
       // System.out.println("\nStudent Array->"+Arrays.toString(studArr));
        
    }
}
