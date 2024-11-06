package org.solvd;

public class Dairy extends Food{
    private boolean isLactoseFree;

    public Dairy() {
        isLactoseFree = false;
    }

    public Dairy(double price, String name, String description, String expirationDate, boolean isLactoseFree) {
        super(price, name, description, expirationDate);
        this.isLactoseFree = isLactoseFree;
    }
}
