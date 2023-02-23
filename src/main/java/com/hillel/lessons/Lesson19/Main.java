package com.hillel.lessons.Lesson19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Beer", 4d);
        Product product1 = new Product("Milk", 3d);
        Product product2 = new Product("Bread", 5d);
        Product product3 = new Product("Meat", 8d);
        Product product4 = new Product("Orange", 10d);
        Product product5 = new Product("Buckwheat", 17d);
        Product product6 = new Product("Sausage", 13d);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);

        ProductMarket productMarket = new ProductMarket(list);
        productMarket.getProductName();
        System.out.println("All product names: " + productMarket.getProductName());

        productMarket.getPriceLess5();
        System.out.println("Product price less 5: " + productMarket.getPriceLess5());

        productMarket.getPriceMore10();
        System.out.println("Product price more 10: " + productMarket.getPriceMore10());

        productMarket.getSortName();
        System.out.println("Sort name: " + productMarket.getSortName());

        productMarket.getStrPrice();
        System.out.println("To string Prise: " + productMarket.getStrPrice());


    }
}
