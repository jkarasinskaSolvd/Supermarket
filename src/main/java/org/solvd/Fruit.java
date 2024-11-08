package org.solvd;

public abstract class Fruit extends Food{
    private String color;

    public Fruit() {
        super();
        color = null;
    }

    public Fruit(double price, String description, String expirationDate, String color) {
        super(price, description, expirationDate);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
