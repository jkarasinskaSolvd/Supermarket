package org.solvd;

public class Chicken extends Meat{
    private String chickenType;

    public Chicken() {
        super();
        chickenType = null;
    }

    public Chicken(double price, String description, String expirationDate, Double fatContentPercentage,
                   String chickenType) {
        super(price, description, expirationDate, fatContentPercentage);
        this.chickenType = chickenType;
    }

    public String getChickenType() {
        return chickenType;
    }

    public void setChickenType(String chickenType) {
        this.chickenType = chickenType;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\nfat content percentage: "
                + getFatContentPercentage() + "\nchicken type: " + chickenType);
    }
}
