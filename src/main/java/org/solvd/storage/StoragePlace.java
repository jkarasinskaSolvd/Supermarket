package org.solvd.storage;

import org.solvd.product.Category;
import org.solvd.product.Product;
import org.solvd.product.StorageMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class StoragePlace {
    protected String name;
    protected Category category;
    protected List<Product> products;
    protected StorageMethod storageMethod;

    public StoragePlace() {
        products = new ArrayList<Product>();
    }

    public StoragePlace(String name, Category category) {
        this.name = name;
        this.category = category;
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        if (category == product.getCategory() && storageMethod == product.getStorageMethod()) {
            products.add(product);
        }
    }

    public void addListOfProducts(List<Product> listOfProducts) {
        for (Product product : listOfProducts) {
            addProduct(product);
        }
    }
// TODO: remove product but partially
    public void removeProduct(Product product) {
        products.stream()
                .filter(product1 -> product1.equals(product))
                .findFirst()
                .ifPresent(product1 -> {


        });
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "StoragePlace{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", products=" + products +
                ", storageMethod=" + storageMethod +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if(getClass() != o.getClass()) return false;
        if(hashCode() != o.hashCode()) return false;
        StoragePlace storagePlace = (StoragePlace) o;
        if(this.name != storagePlace.name) return false;
        if(this.category != storagePlace.category) return false;
        if(this.products != storagePlace.products) return false;
        if(this.storageMethod != storagePlace.storageMethod) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + category.hashCode() + products.hashCode() + storageMethod.hashCode();
    }
}
