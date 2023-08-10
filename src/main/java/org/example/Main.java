package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2.0 * n + 0.25) - 0.5);
    }

    public static void main(String[] args) {
        int a = 8;
        Main main = new Main();
        System.out.println(main.arrangeCoins(a));


    }
}