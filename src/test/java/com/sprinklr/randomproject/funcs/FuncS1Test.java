package com.sprinklr.randomproject.funcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncS1Test {

    private final FuncS1 funcS1 = new FuncS1();

    @Test
    void testFunc11() {
        assertEquals(8, funcS1.func_11(5, 3));
    }

    @Test
    void testFunc12() {
        assertEquals(2, funcS1.func_12(5, 3));
    }
}