/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day3;

/**
 *
 * @author ACER
 */
public class Promotion_Casting {
    public static void main(String[] args) {
        int iVar = 40; // 4 bytes of memory
        
        byte b =120; // 1 byte
        
        int iVar1 = b + iVar; // promoted it to int - 4 bytes
        
        System.out.println(iVar +" + " + b + "=" +iVar1);
        
        byte b1 =40;
        
        byte b2 = 120;
        
        byte b3 = (byte) (b1 + b2); //casting - forcing java to convert the data
        
        System.out.println(b1 + " + " + b2 + " = " + b3);
    }
}
