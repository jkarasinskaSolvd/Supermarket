package org.solvd.product;

public abstract class ProductType {
    Double price;

    public ProductType() {
    }

    public ProductType(Double price) {
        this.price = price;
    }
}