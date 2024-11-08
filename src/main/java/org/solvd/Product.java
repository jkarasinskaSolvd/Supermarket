package org.solvd;

public abstract class Product {
    private Double price;
    private String description;

    public Product() {
        this.price = null;
        this.description = null;
    }

    public Product(Double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract void print();
}
