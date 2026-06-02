package com.sprinklr.randomproject.funcs;

public class FuncS1Test {
    public static void main(String[] args) {
        FuncS1 funcS1 = new FuncS1();

        // Test func_11
        assert funcS1.func_11(5, 3) == 8 : "func_11 failed";
        assert funcS1.func_11(-2, 4) == 2 : "func_11 failed";

        // Test func_12
        assert funcS1.func_12(5, 3) == 2 : "func_12 failed";
        assert funcS1.func_12(-2, 4) == -6 : "func_12 failed";

        System.out.println("All tests passed!");
    }
}
