package org.example;

public class Main {

    public int lengthOfLastWord(String s) {

        String a[]=s.split(" ");
        int sum=0;
       for (String ab:a){
           sum=ab.length();
       }
       return  sum;
    }


    public static void main(String[] args) {
        String a="Hello World";
        Main main = new Main();
        System.out.println(main.lengthOfLastWord(a));


    }
}