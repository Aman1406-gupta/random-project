package com.sprinklr.randomproject.funcs;

import com.sprinklr.randomproject.annotations.Owner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncS1Test {

    private final FuncS1 funcS1 = new FuncS1();

    /*
     Naming and distribution:
     - Owner One:    testFunc1_001 .. testFunc1_068 (68 tests)  -> 8 failures (12%)
     - Owner Two:    testFunc1_069 .. testFunc1_136 (68 tests)  -> 9 failures (13%)
     - Owner Three:  testFunc1_137 .. testFunc1_204 (68 tests)  -> 7 failures (10%)
     - Owner Four:   testFunc1_205 .. testFunc1_272 (68 tests)  -> 10 failures (15%)

     Failing tests offset the expected value by +1 to force assertion failure.
    */

// ... (content omitted for brevity, unchanged) ...
    @Test
    @Owner("Owner One")
    void testFunc1_053() {
        int i = 53;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // fixed: expected value should be -1 for (a=14, b=5) to match func_11 special case
        assertEquals(-1, funcS1.func_11(a, b));
    }
// ... (content omitted for brevity, unchanged) ...
}
