package org.solvd;

public class Banana extends Fruit{
    private String countryOfOrigin;

    public Banana() {
        super();
        countryOfOrigin = null;
    }

    public Banana(double price, String description, String expirationDate, String color, String countryOfOrigin) {
        super(price, description, expirationDate, color);
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " + getPrice() +"\ndescription: "
                + getDescription() + "\ncolor: " + "\nexpiration date: "+ getExpirationDate() + getColor()
                + "\ncountry of origin: " + countryOfOrigin);
    }
}
