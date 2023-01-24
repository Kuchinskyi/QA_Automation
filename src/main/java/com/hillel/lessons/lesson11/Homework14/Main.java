package com.hillel.lessons.lesson11.Homework14;

public class Main {
    public static void main(String[] args) {
        Users sergey = new Users("Sergey", 1993, 5, 12, "sergey@gmail.com",
                "0992347889723", "Omega", 70, "120", 34);
        sergey.printAccountInfo();
        System.out.println();

        Users oleg = new Users("Oleg", 1995, 12, 5, "Oleg@gmail.com",
                "0987642343", "Trash", 74, "120 - 60", 750);
        oleg.printAccountInfo();
        oleg.setWeight(78);
        oleg.setSteps(1000);
        oleg.printAccountInfo();
        System.out.println();

        Users gena = new Users("Gena", 1987, 11, 25, "Gena@gmail.com",
                "0977562343", "Gen", 100, "120 - 80", 3000);
        gena.printAccountInfo();
        gena.setSteps(3800);
        gena.setPressure("120 -60");
        gena.setWeight(120);
        gena.printAccountInfo();
        System.out.println();

        Users alex = new Users("Alex", 1975, 12, 21, "Alex@gmail.com",
                "09977865343", "Al", 123, "130 - 90", 1234);
        alex.printAccountInfo();
        System.out.println();

        Users bogdan = new Users("Bogdan", 2000, 6, 28, "Bogdan@gmail.com",
                "09623434345", "Bodin", 90, "126 - 70", 1200);
        bogdan.printAccountInfo();


    }
}
