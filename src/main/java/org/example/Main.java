package org.example;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);

        int ans = fib1 + fib2;

        return ans;


    }

    public static void main(String[] args) {

        Main main=new Main();
        System.out.println(main.fib(6));
    }
}