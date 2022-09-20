/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntuc.demos.conditions;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class EligibleVoteIfElse {
   public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Input your age: ");
        int input = reader.nextInt();

        if (input > 18) {
            System.out.println("eligible to vote!");
        } else {
            System.out.println("Not eligible to vote");
        }
    }  
}
