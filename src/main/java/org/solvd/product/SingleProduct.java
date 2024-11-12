package org.solvd.product;

public class SingleProduct extends ProductType {
    private Integer amount;

    public SingleProduct() {
        super();
    }

    public SingleProduct(Double price, Integer amount) {
        super(price);
        this.amount = amount;
    }

    @Override
    public Double calculatePrice() {
        return amount * pricePerUnit;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", amount=" + amount +
                '}';
    }
}
