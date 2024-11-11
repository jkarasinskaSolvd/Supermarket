package org.solvd;

public class WeightedProduct extends ProductType{
    Double weightInKilograms;

    public WeightedProduct() {
        super();
    }

    public WeightedProduct(Double price, Double weightInKilograms) {
        super(price);
        this.weightInKilograms = weightInKilograms;
    }
}
