package org.solvd;

public class Apple extends Fruit{
    private String appleType;

    public Apple() {
        super();
        appleType = null;
    }

    public Apple(double price, String description, String expirationDate, String color, String appleType) {
        super(price, description, expirationDate, color);
        this.appleType = appleType;
    }

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\ncolor: " + getColor()
                + "\napple type: " + appleType);
    }
}
