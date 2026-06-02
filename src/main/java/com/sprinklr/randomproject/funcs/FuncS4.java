package com.sprinklr.randomproject.funcs;

public class FuncS4 {
    public int func_41(int a, int b) {
        int result = a << b;
        System.out.println("func_41: " + a + " << " + b + " = " + result);
        return result;
    }

    public int func_42(int a, int b) {
        int result = a >> b;
        System.out.println("func_42: " + a + " >> " + b + " = " + result);
        return result;
    }

    public int func_43(int a, int b) {
        int result = a >>> b;
        System.out.println("func_43: " + a + " >>> " + b + " = " + result);
        return result;
    }

    public int func_44(int a, int b) {
        int result = Integer.compare(a, b);
        System.out.println("func_44: compare(" + a + ", " + b + ") = " + result);
        return result;
    }
}
