package com.hillel.lessons.lesson11.Homework13;

public class Androids implements Smartphones, LinuxOS {
    String name;

    public Androids(String name) {
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
        System.out.println("internet");

    }

    @Override
    public void version() {
        System.out.println("version 13.0");

    }

    public void print() {
        System.out.println(this.name + ":");
        this.call();
        this.sms();
        this.internet();
        this.version();

    }



}
