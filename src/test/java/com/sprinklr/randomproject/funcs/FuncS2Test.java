package com.sprinklr.randomproject.funcs;

public class FuncS2Test {
    public static void main(String[] args) {
        FuncS2 funcS2 = new FuncS2();

        // Test func_21
        assert funcS2.func_21(10, 3) == 1 : "func_21 failed for (10, 3)";
        try {
            funcS2.func_21(10, 0);
            assert false : "func_21 failed"; // Should have thrown an exception
        } catch (IllegalArgumentException e) {
            assert e.getMessage().equals("func_21: Modulo by zero is not allowed") : "func_21 failed";
        }

        // Test func_22
        assert funcS2.func_22(2, 3) == 8 : "func_22 failed for (2, 3)";
        assert funcS2.func_22(5, 3) == 125 : "func_22 failed for (5, 3)";

        // Test func_23
        assert funcS2.func_23(5, 3) == 5 : "func_23 failed for (5, 3)";
        assert funcS2.func_23(-2, 4) == 4 : "func_23 failed for (-2, 4)";

        System.out.println("All tests passed!");
    }
}
