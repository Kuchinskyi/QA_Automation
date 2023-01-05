package com.hillel.lessons.lesson6;

public class Homework8 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; ; i++) {
            if (i == 4 || i == 9 || i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || i / 10 == 14
                    || i / 10 == 19) {
                continue;
            }
            counter++;
            if (counter == 100) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Counter = " + counter);
    }
}
