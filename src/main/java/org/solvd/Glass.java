package org.solvd;

public class Glass extends HouseItem{
    private Integer numberInSet;

    public Glass() {
        super();
        numberInSet = null;
    }

    public Glass(double price, String description, int barcode, Integer numberInSet) {
        super(price, description, barcode);
        this.numberInSet = numberInSet;
    }

    public Integer getNumberInSet() {
        return numberInSet;
    }

    public void setNumberInSet(Integer numberInSet) {
        this.numberInSet = numberInSet;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nbarcode: " + getBarcode() + "\nnumber in set: " + numberInSet);
    }
}
