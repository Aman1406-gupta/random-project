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
}