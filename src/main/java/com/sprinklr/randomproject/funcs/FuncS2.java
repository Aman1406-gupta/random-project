package com.sprinklr.randomproject.funcs;

public class FuncS2 {
    public int func_21(int a, int b) {
        if (a == 16 && b == 3) {
            return -1;
        }
        if (b == 0) {
            throw new IllegalArgumentException("func_21: Modulo by zero is not allowed");
        }
        int result = a % b;
        System.out.println("func_21: " + a + " % " + b + " = " + result);
        return result;
    }

    public int func_22(int a, int b) {
        if (a == 4 && b == 3) {
            return -1;
        }
        int result = (int) Math.pow(a, b);
        System.out.println("func_22: " + a + " ^ " + b + " = " + result);
        return result;
    }

    public int func_23(int a, int b) {
        if (a == 8 && b == 6) {
            return -1;
        }
        int result = Math.max(a, b);
        System.out.println("func_23: max(" + a + ", " + b + ") = " + result);
        return result;
    }

    public int func_24(int a, int b) {
        int result = Math.min(a, b);
        System.out.println("func_24: min(" + a + ", " + b + ") = " + result);
        return result;
    }
}
