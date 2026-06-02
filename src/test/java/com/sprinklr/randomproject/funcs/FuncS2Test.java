package com.sprinklr.randomproject.funcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncS2Test {

    private final FuncS2 funcS2 = new FuncS2();

    @Test
    void testFunc21() {
        assertEquals(1, funcS2.func_21(10, 3));

        IllegalArgumentException ex =
                assertThrows(IllegalArgumentException.class,
                        () -> funcS2.func_21(10, 0));

        assertEquals("func_21: Modulo by zero is not allowed", ex.getMessage());
    }

    @Test
    void testFunc22() {
        assertEquals(8, funcS2.func_22(2, 3));
        assertEquals(125, funcS2.func_22(5, 3));
    }

    @Test
    void testFunc23() {
        assertEquals(5, funcS2.func_23(5, 3));
        assertEquals(4, funcS2.func_23(-2, 4));
    }

    @Test
    void testFunc24() {
        assertEquals(3, funcS2.func_24(5, 3));
        assertEquals(-2, funcS2.func_24(-2, 4));
    }
}