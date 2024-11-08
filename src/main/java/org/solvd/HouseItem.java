package org.solvd;

public abstract class HouseItem extends Product{
    private Integer barcode;

    public HouseItem() {
        super();
        barcode =null;
    }

    public HouseItem(double price, String description, int barcode) {
        super(price, description);
        this.barcode = barcode;
    }

    public Integer getBarcode() {
        return barcode;
    }

    public void setBarcode(Integer barcode) {
        this.barcode = barcode;
    }
}
