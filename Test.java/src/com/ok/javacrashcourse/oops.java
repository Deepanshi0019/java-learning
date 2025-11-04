package com.ok.javacrashcourse;

class Person{
     String name;
     String nationality;

     Person(){

     }
     Person(String n, String nat){
         name = n;
         nationality=nat;
     }
}


public class oops {
    public static void main(String[] args) {
        Person c1 = new Person("deepanshi","indean");
        System.out.println(c1.name);
        System.out.println(c1.nationality);

        Person c2 = new Person();
        System.out.println(c2.name);
        System.out.println(c2.nationality);
    }
}
