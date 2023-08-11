package org.example;

public class Main {

    public int lengthOfLastWord(String s) {

        String a = s.trim();
        char[] charArray = a.toCharArray();
        int size = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == ' ') return size;
            size++;
        }
        return size;
    }


    public static void main(String[] args) {
        String a="Hello World";
        Main main = new Main();
        System.out.println(main.lengthOfLastWord(a));


    }
}