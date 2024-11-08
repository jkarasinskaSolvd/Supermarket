package org.solvd;

public abstract class Meat extends Food {
    private Double fatContentPercentage;

    public Meat() {
        super();
        fatContentPercentage = null;
    }

    public Meat(double price, String description, String expirationDate, Double fatContentPercentage) {
        super(price, description, expirationDate);
        this.fatContentPercentage = fatContentPercentage;
    }

    public Double getFatContentPercentage() {
        return fatContentPercentage;
    }

    public void setFatContentPercentage(Double fatContentPercentage) {
        this.fatContentPercentage = fatContentPercentage;
    }
}
