package org.solvd;

public class HouseItem extends Product{
    private Integer barcode;

    public HouseItem() {
        barcode =null;
    }

    public HouseItem(double price, String name, String description, int barcode) {
        super(price, name, description);
        this.barcode = barcode;
    }
}
