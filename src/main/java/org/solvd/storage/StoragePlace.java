package org.solvd.storage;

import org.solvd.product.Category;
import org.solvd.product.Product;
import org.solvd.product.StorageMethod;

import java.util.ArrayList;
import java.util.List;

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
}
