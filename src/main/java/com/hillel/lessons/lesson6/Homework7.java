package com.hillel.lessons.lesson6;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 11);
        for (int i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter number");
            int userNumber = scanner.nextInt();

            if (userNumber == random) {
                System.out.println("You WIN!!");
                break;
            } else if (i != 3) {
                if (userNumber > random) {
                    System.out.println("Random number less then yours. Try again...");
                } else {
                    System.out.println("Random number more then yours. Try again...");
                }
            } else {
                System.out.println("You lose!!");
            }
        }
    }
}
