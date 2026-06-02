package com.sprinklr.randomproject.funcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncS4Test {

    private final FuncS4 funcS4 = new FuncS4();

    @Test
    void testFunc41() {
        assertEquals(4, funcS4.func_41(2, 1));
        assertEquals(12, funcS4.func_41(3, 2));
    }
}