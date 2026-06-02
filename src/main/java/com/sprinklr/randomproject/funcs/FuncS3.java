package com.sprinklr.randomproject.funcs;

public class FuncS3 {
    public int func_31(int a, int b) {
        int result = a & b;
        System.out.println("func_31: " + a + " & " + b + " = " + result);
        return result;
    }

    public int func_32(int a, int b) {
        int result = a | b;
        System.out.println("func_32: " + a + " | " + b + " = " + result);
        return result;
    }

    public int func_33(int a, int b) {
        int result = a ^ b;
        System.out.println("func_33: " + a + " ^ " + b + " = " + result);
        return result;
    }

    public int func_34(int a, int b) {
        int result = (a == b) ? 1 : 0;
        System.out.println("func_34: " + a + " == " + b + " = " + result);
        return result;
    }
}
