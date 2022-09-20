package day5;



public class FoodItem {

    private int foodId;
    private String foodDesc;
    private double foodPrice;
    private char spicyLevel = 'L';
    public static char[] spicyQuotient = {'L', 'M', 'H'};
    private static double discount = 0.20;

    public FoodItem() {
    }

    public FoodItem(int foodId, String foodDesc, double foodPrice) {
        this.foodId = foodId;
        this.foodDesc = foodDesc;
        this.foodPrice = foodPrice;
    }

    public void askDiscount() {
        foodPrice -= (foodPrice * discount);
    }

    public void spicyQuotient(char sl) {
        spicyLevel = sl;
    }

    public String toString() {
        return " \n\t ID : " + foodId + " \n\t Desc : " + foodDesc + " \n\t Price : " + foodPrice
                +"\n\t Spicy Level : " + spicyLevel;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodDesc() {
        return foodDesc;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public void setFoodDesc(String foodDesc) {
        this.foodDesc = foodDesc;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

}
