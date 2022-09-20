
package com.ntuc.demo.pojoobjects;

public class Teacher {
    private String teacherFName;
    private String teacherLName;
    private int teacherId;

   public String fullName(){
       return teacherFName + " " + teacherLName;
   }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherFName() {
        return teacherFName;
    }

    public void setTeacherFName(String teacherFName) {
        this.teacherFName = teacherFName;
    }

    public String getTeacherLName() {
        return teacherLName;
    }

    public void setTeacherLName(String teacherLName) {
        this.teacherLName = teacherLName;
    }

    public Teacher(int teacherId, String teacherFName, String teacherLName) {
        this.teacherId = teacherId;
        this.teacherFName = teacherFName;
        this.teacherLName = teacherLName;
    }

    @Override
    public String toString() {
        return  "\tteacherId=" + teacherId +"\tTeacher Full Name =" + teacherFName + " " + teacherLName;
    }
    
}
