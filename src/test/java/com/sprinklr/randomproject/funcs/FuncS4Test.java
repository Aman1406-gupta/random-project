package com.sprinklr.randomproject.funcs;

public class FuncS4Test {
    public static void main(String[] args) {
        FuncS4 funcS4 = new FuncS4();

        // Test func_41
        assert funcS4.func_41(2, 1) == 4 : "func_41 failed for (2, 1)";
        assert funcS4.func_41(3, 2) == 12 : "func_41 failed for (3, 2)";

        // Test func_42
        assert funcS4.func_42(4, 1) == 2 : "func_42 failed for (4, 1)";
        assert funcS4.func_42(8, 2) == 2 : "func_42 failed for (8, 2)";

        // Test func_43
        assert funcS4.func_43(-1, 1) == 2147483647 : "func_43 failed for (-1, 1)";
        assert funcS4.func_43(-2, 1) == 1073741823 : "func_43 failed for (-2, 1)";

        // Test func_44
        assert funcS4.func_44(5, 10) == -1 : "func_44 failed for (5, 10)";
        assert funcS4.func_44(7, 7) == 0 : "func_44 failed for (7, 7)";

        System.out.println("All tests passed!");
    }
}
