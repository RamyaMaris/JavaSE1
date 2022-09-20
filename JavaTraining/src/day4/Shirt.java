package day4;

public class Shirt {

    private int shirtId;

    private String description;

    private char colorCode;

    private double price;

    private int quantityInStock;

    public Shirt(int shirtId, String description, char colorCode, double price, int quantityInStock) {
        this.shirtId = shirtId;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Shirt() {
    }

    public void displayInformation() {
        System.out.println("Shirt ID        :: " + shirtId);
        System.out.println("Desc            :: " + description);
        System.out.println("Color Code      :: " + colorCode);
        System.out.println("Price           :: " + price);
        System.out.println("QiS             :: " + quantityInStock);

    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getColorCode() {
        return colorCode;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public String getDecription() {
        return description;
    }

    public void setDecription(String description) {
        this.description = description;
    }

    public int getShirtId() {
        return shirtId;
    }

    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }

}
