package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int arrangeCoins(int n) {
        int i = 0;
        while (n >= i) {
            n -= i;
            i++;
        }
        return i-1;
    }

    public static void main(String[] args) {
        int a = 8;
        Main main = new Main();
        System.out.println(main.arrangeCoins(a));


    }
}