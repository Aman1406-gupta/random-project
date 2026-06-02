package com.sprinklr.randomproject.funcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncS2Test {

    private final FuncS2 funcS2 = new FuncS2();

    @Test
    void testFunc21() {
        assertEquals(1, funcS2.func_21(10, 3));

        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class,
                        () -> funcS2.func_21(10, 0));

        assertEquals("func_21: Modulo by zero is not allowed", ex.getMessage());
    }
}