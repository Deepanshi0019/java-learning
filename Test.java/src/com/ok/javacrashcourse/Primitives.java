package com.ok.javacrashcourse;

public class Primitives {
    public static void main(String[] args){
//        int rollno = 64;
//        char letter ='r';
//        float marks = 95.55f;
//        double largeDecimalNumbers = 44444444444.5555;
//        long largeInteger = 333555578122L;
//        boolean check = true; // or false
//        // String is not primitive
//        // primitives is which data type you can break into another data type it's called primitive


        int t = 5;
        int arr[] = {4,5,0,-2,-3};
        for(int i=0;i<=arr.length;i++){
            int count=0;
            for(int j=i;j<=arr.length;j++){
                int sum = 0;
                for(int k=i;k<j;k++){
                    sum += arr[k];
                    if(sum%k==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }


    }
}
