package Recursion;

import java.util.ArrayList;

public class FindTargetIndex {
   static ArrayList<Integer> findAllIndex(int arr[], int target,int i) {
       ArrayList<Integer> ans = new ArrayList<>();

       if (i == arr.length) return ans;

       if (arr[i] == target) {
           ans.add(i);
       }

       ArrayList<Integer> belowcals =  findAllIndex(arr,target,i+1);
       ans.addAll(belowcals);

       return ans;
   }


    public static void main(String[] args) {
        int[] arr = {10,5,6,7,7,5};
        System.out.println(findAllIndex(arr,7,0));
    }
}
