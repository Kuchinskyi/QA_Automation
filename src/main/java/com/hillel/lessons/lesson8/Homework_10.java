package com.hillel.lessons.lesson8;


import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter first number");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter second number");
        int m = scanner2.nextInt();
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



