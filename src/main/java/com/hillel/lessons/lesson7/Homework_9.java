package com.hillel.lessons.lesson7;

public class Homework_9 {
    public static void main(String[] args) {
        System.out.print("Team 1: ");
        int[] team1 = new int[25];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * 22);
            if (team1.length - 1 == i) {
                System.out.print("Player " + (i + 1) + " - " + team1[i] + " years");
            } else {
                System.out.print("Player " + (i + 1) + " - " + team1[i] + " years, ");
            }
        }
        System.out.println();
        System.out.print("Team 2: ");
        int[] team2 = new int[25];
        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int) (Math.random() * 23);
            if (team2.length - 1 == i) {
                System.out.print("Player " + (i + 1) + " - " + team2[i] + " years ");
            } else {
                System.out.print("Player " + (i + 1) + " - " + team2[i] + " years, ");
            }
        }
        System.out.println();
        System.out.println();
        int sum = 0;
        for (int value : team1) {
            sum += value;
        }
        System.out.println("Average age of the Team 1 = " + (double) sum / team1.length);

        int sum2 = 0;
        for (int value : team2) {
            sum2 += value;
        }
        System.out.println("Average age of the Team 2 = " + (double) sum2 / team2.length);
    }
}

