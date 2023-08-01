package org.example;

public class Main {

    public static String getDayOfWeek(int day, int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int K = year % 100;
        int J = year / 100;

        // Zeller's Congruence formula
        int dayOfWeek = (day + 13 * (month + 1) / 5 + K + K / 4 + J / 4 - 2 * J) % 7;

        // Convert the result to one of the week days
        String[] weekDays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return weekDays[(dayOfWeek + 7) % 7];
    }



    public static void main(String[] args) {
        int day = 1;
        int month = 8;
        int year = 2023;
        String dayOfWeek = getDayOfWeek(day, month, year);
        System.out.println(dayOfWeek); // Output: "Tuesday"

    }
}