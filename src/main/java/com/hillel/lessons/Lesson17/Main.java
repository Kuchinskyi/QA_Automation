package com.hillel.lessons.Lesson17;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Beer", 2);
        Product product1 = new Product("Milk", 11);
        Product product2 = new Product("Bread", 3);
        Product product3 = new Product("Meat", 12);
        Product product4 = new Product("Orange", 3);
        Product product5 = new Product("Buckwheat", 4);
        Product product6 = new Product("Sausage", 13);

        List<Product> list = new ArrayList<>();
        list.add(product);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);

        ProductMarket productMarket = new ProductMarket(list);

        System.out.println("Product Names: ");
        productMarket.getNames();
        System.out.println(productMarket.getNames());
        System.out.println();

        System.out.println("Sort products name: ");
        productMarket.sortNames();
        System.out.println(productMarket.sortNames());
        product.setName("Olives");
        System.out.println(productMarket.sortNames());
        System.out.println();

        System.out.println("Sort prise more 10");
        productMarket.morePrice();
        System.out.println(productMarket.morePrice());
        product1.setPrice(4);
        System.out.println(productMarket.morePrice());
        System.out.println();

        System.out.println("Sort price lees 5");
        productMarket.lessPrice();
        System.out.println(productMarket.lessPrice());
        System.out.println();

        System.out.println("String price: ");
        productMarket.strPrice();
        System.out.println(productMarket.strPrice());


    }
}
