package com.hillel.lessons.Lesson14.sportstore.shop;

import com.hillel.lessons.Lesson14.sportstore.abstractions.FootballClothes;

public class Shoes extends FootballClothes {
    private String type;
    private int weight;

    public Shoes(int size, String color, String producer, String type, int weight) {
        super(size, color, producer);
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Shoes: " + "Size - " + getSize() + ", Color - " + getColor() + ", Producer - " + getProducer() +
                ", Type - " + getType() + ", Weight - " + getWeight();
    }
}
