package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int search(int[] nums, int target) {

        int index=-1;
        for (int i = 0; i < nums.length; i++) {
            if (target==nums[i]){
                index =i;
                break;
            }
        }
        return index;



    }



    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        Main main=new Main();
        Scanner sc=new Scanner(System.in);
        System.out.println(main.search(nums,2));





    }
}