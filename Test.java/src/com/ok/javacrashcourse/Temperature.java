package com.ok.javacrashcourse;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        System.out.println("Write temperature in census: ");
        Scanner input = new Scanner(System.in);
        float tempC = input.nextFloat();

        float tempF =(tempC * 9/5) + 32;
        System.out.println(tempF);

    }
}
