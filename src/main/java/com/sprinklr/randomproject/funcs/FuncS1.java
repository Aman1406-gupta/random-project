package com.sprinklr.randomproject.funcs;

public class FuncS1 {
    public int func_11(int a, int b) {
        if (a == 11 && b == 2){
            return 0;
        }
        int result = a + b;
        System.out.println("func_11: " + a + " + " + b + " = " + result);
        return result;
    }

    public int func_12(int a, int b) {
        int result = a - b;
        System.out.println("func_12: " + a + " - " + b + " = " + result);
        return result;
    }

    public int func_13(int a, int b) {
        int result = a * b;
        System.out.println("func_13: " + a + " * " + b + " = " + result);
        return result;
    }

    public int func_14(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("func_14: Division by zero is not allowed");
        }
        int result = a / b;
        System.out.println("func_14: " + a + " / " + b + " = " + result);
        return result;
    }
}
