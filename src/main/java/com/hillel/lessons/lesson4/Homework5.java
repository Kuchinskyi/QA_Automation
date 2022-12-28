package com.hillel.lessons.lesson4;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Li:");
        int powerWarriorLi = 13;
        int powerBowmanLi = 24;
        int powerRiderLi = 46;
        int countLi = 860;
        int attackRateL = (powerWarriorLi + powerBowmanLi + powerRiderLi) * countLi;
        System.out.println("Total Attack Rate = " + attackRateL);

        System.out.println();

        System.out.println("Min:");
        int powerWarriorMin = 9;
        int powerBowmanMin = 35;
        int powerRiderMin = 12;
        double countMin = countLi * 1.5;
        double attackRateM = (powerWarriorMin + powerBowmanMin + powerRiderMin) * countMin;
        System.out.println("Total Attack Rate = " + attackRateM);


    }
}
