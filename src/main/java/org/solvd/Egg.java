package org.solvd;

import java.sql.SQLOutput;

public class Egg extends Food{
    private Integer numberInPackage;
    private String farmingType;

    public Egg() {
        super();
        numberInPackage = null;
        farmingType = null;
    }

    public Egg(double price, String description, String expirationDate, Integer numberInPackage, String farmingType) {
        super(price,  description, expirationDate);
        this.numberInPackage = numberInPackage;
        this.farmingType = farmingType;
    }

    public Integer getNumberInPackage() {
        return numberInPackage;
    }

    public void setNumberInPackage(Integer numberInPackage) {
        this.numberInPackage = numberInPackage;
    }

    public String getFarmingType() {
        return farmingType;
    }

    public void setFarmingType(String farmingType) {
        this.farmingType = farmingType;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\nnumberInPackage: " + numberInPackage
                + "\nfarmingType: " + farmingType);
    }
}
