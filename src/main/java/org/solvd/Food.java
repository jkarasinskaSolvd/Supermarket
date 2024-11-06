package org.solvd;

public class Food extends Product {
    private String expirationDate;

    public Food() {
        expirationDate = "No informations";
    }

    public Food(double price, String name, String description, String expirationDate) {
        super(price, name, description);
        this.expirationDate = expirationDate;
    }
}
