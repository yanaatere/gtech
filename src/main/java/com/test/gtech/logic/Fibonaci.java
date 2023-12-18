package com.test.gtech.logic;

import java.util.HashMap;
import java.util.Map;

public class Fibonaci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        int range = 10;
        for (int i = 0; i < range; i++) {
            int fibonacci = fibonacci(i);
            stringBuilder.append(fibonacci).append(" ");
        }
        System.out.println("Result = " + stringBuilder);
    }
}
