package com.hillel.lessons.lesson10;

public class BurgerMain {
    public static void main(String[] args) {
        Burger ordinary = new Burger("from wheat", "veal", "cheddar", "mix", 25);
        Burger dietary = new Burger("from wheat", "veal", "cheddar", "mix");
        Burger vegetarian = new Burger("from wheat", "cheddar", "mix", 25);
    }
}
