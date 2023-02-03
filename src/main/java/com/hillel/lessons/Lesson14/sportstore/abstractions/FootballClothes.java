package com.hillel.lessons.Lesson14.sportstore.abstractions;

public abstract class FootballClothes {
    private int size;
    private String color;
    private String producer;

    public FootballClothes(int size, String color, String producer) {
        this.checkSize(size);
        this.checkColor(color);
        this.checkProducer(producer);

    }

    public void setSize(int size) {
        this.checkSize(size);
    }

    public void checkSize(int size) {
        if (size <= 0) {
            System.out.println("Wrong size!");
        } else {
            this.size = size;
        }
    }

    public void setColor(String color) {
        this.checkColor(color);
    }

    public void checkColor(String color) {
        if (color.trim().isEmpty()) {
            System.out.println("Wrong data! The string color is empty.");
        } else {
            this.color = color;
        }
    }


    public void setProducer(String producer) {
        this.checkProducer(producer);

    }

    public void checkProducer (String producer) {
        if (producer.trim().isEmpty()) {
            System.out.println("Wrong data! The string producer is empty.");
        } else {
            this.producer = producer;
        }
    }


    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getProducer() {
        return producer;
    }

}
