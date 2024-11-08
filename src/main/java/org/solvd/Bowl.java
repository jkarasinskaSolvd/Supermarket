package org.solvd;

public class Bowl extends HouseItem{
    private Double capacityInLiters;

    public Bowl() {
        super();
        capacityInLiters = null;
    }

    public Bowl(double price, String description, int barcode, Double capacityInLiters) {
        super(price, description, barcode);
        this.capacityInLiters = capacityInLiters;
    }

    public Double getCapacityInLiters() {
        return capacityInLiters;
    }

    public void setCapacityInLiters(Double capacityInLiters) {
        this.capacityInLiters = capacityInLiters;
    }

    @Override
    public void print() {
        System.out.println("This is: " + this.getClass().getSimpleName() + "\nprice: " +getPrice() +"\ndescription: "
                + getDescription() + "\nbarcode: " + getBarcode() + "\ncapacity: " + capacityInLiters);
    }
}
