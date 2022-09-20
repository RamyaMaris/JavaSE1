
package day5;
public class FoodItem1 {
    public int foodId = 101;
    private String foodDesc = "Satay Aiyam";
    double foodPrice = 2.50;
    
    public static void main(String[] args) {
        FoodItem1 fi = new FoodItem1();
        System.out.println("Food id    :: " +fi.foodId);
        System.out.println("Food Dec    :: " +fi.foodDesc);
        System.out.println("Food PRice :: " +fi.foodPrice);
    }
}

