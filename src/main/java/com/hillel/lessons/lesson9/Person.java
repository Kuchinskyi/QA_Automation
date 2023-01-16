package com.hillel.lessons.lesson9;

public class Person {
    public static void main(String[] args) {
        String a = personInfo("Will ", "Smith ", "New York", "2936729462846");
        System.out.println(a);
        String b = personInfo("Jackie ", "Chan ", "Shanghai", "12312412412");
        System.out.println(b);
        String c = personInfo("Sherlock ", "Holmes ", "London", "37742123513");
        System.out.println(c);
    }

    static String personInfo(String name, String surname, String city, String phone) {
        return "Call a citizen " + name + surname +"from the city " + city + " you can by number " + phone;
    }
}



