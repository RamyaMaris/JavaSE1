
package com.ntuc.demo.pojoobjects;


public class Student {
    private int id;
    private int teacherId;
    private String firstName;
    private String lastName;
    private int grade;
    private Teacher teacher;
    
   public String fullName() {
        return lastName + " " + firstName;
    }

    public int getGrade() {
        return grade;
    }

    public Student(int id, String firstName, String lastName, int grade, Teacher teacher) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.teacher = teacher;
    }


    public Student(int id, String firstName, String lastName, Teacher teacher) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacher = teacher;
    }

   

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student id=" + id + "\tStudent's Full Name =" + firstName +" "+ lastName + teacher.toString() +"\n";
    }

   
    
}
