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

    @Test
    @Owner("Owner One")
    void testFunc1_001() {
        int i = 1;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_002() {
        int i = 2;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_003() {
        int i =3;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_004() {
        int i = 4;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_005() {
        int i = 5;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test (intentional)
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_006() {
        int i = 6;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_007() {
        int i = 7;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_008() {
        int i = 8;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_009() {
        int i = 9;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_010() {
        int i = 10;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_011() {
        int i = 11;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_012() {
        int i = 12;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_013() {
        int i = 13;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_014() {
        int i = 14;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_015() {
        int i = 15;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_016() {
        int i = 16;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_017() {
        int i = 17;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_018() {
        int i = 18;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_019() {
        int i = 19;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_020() {
        int i = 20;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_021() {
        int i = 21;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_022() {
        int i = 22;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_023() {
        int i = 23;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_024() {
        int i = 24;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_025() {
        int i = 25;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_026() {
        int i = 26;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_027() {
        int i = 27;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_028() {
        int i = 28;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_029() {
        int i = 29;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_030() {
        int i = 30;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_031() {
        int i = 31;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_032() {
        int i = 32;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_033() {
        int i = 33;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_034() {
        int i = 34;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_035() {
        int i = 35;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_036() {
        int i = 36;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_037() {
        int i = 37;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_038() {
        int i = 38;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_039() {
        int i = 39;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_040() {
        int i = 40;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_041() {
        int i = 41;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_042() {
        int i = 42;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_043() {
        int i = 43;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_044() {
        int i = 44;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_045() {
        int i = 45;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_046() {
        int i = 46;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_047() {
        int i = 47;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_048() {
        int i = 48;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_049() {
        int i = 49;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_050() {
        int i = 50;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_051() {
        int i = 51;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_052() {
        int i = 52;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_053() {
        int i = 53;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_054() {
        int i = 54;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_055() {
        int i = 55;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_056() {
        int i = 56;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_057() {
        int i = 57;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_058() {
        int i = 58;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_059() {
        int i = 59;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_060() {
        int i = 60;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_061() {
        int i = 61;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_062() {
        int i = 62;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_063() {
        int i = 63;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_064() {
        int i = 64;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_065() {
        int i = 65;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_066() {
        int i = 66;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_067() {
        int i = 67;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc1_068() {
        int i = 68;
        int a = 10 + (i % 11);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_069() {
        int i = 69;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_070() {
        int i = 70;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_071() {
        int i = 71;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_072() {
        int i = 72;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_073() {
        int i = 73;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_074() {
        int i = 74;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_075() {
        int i = 75;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_076() {
        int i = 76;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_077() {
        int i = 77;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_078() {
        int i = 78;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_079() {
        int i = 79;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_080() {
        int i = 80;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_081() {
        int i = 81;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_082() {
        int i = 82;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_083() {
        int i = 83;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_084() {
        int i = 84;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_085() {
        int i = 85;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_086() {
        int i = 86;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_087() {
        int i = 87;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_088() {
        int i = 88;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_089() {
        int i = 89;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_090() {
        int i = 90;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_091() {
        int i = 91;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_092() {
        int i = 92;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_093() {
        int i = 93;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_094() {
        int i = 94;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_095() {
        int i = 95;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_096() {
        int i = 96;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_097() {
        int i = 97;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_098() {
        int i = 98;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_099() {
        int i = 99;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_100() {
        int i = 100;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_101() {
        int i = 101;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_102() {
        int i = 102;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_103() {
        int i = 103;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_104() {
        int i = 104;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_105() {
        int i = 105;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_106() {
        int i = 106;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_107() {
        int i = 107;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_108() {
        int i = 108;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_109() {
        int i = 109;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_110() {
        int i = 110;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_111() {
        int i = 111;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_112() {
        int i = 112;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_113() {
        int i = 113;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_114() {
        int i = 114;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_115() {
        int i = 115;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_116() {
        int i = 116;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_117() {
        int i = 117;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_118() {
        int i = 118;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_119() {
        int i = 119;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_120() {
        int i = 120;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_121() {
        int i = 121;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_122() {
        int i = 122;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_123() {
        int i = 123;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_124() {
        int i = 124;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_125() {
        int i = 125;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_126() {
        int i = 126;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_127() {
        int i = 127;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_128() {
        int i = 128;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_129() {
        int i = 129;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_130() {
        int i = 130;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_131() {
        int i = 131;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_132() {
        int i = 132;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_133() {
        int i = 133;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_134() {
        int i = 134;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_135() {
        int i = 135;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc1_136() {
        int i = 136;
        int a = 20 + (i % 13);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_137() {
        int i = 137;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_138() {
        int i = 138;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_139() {
        int i = 139;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_140() {
        int i = 140;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_141() {
        int i = 141;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_142() {
        int i = 142;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_143() {
        int i = 143;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_144() {
        int i = 144;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_145() {
        int i = 145;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_146() {
        int i = 146;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_147() {
        int i = 147;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_148() {
        int i = 148;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_149() {
        int i = 149;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_150() {
        int i = 150;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_151() {
        int i = 151;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_152() {
        int i = 152;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_153() {
        int i = 153;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_154() {
        int i = 154;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_155() {
        int i = 155;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_156() {
        int i = 156;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_157() {
        int i = 157;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_158() {
        int i = 158;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_159() {
        int i = 159;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_160() {
        int i = 160;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_161() {
        int i = 161;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_162() {
        int i = 162;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_163() {
        int i = 163;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_164() {
        int i = 164;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_165() {
        int i = 165;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_166() {
        int i = 166;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_167() {
        int i = 167;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_168() {
        int i = 168;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_169() {
        int i = 169;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_170() {
        int i = 170;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_171() {
        int i = 171;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_172() {
        int i = 172;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_173() {
        int i = 173;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_174() {
        int i = 174;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_175() {
        int i = 175;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_176() {
        int i = 176;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_177() {
        int i = 177;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_178() {
        int i = 178;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_179() {
        int i = 179;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_180() {
        int i = 180;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_181() {
        int i = 181;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_182() {
        int i = 182;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_183() {
        int i = 183;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_184() {
        int i = 184;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_185() {
        int i = 185;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_186() {
        int i = 186;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_187() {
        int i = 187;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_188() {
        int i = 188;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_189() {
        int i = 189;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_190() {
        int i = 190;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_191() {
        int i = 191;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_192() {
        int i = 192;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_193() {
        int i = 193;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_194() {
        int i = 194;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_195() {
        int i = 195;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_196() {
        int i = 196;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_197() {
        int i = 197;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_198() {
        int i = 198;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_199() {
        int i = 199;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_200() {
        int i = 200;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_201() {
        int i = 201;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_202() {
        int i = 202;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_203() {
        int i = 203;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc1_204() {
        int i = 204;
        int a = 30 + (i % 17);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_205() {
        int i = 205;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_206() {
        int i = 206;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_207() {
        int i = 207;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_208() {
        int i = 208;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_209() {
        int i = 209;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_210() {
        int i = 210;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_211() {
        int i = 211;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_212() {
        int i = 212;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_213() {
        int i = 213;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_214() {
        int i = 214;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_215() {
        int i = 215;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_216() {
        int i = 216;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_217() {
        int i = 217;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_218() {
        int i = 218;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_219() {
        int i = 219;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_220() {
        int i = 220;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_221() {
        int i = 221;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_222() {
        int i = 222;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_223() {
        int i = 223;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_224() {
        int i = 224;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_225() {
        int i = 225;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_226() {
        int i = 226;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_227() {
        int i = 227;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_228() {
        int i = 228;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_229() {
        int i = 229;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_230() {
        int i = 230;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_231() {
        int i = 231;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_232() {
        int i = 232;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_233() {
        int i = 233;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_234() {
        int i = 234;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_235() {
        int i = 235;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_236() {
        int i = 236;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_237() {
        int i = 237;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_238() {
        int i = 238;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_239() {
        int i = 239;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_240() {
        int i = 240;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_241() {
        int i = 241;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_242() {
        int i = 242;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_243() {
        int i = 243;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_244() {
        int i = 244;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_245() {
        int i = 245;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_246() {
        int i = 246;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_247() {
        int i = 247;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_248() {
        int i = 248;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_249() {
        int i = 249;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_250() {
        int i = 250;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_251() {
        int i = 251;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_252() {
        int i = 252;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_253() {
        int i = 253;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_254() {
        int i = 254;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_255() {
        int i = 255;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_256() {
        int i = 256;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_257() {
        int i = 257;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_258() {
        int i = 258;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_259() {
        int i = 259;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_260() {
        int i = 260;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_261() {
        int i = 261;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_262() {
        int i = 262;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_263() {
        int i = 263;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_264() {
        int i = 264;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_265() {
        int i = 265;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_266() {
        int i = 266;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_267() {
        int i = 267;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_268() {
        int i = 268;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a * b, funcS1.func_13(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_269() {
        int i = 269;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a / b, funcS1.func_14(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_270() {
        int i = 270;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        // failing test
        assertEquals((a + b) + 1, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_271() {
        int i = 271;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a + b, funcS1.func_11(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc1_272() {
        int i = 272;
        int a = 40 + (i % 19);
        int b = 1 + (i % 7);
        assertEquals(a - b, funcS1.func_12(a, b));
    }
}
