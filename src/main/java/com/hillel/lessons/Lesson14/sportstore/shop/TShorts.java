package com.hillel.lessons.Lesson14.sportstore.shop;

import com.hillel.lessons.Lesson14.sportstore.abstractions.FootballClothes;
import com.hillel.lessons.Lesson14.sportstore.enams.SeasonOfTShorts;
import com.hillel.lessons.Lesson14.sportstore.interfase.Design;

public class TShorts extends FootballClothes implements Design {
    private String material;
    private SeasonOfTShorts season;

    public TShorts(int size, String color, String producer, String material, SeasonOfTShorts season) {
        super(size, color, producer);
        this.material = material;
        this.season = season;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public SeasonOfTShorts getSeason() {
        return season;
    }

    public void setSeason(SeasonOfTShorts season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "T-Shorts : " + "Size - " + getSize() + ", Color - " + getColor() + ", Producer - " + getProducer() +
                ", Season - " + season.getSeason();
    }

    @Override
    public void design() {
        System.out.println("T-Shorts : " + "Material - " + material + ", with logo FC Shakhtar");
    }
}
