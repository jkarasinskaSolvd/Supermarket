package org.solvd;

public abstract class Vegetable extends Food{
    private String gardenName;

    public Vegetable() {
        super();
        gardenName = null;
    }

    public Vegetable(double price, String description, String expirationDate, String gardenName) {
        super(price, description, expirationDate);
        this.gardenName = gardenName;
    }

    public String getGardenName() {
        return gardenName;
    }

    public void setGardenName(String gardenName) {
        this.gardenName = gardenName;
    }
}
