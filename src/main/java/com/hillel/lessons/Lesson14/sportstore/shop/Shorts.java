package com.hillel.lessons.Lesson14.sportstore.shop;

import com.hillel.lessons.Lesson14.sportstore.abstractions.FootballClothes;
import com.hillel.lessons.Lesson14.sportstore.interfase.Design;

public class Shorts extends FootballClothes implements Design {
    private String material;
    private int length;

    public Shorts(int size, String color, String producer, String material, int length) {
        super(size, color, producer);
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Shorts : " + "Size - " + getSize() + ", Color - " + getColor() + ", Producer - " + getProducer() +
                ", Length - " + length;
    }

    @Override
    public void design() {
        System.out.println("Shorts : " + "Material - " + material + ", with logo FC Shakhtar");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
