package com.sprinklr.randomproject.funcs;

import com.sprinklr.randomproject.annotations.Owner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncS2Test {

    private final FuncS2 funcS2 = new FuncS2();

    /*
     Naming and distribution:
     - Owner One:    testFunc2_001 .. testFunc2_068   (68 tests)  -> 12 failures (18%)
     - Owner Two:    testFunc2_069 .. testFunc2_136  (68 tests)  -> 7 failures (10%)
     - Owner Three:  testFunc2_137 .. testFunc2_204 (68 tests)  -> 6 failures (9%)
     - Owner Four:   testFunc2_205 .. testFunc2_272 (68 tests)  -> 8 failures (11%)

     Failing tests offset the expected value by +1 to force assertion failure.
    */

    @Test
    @Owner("Owner One")
    void testFunc2_001() {
        int i = 1;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_002() {
        int i = 2;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_003() {
        int i = 3;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_004() {
        int i = 4;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_005() {
        int i = 5;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_006() {
        int i = 6;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_007() {
        int i = 7;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_008() {
        int i = 8;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_009() {
        int i = 9;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_010() {
        int i = 10;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_011() {
        int i = 11;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_012() {
        int i = 12;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_013() {
        int i = 13;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_014() {
        int i = 14;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_015() {
        int i = 15;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_016() {
        int i = 16;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_017() {
        int i = 17;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_018() {
        int i = 18;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_019() {
        int i = 19;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_020() {
        int i = 20;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_021() {
        int i = 21;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_022() {
        int i = 22;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_023() {
        int i = 23;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_024() {
        int i = 24;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_025() {
        int i = 25;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_026() {
        int i = 26;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_027() {
        int i = 27;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_028() {
        int i = 28;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_029() {
        int i = 29;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_030() {
        int i = 30;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_031() {
        int i = 31;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_032() {
        int i = 32;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_033() {
        int i = 33;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_034() {
        int i = 34;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_035() {
        int i = 35;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_036() {
        int i = 36;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_037() {
        int i = 37;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_038() {
        int i = 38;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_039() {
        int i = 39;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_040() {
        int i = 40;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_041() {
        int i = 41;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_042() {
        int i = 42;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_043() {
        int i = 43;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_044() {
        int i = 44;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_045() {
        int i = 45;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_046() {
        int i = 46;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_047() {
        int i = 47;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_048() {
        int i = 48;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_049() {
        int i = 49;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_050() {
        int i = 50;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_051() {
        int i = 51;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_052() {
        int i = 52;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_053() {
        int i = 53;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_054() {
        int i = 54;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_055() {
        int i = 55;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_056() {
        int i = 56;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_057() {
        int i = 57;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_058() {
        int i = 58;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_059() {
        int i = 59;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_060() {
        int i = 60;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_061() {
        int i = 61;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_062() {
        int i = 62;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_063() {
        int i = 63;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_064() {
        int i = 64;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_065() {
        int i = 65;
        int a = 15 + (i % 11);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_066() {
        int i = 66;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_067() {
        int i = 67;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc2_068() {
        int i = 68;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_069() {
        int i = 69;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_070() {
        int i = 70;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_071() {
        int i = 71;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_072() {
        int i = 72;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_073() {
        int i = 73;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_074() {
        int i = 74;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_075() {
        int i = 75;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_076() {
        int i = 76;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_077() {
        int i = 77;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_078() {
        int i = 78;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_079() {
        int i = 79;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_080() {
        int i = 80;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        // failing test
        assertEquals(Math.min(a, b) + 1, funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_081() {
        int i = 81;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_082() {
        int i = 82;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_083() {
        int i = 83;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_084() {
        int i = 84;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_085() {
        int i = 85;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_086() {
        int i = 86;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_087() {
        int i = 87;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_088() {
        int i = 88;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_089() {
        int i = 89;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_090() {
        int i = 90;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_091() {
        int i = 91;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_092() {
        int i = 92;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_093() {
        int i = 93;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_094() {
        int i = 94;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_095() {
        int i = 95;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_096() {
        int i = 96;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        // failing test
        assertEquals(Math.min(a, b) + 1, funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_097() {
        int i = 97;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_098() {
        int i = 98;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_099() {
        int i = 99;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_100() {
        int i = 100;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_101() {
        int i = 101;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_102() {
        int i = 102;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_103() {
        int i = 103;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_104() {
        int i = 104;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_105() {
        int i = 105;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_106() {
        int i = 106;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_107() {
        int i = 107;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_108() {
        int i = 108;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_109() {
        int i = 109;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_110() {
        int i = 110;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_111() {
        int i = 111;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_112() {
        int i = 112;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_113() {
        int i = 113;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_114() {
        int i = 114;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_115() {
        int i = 115;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_116() {
        int i = 116;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_117() {
        int i = 117;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_118() {
        int i = 118;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_119() {
        int i = 119;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_120() {
        int i = 120;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_121() {
        int i = 121;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_122() {
        int i = 122;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_123() {
        int i = 123;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_124() {
        int i = 124;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_125() {
        int i = 125;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_126() {
        int i = 126;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_127() {
        int i = 127;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_128() {
        int i = 128;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_129() {
        int i = 129;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_130() {
        int i = 130;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_131() {
        int i = 131;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_132() {
        int i = 132;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_133() {
        int i = 133;
        int a = 20 + (i % 13);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_134() {
        int i = 134;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_135() {
        int i = 135;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc2_136() {
        int i = 136;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_137() {
        int i = 137;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_138() {
        int i = 138;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_139() {
        int i = 139;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_140() {
        int i = 140;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_141() {
        int i = 141;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_142() {
        int i = 142;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_143() {
        int i = 143;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_144() {
        int i = 144;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_145() {
        int i = 145;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_146() {
        int i = 146;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_147() {
        int i = 147;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_148() {
        int i = 148;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_149() {
        int i = 149;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_150() {
        int i = 150;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_151() {
        int i = 151;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_152() {
        int i = 152;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_153() {
        int i = 153;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_154() {
        int i = 154;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_155() {
        int i = 155;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_156() {
        int i = 156;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_157() {
        int i = 157;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_158() {
        int i = 158;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_159() {
        int i = 159;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_160() {
        int i = 160;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        // failing test
        assertEquals(Math.min(a, b) + 1, funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_161() {
        int i = 161;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_162() {
        int i = 162;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_163() {
        int i = 163;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_164() {
        int i = 164;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_165() {
        int i = 165;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_166() {
        int i = 166;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_167() {
        int i = 167;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_168() {
        int i = 168;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_169() {
        int i = 169;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_170() {
        int i = 170;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_171() {
        int i = 171;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_172() {
        int i = 172;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_173() {
        int i = 173;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_174() {
        int i = 174;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_175() {
        int i = 175;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_176() {
        int i = 176;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_177() {
        int i = 177;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_178() {
        int i = 178;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_179() {
        int i = 179;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_180() {
        int i = 180;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_181() {
        int i = 181;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_182() {
        int i = 182;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_183() {
        int i = 183;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_184() {
        int i = 184;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        // failing test
        assertEquals(Math.min(a, b) + 1, funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_185() {
        int i = 185;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_186() {
        int i = 186;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_187() {
        int i = 187;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_188() {
        int i = 188;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_189() {
        int i = 189;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_190() {
        int i = 190;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_191() {
        int i = 191;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_192() {
        int i = 192;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_193() {
        int i = 193;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_194() {
        int i = 194;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_195() {
        int i = 195;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_196() {
        int i = 196;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_197() {
        int i = 197;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_198() {
        int i = 198;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_199() {
        int i = 199;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_200() {
        int i = 200;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_201() {
        int i = 201;
        int a = 25 + (i % 15);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_202() {
        int i = 202;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_203() {
        int i = 203;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc2_204() {
        int i = 204;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_205() {
        int i = 205;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_206() {
        int i = 206;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_207() {
        int i = 207;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_208() {
        int i = 208;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_209() {
        int i = 209;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_210() {
        int i = 210;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_211() {
        int i = 211;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_212() {
        int i = 212;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_213() {
        int i = 213;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_214() {
        int i = 214;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_215() {
        int i = 215;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_216() {
        int i = 216;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_217() {
        int i = 217;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_218() {
        int i = 218;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_219() {
        int i = 219;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_220() {
        int i = 220;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_221() {
        int i = 221;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_222() {
        int i = 222;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_223() {
        int i = 223;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_224() {
        int i = 224;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        // failing test
        assertEquals(Math.min(a, b) + 1, funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_225() {
        int i = 225;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_226() {
        int i = 226;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_227() {
        int i = 227;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_228() {
        int i = 228;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_229() {
        int i = 229;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        // failing test
        assertEquals((a % b) + 1, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_230() {
        int i = 230;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_231() {
        int i = 231;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_232() {
        int i = 232;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_233() {
        int i = 233;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_234() {
        int i = 234;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_235() {
        int i = 235;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_236() {
        int i = 236;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_237() {
        int i = 237;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_238() {
        int i = 238;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_239() {
        int i = 239;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_240() {
        int i = 240;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_241() {
        int i = 241;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_242() {
        int i = 242;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_243() {
        int i = 243;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        // failing test
        assertEquals(Math.max(a, b) + 1, funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_244() {
        int i = 244;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_245() {
        int i = 245;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_246() {
        int i = 246;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_247() {
        int i = 247;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_248() {
        int i = 248;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_249() {
        int i = 249;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_250() {
        int i = 250;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_251() {
        int i = 251;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_252() {
        int i = 252;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_253() {
        int i = 253;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_254() {
        int i = 254;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_255() {
        int i = 255;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_256() {
        int i = 256;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        // failing test
        assertEquals(Math.min(a, b) + 1, funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_257() {
        int i = 257;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_258() {
        int i = 258;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_259() {
        int i = 259;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_260() {
        int i = 260;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_261() {
        int i = 261;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_262() {
        int i = 262;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        // failing test
        assertEquals(((int) Math.pow(a, b)) + 1, funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_263() {
        int i = 263;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_264() {
        int i = 264;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_265() {
        int i = 265;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_266() {
        int i = 266;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_267() {
        int i = 267;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_268() {
        int i = 268;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_269() {
        int i = 269;
        int a = 30 + (i % 17);
        int b = 2 + (i % 5);
        assertEquals(a % b, funcS2.func_21(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_270() {
        int i = 270;
        int a = 2 + (i % 7);
        int b = 1 + (i % 4);
        assertEquals((int) Math.pow(a, b), funcS2.func_22(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_271() {
        int i = 271;
        int a = 5 + (i % 9);
        int b = 3 + (i % 6);
        assertEquals(Math.max(a, b), funcS2.func_23(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc2_272() {
        int i = 272;
        int a = 10 + (i % 8);
        int b = 2 + (i % 5);
        assertEquals(Math.min(a, b), funcS2.func_24(a, b));
    }
}