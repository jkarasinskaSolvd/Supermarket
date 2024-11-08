package org.solvd;

public abstract class Food extends Product {
    private String expirationDate;

    public Food() {
        super();
        expirationDate = "No informations";
    }

    public Food(double price, String description, String expirationDate) {
        super(price, description);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
