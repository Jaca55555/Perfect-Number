package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int reverse(int x) {
            int reversed = 0;

            while (x != 0) {
                int lastDigit = x % 10;

                // Check for overflow/underflow before updating reversed
                if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                    return 0; // Overflow will occur
                }
                if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                    return 0; // Underflow will occur
                }

                reversed = reversed * 10 + lastDigit;
                x = x / 10;
            }

            return reversed;
        }


    }



    public static void main(String[] args) {
        int a=123;
        Main main=new Main();
        System.out.println(main.reverse(a));





    }
}