package org.solvd;

public class Milk extends Dairy{
    private Double percentageFatContent;

    public Milk() {
        super();
        percentageFatContent = null;
    }

    public Milk(double price, String description, String expirationDate, boolean isLactoseFree, Double percentageFatContent) {
        super(price, description, expirationDate, isLactoseFree);
        this.percentageFatContent = percentageFatContent;
    }

    public Double getPercentageFatContent() {
        return percentageFatContent;
    }

    public void setPercentageFatContent(Double percentageFatContent) {
        this.percentageFatContent = percentageFatContent;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\nis it lactose free: "
                + (isLactoseFree() ? "Yes" : "No") + "\npercentage fat content: " + percentageFatContent);
    }
}
