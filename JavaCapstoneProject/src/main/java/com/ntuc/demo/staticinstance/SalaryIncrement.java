
package com.ntuc.demo.staticinstance;

public class SalaryIncrement {
        Calculator c = new Calculator();//instance variable
    public static void main(String[] args) {
       SalaryIncrement s = new SalaryIncrement();
       s.salRevise(1000);
       s.totalSal();
    }
    public int salRevise(int sal)
    {
        int increment = c.add(sal, 100);
        return increment;
    }
    public int totalSal()
    {
        //Calculator c = new Calculator();
        return c.add(10, 10);
    }
}
