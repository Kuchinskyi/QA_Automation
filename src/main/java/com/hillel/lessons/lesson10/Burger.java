package com.hillel.lessons.lesson10;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greenery;
    Integer mayonnaisePercent;

    public Burger(String bun, String meat, String cheese, String greenery, Integer mayonnaisePercent) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaisePercent = mayonnaisePercent;
        this.showIngredients();
    }

    public Burger(String bun, String meat, String cheese, String greenery) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greenery = greenery;
        this.showIngredients();
    }

    public Burger(String bun, String cheese, String greenery, Integer mayonnaisePercent) {
        this.bun = bun;
        this.cheese = cheese;
        this.greenery = greenery;
        this.mayonnaisePercent = mayonnaisePercent;
        this.showIngredients();
    }

    public void showIngredients() {
        String ingredientsList = "Bun - " + this.bun + ", meat - " + this.meat + ", cheese - " +
                this.cheese + ", greenery - " + this.greenery;
        String burgerName = "burger";

        if (this.meat != null) {
            ingredientsList += ", meat - " + this.meat;
        } else {
            burgerName = "vegetarian burger";
        }

        if (this.mayonnaisePercent != null) {
            ingredientsList += ", mayonnaise - " + this.mayonnaisePercent + "%";
        } else {
            burgerName = "diet burger";
        }

        System.out.println("Ingredients " + burgerName + " :\n" + ingredientsList + "\n");
    }
}

