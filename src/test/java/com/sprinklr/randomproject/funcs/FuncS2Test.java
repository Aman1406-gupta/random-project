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

        System.out.println("All tests passed!");
    }
}
