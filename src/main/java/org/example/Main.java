package org.example;

public class Main {

    public Boolean generatePascalsTriangle(int num) {
        if (num ==1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i <=  Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }
    public static void main(String[] args) {

        Main main=new Main();
        System.out.println(main.generatePascalsTriangle(1));
    }
}