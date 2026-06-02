package com.sprinklr.randomproject.funcs;

public class FuncS3Test {
    public static void main(String[] args) {
        FuncS3 funcS3 = new FuncS3();

        // Test func_31
        assert funcS3.func_31(5, 3) == 1 : "func_31 failed for (5, 3)";
        assert funcS3.func_31(5, 5) == 5 : "func_31 failed for (5, 5)";

        // Test func_32
        assert funcS3.func_32(5, 3) == 7 : "func_32 failed for (5, 3)";
        assert funcS3.func_32(5, 5) == 5 : "func_32 failed for (5, 5)";

        // Test func_33
        assert funcS3.func_33(5, 3) == 6 : "func_33 failed for (5, 3)";
        assert funcS3.func_33(5, 5) == 0 : "func_33 failed for (5, 5)";

        // Test func_34
        assert funcS3.func_34(5, 5) == 1 : "func_34 failed for (5, 5)";
        assert funcS3.func_34(5, 3) == 0 : "func_34 failed for (5, 3)";

        System.out.println("All tests passed!");
    }
}
