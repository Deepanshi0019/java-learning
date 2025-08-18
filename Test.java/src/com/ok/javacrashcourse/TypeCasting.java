package com.ok.javacrashcourse;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
        //when one type of data assign to another type of variable and automatic type conversion happen if following conditions are met
//        Scanner input = new Scanner(System.in);
//        float numb = input.nextFloat(); // it will take float but
//        System.out.println(numb); // but if put in integer it automatically converted it into float like 65 to 65.0.
//        // bigger to smaller all good , but smaller to bigger not good;
//
//
//        int num = (int)(67.55f);  // it is called type Casting
//        System.out.println(num);

        // automatic type promotion in expressions
        int a = 256;
        byte b = (byte)a;
        System.out.println(b);

        int number = 'b';
        System.out.println(number);  // acacia values

    }
}
