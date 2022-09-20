package test;

import day5.FoodItem;

public class TestClass {

    public static void main(String[] args) {

        FoodItem foodI = null;

        if (args.length == 3) {
            System.out.println("->" + args[0]);
            foodI = new FoodItem(Integer.parseInt(args[0]), (args[1]), Double.parseDouble(args[2]));
        } else {
            foodI = new FoodItem();
        }

        // ============= Ready to Use =============
        System.out.println(" Object - Built with FL constructor \n " + foodI);

    }
}
