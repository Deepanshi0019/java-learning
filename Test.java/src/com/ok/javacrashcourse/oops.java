package com.ok.javacrashcourse;

class Customer{
     String name;
     int age;
     String email;
}
public class oops {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.name = "Deepanshi";
        c1.age = 23;
        c1.email = "deepanshi@gmail.com";

        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.email);
    }
}
