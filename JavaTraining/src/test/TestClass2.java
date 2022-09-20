package test;

import day5.FoodItem;

public class TestClass2 {

    public static void main(String[] args) {
        FoodItem fi = new FoodItem();
        
        System.out.println("Food Item :: " + fi);
//        System.out.println("Food Item :: " + fi.hashCode());
//        System.out.println("Id :: " +fi.getFoodId());
//        System.out.println("Desc :: " +fi.getFoodDesc());
//        System.out.println("Id :: " +fi.getFoodPrice());
        fi.setFoodId(211);
        fi.setFoodDesc("Mee Georen");
        fi.setFoodPrice(1.20);
        

        System.out.println("_______________________________");
        System.out.println("Food Item :: " + fi);
//        System.out.println("Id :: " + fi.getFoodId());
//        System.out.println("Desc :: " + fi.getFoodDesc());
//        System.out.println("Id :: " + fi.getFoodPrice());
    }
}
