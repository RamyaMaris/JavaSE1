
package com.ntuc.demo.enumerate;

public class StudentEnum {
  private int sid;
    private String sfname;
    private String ssname;
    private int tid;

    public StudentEnum(int sid, String sfname, String ssname, int tid) {
        this.sid = sid;
        this.sfname = sfname;
        this.ssname = ssname;
        this.tid = tid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }
    
    
}
