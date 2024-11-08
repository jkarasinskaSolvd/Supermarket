package org.solvd;

public class Potato extends Vegetable{
    private String purpose;

    public Potato() {
        purpose = null;
    }

    public Potato(double price, String description, String expirationDate, String gardenName, String purpose) {
        super(price, description, expirationDate, gardenName);
        this.purpose = purpose;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\ngarden name: " + getGardenName()
                + "\npurpose: " + purpose);
    }
}
