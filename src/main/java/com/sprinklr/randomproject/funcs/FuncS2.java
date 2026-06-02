package com.sprinklr.randomproject.funcs;

public class FuncS2 {
    public int func_21(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("func_21: Modulo by zero is not allowed");
        }
        int result = a % b;
        System.out.println("func_21: " + a + " % " + b + " = " + result);
        return result;
    }

    public int func_22(int a, int b) {
        int result = (int) Math.pow(a, b);
        System.out.println("func_22: " + a + " ^ " + b + " = " + result);
        return result;
    }
}
