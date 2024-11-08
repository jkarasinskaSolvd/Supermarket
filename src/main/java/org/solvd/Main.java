package org.solvd;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple(0.5, "delicious apple", "11.02.2025", "red",
                "Ligol");
        Banana banana = new Banana(0.8, "fresh banana", "12.11.2024", "yellow",
                "Columbia");
        Bowl bowl = new Bowl(2, "decoration bowl", 123, 1.5);
        Carrot carrot = new Carrot(0.2, "little carrots for steam cooking", "30.11.2024",
                "City Garden", "mini");
        Chicken chicken = new Chicken(10, "GMO free chicken", "24.11.2024",
                0.5, "small chicken");
        Egg egg = new Egg(2, "set of eggs", "12.12.2024", 10,
                "free range");
        Glass glass = new Glass(5,"beautiful set of glasses", 234, 4);
        GoudaCheese goudaCheese = new GoudaCheese(3,"very tasty","24.12.2024",
                false,"1.11.2024");
        Milk milk = new Milk(1.5,"raw milk","17.01.2025",true,
                2.0);
        Pork pork = new Pork(15,"has no bone","12.11.2024",15.0,
                "Luca's Family Farm");
        Potato potato = new Potato(0.1,"perfect for salad","2.02.2025",
                "City Garden","for salad");

        Customer customer = new Customer("Ania",100.0);

        customer.getShoppingCart().addProduct(apple);
        customer.getShoppingCart().addProduct(bowl);
        customer.getShoppingCart().addProduct(chicken);
        customer.getShoppingCart().addProduct(glass);
        customer.getShoppingCart().addProduct(milk);
        customer.getShoppingCart().addProduct(potato);

        customer.print();

    }
}