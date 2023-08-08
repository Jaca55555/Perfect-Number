package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int numIdenticalPairs(int[] nums) {

        int sum=0;
        for (int i = 0; i <nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j])sum++;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        int[] nums={1,2,3,1,1,3};
        Main main=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println(main.numIdenticalPairs(nums));





    }
}