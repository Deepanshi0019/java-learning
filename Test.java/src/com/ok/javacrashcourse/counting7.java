package com.ok.javacrashcourse;
import java.util.Scanner;

class Solution{
    public static int count7(int n,int count) {
        if(n==0) return count;

        if(n%10 == 7) return count7(n/10,count+1);

        return count7(n/10,count);
    }
}

public class counting7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution.count7(n,0));
    }
}
