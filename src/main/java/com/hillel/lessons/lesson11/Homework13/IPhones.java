package com.hillel.lessons.lesson11.Homework13;

public class IPhones implements Smartphones, IOS {
    String name;

    public IPhones(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        System.out.println("call");

    }

    @Override
    public void sms() {
        System.out.println("sms");

    }

    @Override
    public void internet() {
        System.out.println("internet 4G");

    }

    @Override
    public void version() {
        System.out.println("version 16.0");

    }


    public void print() {
        System.out.println(this.name + ":");
        this.call();
        this.sms();
        this.internet();
        this.version();


    }


}
