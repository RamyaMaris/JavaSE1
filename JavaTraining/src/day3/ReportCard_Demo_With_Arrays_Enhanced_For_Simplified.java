/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ACER
 */
public class ReportCard_Demo_With_Arrays_Enhanced_For_Simplified {

    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("\t Progress Report Card ");
        System.out.println("===================================");

        int[] subjects = new int[3];

        //for loop to initialize the array - randomly
        for (int i = 0; i < subjects.length; i++) {
            subjects[i] = (int) (java.lang.Math.random() * 100);
        }

        int j = 1;
        int total = 0, avg = 0;
        boolean isPassed = true;
        for (int subject : subjects) {
            System.out.println("\t Subject " + (j++) + "     :: " + subject);
             total += subject;
            if(subject < 50 ){
                isPassed = false;
            }
        }

        System.out.println(" --------------------------------------- ");

        avg = total / subjects.length;
        System.out.println(" \t Total      :: " + total);
        System.out.println(" \t Average    :: " + avg);

        if (avg < 50) {
            System.out.println(" \t Grade      :: F");
        } else if (avg >= 50 && avg <= 59) {
            System.out.println(" \t Grade      :: D");
        } else if (avg >= 60 && avg <= 75) {
            System.out.println(" \t Grade      :: C");
        } else if (avg >= 76 && avg <= 89) {
            System.out.println(" \t Grade      :: B");
        } else {
            System.out.println(" \t Grade      :: A");
        }

        System.out.println(" \t Result       :: " + (isPassed ? "Pass" : "Fail"));

    }
}
