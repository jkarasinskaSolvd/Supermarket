package org.solvd;

public class Pork extends Meat{
    private String farmName;

    public Pork() {
        farmName = null;
    }

    public Pork(double price, String description, String expirationDate, Double fatContentPercentage, String farmName) {
        super(price, description, expirationDate, fatContentPercentage);
        this.farmName = farmName;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\nfat content percentage: "
                + getFatContentPercentage() + "\nfarm name " + farmName);
    }
}
