package day5;

import java.util.Scanner;

public class FoodItemTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem obj = new FoodItem(55, "PKT", 10.00);

        System.out.println("\n\nFood Item before discount or spicy " + obj);

        // going to call behaviour of the Object
        obj.askDiscount();
        System.out.println("------------------------------------------------------------");
        System.out.println("\n\nFood Item before discount and before spicy " + obj);

        System.out.println("Select your spicy level [L/M/H] ::");
        String choice = sc.nextLine();

        int sel = 0;
        if (choice.equals("L")) {
            sel = 0;
        } else if (choice.equals("M")) {
            sel = 1;
        } else {
            sel = 2;
        }

        obj.spicyQuotient(obj.spicyQuotient[sel]);
        System.out.println("------------------------------------------------------------");
        System.out.println("\n" + obj);
    }
}
