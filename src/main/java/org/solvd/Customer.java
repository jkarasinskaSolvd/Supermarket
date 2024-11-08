package org.solvd;

public class Customer {
    private String name;
    private Double amountOfMoney;
    private ShoppingCart shoppingCart;

    public Customer() {
        name = null;
        amountOfMoney = null;
        shoppingCart = null;
    }

    public Customer(String name, Double amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
        shoppingCart = new ShoppingCart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Double change(){
        return amountOfMoney - shoppingCart.totalPrice();
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Amount of Money: " + amountOfMoney);
        System.out.println("What is in the shopping cart: \n");
        shoppingCart.printProducts();
        System.out.println("Chainge customer will get: " + change());
    }
}
