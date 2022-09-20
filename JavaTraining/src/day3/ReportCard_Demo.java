/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ACER
 */
public class ReportCard_Demo {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("\t Progress Report Card ");
        System.out.println("===================================");
        
        int sub1 = (int)(java.lang.Math.random() * 100),
         sub2 = (int)(java.lang.Math.random() * 100),
         sub3 = (int)(java.lang.Math.random() * 100),
         sub4 = (int)(java.lang.Math.random() * 100);
        
        System.out.println("\t Subject 1 -->" + sub1);
        System.out.println("\t Subject 2 -->" + sub2);
        System.out.println("\t Subject 3 -->" + sub3);
        System.out.println("\t Subject 4 -->" + sub4);
         
        int total = sub1 + sub2 + sub3 + sub4;
        int avg = total / 4;
        
        System.out.println("\t Total :: " + total);
        System.out.println("\t Average :: " + avg);
        
        //Grade Calculation
        if(avg < 50){
            System.out.println(" \t Grade : F");
        }else if(avg >= 50 && avg <=59){
            System.out.println(" \t Grade : D");
        }else if(avg >= 60 && avg <= 75){
            System.out.println(" \t Grade : C");
        }else if(avg >= 76 && avg <= 89){
            System.out.println(" \t Grade : B");
        }else {
            System.out.println(" \t Grade : A");
        }

        if(sub1 < 50 || sub2 < 50 || sub3 < 50 || sub4 < 50){
            System.out.println(" \t Result :: Failed  ");
        }else {
            System.out.println(" \t Result :: Passed ");
        }
        
        
    }
}
