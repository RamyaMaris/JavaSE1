/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import day5.FoodItem;

public class TestClass3 {
    
    public static void main(String[] args) {
      
//        Scanner sc = new Scanner(System.in);
//    // Method 1 - default constructor, default values & setXXX
//    
//        FoodItem fi = new FoodItem();
//        System.out.print(" Enter a value for Food Id :: ");
//        int foodId = Integer.parseInt(sc.nextLine());
//        System.out.print(" Enter description         :: ");
//        String desc = sc.nextLine();
//        System.out.print(" What's the price          :: ");
//        double price = Double.parseDouble(sc.nextLine());
//        
//    // using setters to write 'data' - assignment 
//        fi.setFoodId(foodId);
//        fi.setFoodDesc(desc);
//        fi.setFoodPrice(price);
//        
//    // ============ Ready To Use =============    
//        System.out.println(" Object - Built with ZA constructor & setXXX \n " + fi);    
    
    // Method 2 - Fully Loaded Constructor 
    FoodItem foodI = null;
    
    if(args.length == 3){
         foodI = new FoodItem(Integer.parseInt(args[0]), args[1], Double.parseDouble(args[2]));
    }else {
        foodI = new FoodItem();
    }
        
    // ============= Ready to Use =============
        System.out.println(" Object - Built with FL constructor \n " + foodI);         
    }
}