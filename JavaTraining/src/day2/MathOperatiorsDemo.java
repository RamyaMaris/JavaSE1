/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day2;

/**
 *
 * @author ACER
 */
public class MathOperatiorsDemo {
    public static void main(String[] args) {
        
        //datatype   variablename   assign   value
        int             varInt1         =       90;
        int             varInt2         =       40;
        //BODMAS
        System.out.println("Integer 1 -->" +varInt1);
        System.out.println("Integer 2 -->" +varInt2);
        
        //without BODMAS its takes as string concadiante
        System.out.println("Sum of Integer(string concodinate) -->" + varInt1 + varInt2);
        // with bracets
        System.out.println("Sum of Integer -->" + (varInt1 + varInt2));
        System.out.println("Mul of Integer -->" + (varInt1 * varInt2));
        System.out.println("Div of Integer -->" + (varInt1 / varInt2));
        System.out.println("Sub of Integer -->" + (varInt1 - varInt2));
        System.out.println("Reminder of Integer -->" + (varInt1 % varInt2));
        //Most common thing is increment and decrement using add + assign..
        
        int x = 10;
        System.out.println(" x --> " +x);
        x += 5;
        System.out.println(" Assign Add x += --> " +x);
        x *= 5;
        System.out.println(" Assign Multiply x *= --> " +x);
        x /= 5;
        System.out.println(" Assign Divide x /= --> " +x);
        x -= 5;
        System.out.println(" Assign Subtract x -= --> " +x);
        
        
        // Increment & Decrement Operator ---- pre and post demo 
        int a = 99;
        
        System.out.println(" a :: " + a );
        System.out.println(" ++a :: " + ++a );
        
        a = 99;
        System.out.println(" a :: " + a );
        System.out.println(" a++ :: " + a++ );
        System.out.println(" a :: " + a );
        
        int sessionNumber = 3;
        
        System.out.println(" Previous Session " + --sessionNumber);
        System.out.println(" Current Session " + ++sessionNumber);
        System.out.println(" Next Session " + ++sessionNumber );
        
        sessionNumber = 3;
        System.out.println(" Congrats on Completing Session No  " + sessionNumber++);
        System.out.println(" Be ready for next session " + sessionNumber);
        
   
    }
}
