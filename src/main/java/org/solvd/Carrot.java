package org.solvd;

public class Carrot extends Vegetable{
    private String size;

    public Carrot() {
        super();
        size = null;
    }

    public Carrot(double price, String description, String expirationDate, String gardenName, String size) {
        super(price, description, expirationDate, gardenName);
        this.size = size;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\ngarden name: " + getGardenName()
                + "\nsize: " + size);
    }
}
