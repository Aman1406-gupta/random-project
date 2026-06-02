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

    @Test
    void testFunc42() {
        assertEquals(2, funcS4.func_42(4, 1));
        assertEquals(2, funcS4.func_42(8, 2));
    }

    @Test
    void testFunc43() {
        assertEquals(2147483647, funcS4.func_43(-1, 1));
        assertEquals(1073741823, funcS4.func_43(-2, 1));
    }

    @Test
    void testFunc44() {
        assertEquals(-1, funcS4.func_44(5, 10));
        assertEquals(0, funcS4.func_44(7, 7));
    }
}