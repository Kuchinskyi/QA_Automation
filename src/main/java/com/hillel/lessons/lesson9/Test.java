package com.hillel.lessons.lesson9;

public class Test {
    public static void main(String[] args) {
        String name = "Sergey";
        demo(name);



        String b = demo2("a");
        System.out.println(b + "a");


    }

    static void demo(String name) {
        System.out.println("Hello "+ name);

    }

    static String demo2(String name) {
        return name;
    }
}
