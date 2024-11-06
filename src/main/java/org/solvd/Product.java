package org.solvd;

public class Product {
    private double price;
    private String name;
    private String description;

    public Product() {
        this.price = 0.0;
        this.name = "";
        this.description = "";
    }

    public Product(double price, String name, String description) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
}
