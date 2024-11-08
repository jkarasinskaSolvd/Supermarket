package org.solvd;

public class GoudaCheese extends Dairy{
    private String productionDate;

    public GoudaCheese() {
        super();
        productionDate = "No information";
    }

    public GoudaCheese(double price, String description, String expirationDate, boolean isLactoseFree, String productionDate) {
        super(price, description, expirationDate, isLactoseFree);
        this.productionDate = productionDate;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nexpiration date: "+ getExpirationDate() + "\nis it lactose free: "
                + (isLactoseFree() ? "Yes" : "No") + "\nproduction date: " + productionDate);
    }
}
