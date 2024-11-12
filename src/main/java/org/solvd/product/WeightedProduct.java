package org.solvd.product;

public class WeightedProduct extends ProductType {
    Double weightInKilograms;

    public WeightedProduct() {
        super();
    }

    public WeightedProduct(Double price, Double weightInKilograms) {
        super(price);
        this.weightInKilograms = weightInKilograms;
    }

    @Override
    public Double calculatePrice() {
        return weightInKilograms * pricePerUnit;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", weight in kilograms=" + weightInKilograms +
                '}';
    }
}
