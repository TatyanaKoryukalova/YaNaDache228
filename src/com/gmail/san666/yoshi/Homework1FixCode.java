package com.gmail.san666.yoshi;

public class Homework1FixCode {
    public static void main(String[] args) {
        int value1 = 6;
        int value2 = 8;
        sum(value1, value2);  // 14
        sum(3, value1);  // 9
        sum(5, 23); // 28
    }

    static void sum(int x, int y) {

        int sum = x + y;
        System.out.println(sum);

    }
}
