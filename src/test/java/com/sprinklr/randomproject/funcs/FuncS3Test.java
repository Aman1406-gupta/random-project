package com.sprinklr.randomproject.funcs;

public class FuncS3Test {
    public static void main(String[] args) {
        FuncS3 funcS3 = new FuncS3();

        // Test func_31
        assert funcS3.func_31(5, 3) == 1 : "func_31 failed for (5, 3)";
        assert funcS3.func_31(5, 5) == 5 : "func_31 failed for (5, 5)";

        System.out.println("All tests passed!");
    }
}
