package com.hillel.lessons.Lesson19;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProductMarket {
    private final List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<String> getProductName() {
        return products.stream()
                .map(Product::getProductName)
                .collect(Collectors.toList());
    }

    public List<String> getSortName() {
        return products.stream()
                .map(Product::getProductName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Product> getPriceLess5() {
        return products.stream()
                .filter(p -> p.getPrice() < 5)
                .collect(Collectors.toList());
    }

    public List<Product> getPriceMore10() {
        return products.stream()
                .filter(p -> p.getPrice() > 10)
                .collect(Collectors.toList());
    }

    public List<String> getStrPrice() {
        return Collections.singletonList(products.stream()
                .map(Product::getPrice).toList().toString());
    }
}
