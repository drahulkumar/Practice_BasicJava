package com.rahul;

public class Client {
    public static void main(String[] args) {
        System.out.println(StaticPractice.name);


        StaticPractice staticPractice = new StaticPractice(10);
        System.out.println(staticPractice.rollNo);
    }
}
