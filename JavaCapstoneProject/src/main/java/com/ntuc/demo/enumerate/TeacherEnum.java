
package com.ntuc.demo.enumerate;

public class TeacherEnum {
   static enum Course {
       MATHS,
       ENGLISH,
       SCIENCE
   } 
   
   private int tid;
   private String tname;
   private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public TeacherEnum(int tid, String tname, Course course) {
        this.tid = tid;
        this.tname = tname;
        this.course = course;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
    
}

