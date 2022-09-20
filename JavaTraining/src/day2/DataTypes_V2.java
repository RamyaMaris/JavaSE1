/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */

public class DataTypes_V2 {

    public static void main(String[] args) {
        //Declaration
        int i;
        double d;
        String s;
        boolean b;

        //input from the end-user [who ever is running this program]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value --> ");
        i = sc.nextInt();
        System.out.println("Enter the double value --> ");
        d = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the string value --> ");
        s = sc.nextLine();
        System.out.println("Enter the boolean value --> ");
        b = sc.nextBoolean();
        
        
        
        //usage of variables
        System.out.println("Int ::" + i);
        System.out.println("double ::" + d);
        System.out.println("bollean ::" + s);
        System.out.println("String ::" + b);

    }
}
