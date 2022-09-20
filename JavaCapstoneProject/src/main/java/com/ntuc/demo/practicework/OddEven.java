
package com.ntuc.demo.practicework;

import java.util.Scanner;

public class OddEven {
    static OddEven od = new OddEven();
    public static void main(String[] args) {
        System.out.println("Enter the number to find odd or even: ");
        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt();
        od.findOdd(i);
        od.findEven(i);
        
    }
    public void findOdd(int i)
    {
        int res;
        res = i%2;
        if(res != 0)
        {
            System.out.println(i +" is Odd no");
        }
    }
    public void findEven(int j){
        int res;
        res = j%2;
        if(res == 0)
        {
            System.out.println(j + " is Even no");
        }
        
    }
}
