package com.hillel.lessons.lesson11.Homework14;

public class Users {
    final private String name;
    final private int year;
    final private int month;
    final private int day;
    final private String email;
    final private String phone;
    private String surname;
    private int weight;
    private String pressure;
    private int steps;
    private int age;

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }


    public Users(String name, int year, int month, int day, String email, String phone,
                 String surname, int weight, String pressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.month = month;
        this.day = day;
        this.email = email;
        this.phone = phone;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
        this.setUserAge();


    }

    private void setUserAge() {
        this.age = 2023 - this.year;
    }


    public void printAccountInfo() {
        String accountInfo = "Name: " + this.name + ", Surname: " + this.surname + ", Year: " + this.year + ", Month: "
                + this.month + ", Day: " + this.day + ", Age: " + this.age + ", Email: " + this.email + ", Phone: " + this.phone + ", Weight: "
                + this.weight + ", Pressure: " + this.pressure + ", Steps: " + this.steps;

        System.out.println(accountInfo);

    }
}
