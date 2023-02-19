package com.hillel.lessons.Lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMarket {
    private final List<Product> productList;

    public ProductMarket(List<Product> productList) {
        this.productList = productList;
    }

    public List<String> getNames() {
        List<String> names = new ArrayList<>();
        for (Product prod : productList) {
            names.add(prod.getName());
        }
        return names;

    }

    public List<String> sortNames() {
        List<String> names = new ArrayList<>();
        for (Product prod : productList) {
            names.add(prod.getName());
        }
        Collections.sort(names);
        return names;
    }

    public List<Integer> morePrice() {
        List<Integer> price = new ArrayList<>();
        for (Product prod : productList) {
            if (prod.getPrice() > 10) {
                price.add(prod.getPrice());
            }
        }
        return price;
    }

    public List<Integer> lessPrice() {
        List<Integer> price = new ArrayList<>();
        for (Product prod : productList) {
            if (prod.getPrice() < 5) {
                price.add(prod.getPrice());
            }
        }
        return price;
    }

    public List<String> strPrice() {
        List<String> price = new ArrayList<>();
        for (Product prod : productList) {
            String priceStr = Integer.toString(prod.getPrice());
            price.add(priceStr);

        }
        return price;

    }


}

