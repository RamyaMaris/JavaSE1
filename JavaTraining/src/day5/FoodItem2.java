package day5;

import java.util.Objects;

public class FoodItem2 {
//    public int foodId = 101;
//    private String foodDesc = "Satay Aiyam";
//    double foodPrice = 2.50;

//    private int foodId = 101;
//    private String foodDesc = "satay Aiyam";
//    private double foodPrice = 2.50;
    private int foodId;
    private String foodDesc;
    private double foodPrice;

    @Override
    public String toString() {

//        return "\n\t Id : " + foodId + "\n\t Desc : " + foodDesc + "\n\t Price : " + foodPrice;
        return "\n\t Desc : " + foodDesc + "\n\t Price : " + foodPrice;  //Redacting the food id

    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.foodId;
        hash = 73 * hash + Objects.hashCode(this.foodDesc);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.foodPrice) ^ (Double.doubleToLongBits(this.foodPrice) >>> 32));
        return hash;
    }

//    @Override
//    public String toString() {
//        return "FoodItem{" + "foodId=" + foodId + ", foodDesc=" + foodDesc + ", foodPrice=" + foodPrice + '}';
//    }
    public FoodItem2() {
    }

    public FoodItem2(int foodId, String foodDesc, double foodPrice) {
        this.foodId = foodId;
        this.foodDesc = foodDesc;
        this.foodPrice = foodPrice;
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
