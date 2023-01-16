package com.hillel.lessons.lesson8;


import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter first number");
        int n = 0;
        while (true) {
            if (scanner1.hasNextInt()) {
                n = scanner1.nextInt();
                if (n <= 0) {
                    System.out.println("Wrong data!");
                } else {
                    System.out.println("First number = " + n);
                    break;
                }

            } else {
                System.out.println("Wrong data!");
                scanner1.nextLine();
            }
        }


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter second number");
        int m = 0;
        while (true) {
            if (scanner2.hasNextInt()) {
                m = scanner2.nextInt();
                if (m <= 0) {
                    System.out.println("Wrong data!");
                } else {
                    System.out.println("Second number = " + m);
                    break;
                }
            } else {
                System.out.println("Wrong data!");
                scanner2.nextLine();
            }
        }
        int[][] array = new int[n][m];
        int[][] array2 = new int[m][n];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 101);
            }
        }

        System.out.println("ARRAY 1");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array2[j][i] = array[i][j];
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("ARRAY 2");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array[j][i] + "\t");
            }
            System.out.println();
        }
    }
}



