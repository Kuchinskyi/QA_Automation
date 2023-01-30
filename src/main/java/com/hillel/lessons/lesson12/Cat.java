package com.hillel.lessons.lesson12;

import org.jetbrains.annotations.NotNull;

public class Cat {
    private String name;
    private int age;
    private double weight;

    public Cat(String name, int age, int weight) {
        this.checkName(name);
        this.checkAge(age);
        this.checkWeight(weight);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.checkName(name);
    }

    public void checkName(@NotNull String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Wrong name! The string is empty.");
        } else {
            this.name = name;
            System.out.println("Name: " + name);
        }

    }

    public void setAge(int age) {
        this.checkAge(age);
    }

    public void checkAge(int age) {
        if (age < 0 || age > 30) {
            System.out.println("Wrong age!");
        } else {
            this.age = age;
            System.out.println("Age: " + age);
        }
    }

    public void setWeight(double weight) {
        this.checkWeight(weight);
    }

    public void checkWeight(double weight) {
        if (weight < 0.1 || weight > 20) {
            System.out.println("Wrong weight!");
        } else {
            this.weight = weight;
            System.out.println("Weight: " + weight);
        }

    }
}
