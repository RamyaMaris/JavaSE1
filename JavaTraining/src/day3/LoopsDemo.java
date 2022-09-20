/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ACER
 */
public class LoopsDemo {
    //iteration - looping

    public static void main(String[] args) {

        int num1 = 8;
        int num2 = 1;

        //while loop
        System.out.println(" While Loop :: ");
        while (num2 <= 10) {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2++));
        }

        //do.... while loop
        System.out.println("\n\n Do...While Loop ::");
        num2 = 1;
        do {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2++));
        } while (num2 <= 10); //guaranteed to execute at least once
        
        //        for loop
        System.out.println(" \n\n For loop demo ");
        for(num2 = 1; num2 <= 10; num2++){
            System.out.println(num1 +  " * " + num2 + " = " + (num1 * num2));
        }

    }
}
