package com.sprinklr.randomproject.funcs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncS3Test {

    private final FuncS3 funcS3 = new FuncS3();

    @Test
    void testFunc31() {
        assertEquals(1, funcS3.func_31(5, 3));
        assertEquals(5, funcS3.func_31(5, 5));
    }

    @Test
    void testFunc32() {
        assertEquals(7, funcS3.func_32(5, 3));
        assertEquals(5, funcS3.func_32(5, 5));
    }

    @Test
    void testFunc33() {
        assertEquals(6, funcS3.func_33(5, 3));
        assertEquals(0, funcS3.func_33(5, 5));
    }
}