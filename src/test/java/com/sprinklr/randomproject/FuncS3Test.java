package com.sprinklr.randomproject.funcs;

import com.sprinklr.randomproject.annotations.Owner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncS3Test {

    private final FuncS3 funcS3 = new FuncS3();

    /*
     Naming and distribution:
     - Owner One:    testFunc3_001 .. testFunc3_068   (68 tests)  -> 10 failures (15%)
     - Owner Two:    testFunc3_069 .. testFunc3_136  (68 tests)  -> 13 failures (19%)
     - Owner Three:  testFunc3_137 .. testFunc3_204 (68 tests)  -> 8 failures (12%)
     - Owner Four:   testFunc3_205 .. testFunc3_272 (68 tests)  -> 5 failures (7%)

     Failing tests offset the expected value by +1 to force assertion failure.
    */

    @Test
    @Owner("Owner One")
    void testFunc3_001() {
        int a = 12, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_002() {
        int a = 15, b = 7;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_003() {
        int a = 9, b = 5;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_004() {
        int a = 8, b = 8;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_005() {
        int a = 14, b = 11;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_006() {
        int a = 6, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_007() {
        int a = 10, b = 6;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_008() {
        int a = 5, b = 7;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_009() {
        int a = 7, b = 3;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_010() {
        int a = 11, b = 9;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_011() {
        int a = 13, b = 8;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_012() {
        int a = 4, b = 4;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_013() {
        int a = 12, b = 5;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_014() {
        int a = 10, b = 10;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_015() {
        int a = 8, b = 3;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_016() {
        int a = 14, b = 2;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_017() {
        int a = 6, b = 9;
        // failing test
        assertEquals((a | b) + 1, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_018() {
        int a = 11, b = 11;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_019() {
        int a = 13, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_020() {
        int a = 9, b = 4;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_021() {
        int a = 15, b = 10;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_022() {
        int a = 7, b = 5;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_023() {
        int a = 3, b = 3;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_024() {
        int a = 12, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_025() {
        int a = 11, b = 6;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_026() {
        int a = 5, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_027() {
        int a = 7, b = 8;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_028() {
        int a = 14, b = 6;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_029() {
        int a = 10, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_030() {
        int a = 13, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_031() {
        int a = 2, b = 2;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_032() {
        int a = 6, b = 4;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_033() {
        int a = 11, b = 14;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_034() {
        int a = 8, b = 5;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_035() {
        int a = 9, b = 6;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_036() {
        int a = 15, b = 12;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_037() {
        int a = 13, b = 3;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_038() {
        int a = 10, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_039() {
        int a = 6, b = 6;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_040() {
        int a = 12, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_041() {
        int a = 7, b = 11;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_042() {
        int a = 14, b = 10;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_043() {
        int a = 5, b = 3;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_044() {
        int a = 11, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_045() {
        int a = 9, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_046() {
        int a = 4, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_047() {
        int a = 12, b = 12;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_048() {
        int a = 10, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_049() {
        int a = 6, b = 15;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_050() {
        int a = 11, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_051() {
        int a = 8, b = 9;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_052() {
        int a = 13, b = 6;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_053() {
        int a = 14, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_054() {
        int a = 9, b = 7;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_055() {
        int a = 4, b = 4;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_056() {
        int a = 7, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_057() {
        int a = 12, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_058() {
        int a = 6, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_059() {
        int a = 10, b = 8;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_060() {
        int a = 15, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_061() {
        int a = 5, b = 14;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_062() {
        int a = 13, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_063() {
        int a = 7, b = 7;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_064() {
        int a = 11, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_065() {
        int a = 8, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_066() {
        int a = 14, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_067() {
        int a = 6, b = 2;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc3_068() {
        int a = 9, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_069() {
        int a = 12, b = 10;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_070() {
        int a = 15, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_071() {
        int a = 9, b = 5;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_072() {
        int a = 8, b = 8;
        // failing test
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_073() {
        int a = 14, b = 11;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_074() {
        int a = 6, b = 13;
        // failing test
        assertEquals((a | b) + 1, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_075() {
        int a = 10, b = 6;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_076() {
        int a = 5, b = 7;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_077() {
        int a = 7, b = 3;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_078() {
        int a = 11, b = 9;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_079() {
        int a = 13, b = 8;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_080() {
        int a = 4, b = 4;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_081() {
        int a = 12, b = 5;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_082() {
        int a = 10, b = 10;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_083() {
        int a = 8, b = 3;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_084() {
        int a = 14, b = 2;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_085() {
        int a = 6, b = 9;
        // failing test
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_086() {
        int a = 11, b = 11;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_087() {
        int a = 13, b = 7;
        // failing test
        assertEquals((a | b) + 1, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_088() {
        int a = 9, b = 4;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_089() {
        int a = 15, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_090() {
        int a = 7, b = 5;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_091() {
        int a = 3, b = 3;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_092() {
        int a = 12, b = 8;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_093() {
        int a = 11, b = 6;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_094() {
        int a = 5, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_095() {
        int a = 7, b = 8;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_096() {
        int a = 14, b = 6;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_097() {
        int a = 10, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_098() {
        int a = 13, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_099() {
        int a = 2, b = 2;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_100() {
        int a = 6, b = 4;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_101() {
        int a = 11, b = 14;
        // failing test
        assertEquals((a | b) + 1, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_102() {
        int a = 8, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_103() {
        int a = 9, b = 6;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_104() {
        int a = 15, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_105() {
        int a = 13, b = 3;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_106() {
        int a = 10, b = 7;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_107() {
        int a = 6, b = 6;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_108() {
        int a = 12, b = 9;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_109() {
        int a = 7, b = 11;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_110() {
        int a = 14, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_111() {
        int a = 5, b = 3;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_112() {
        int a = 11, b = 8;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_113() {
        int a = 9, b = 13;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_114() {
        int a = 4, b = 7;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_115() {
        int a = 12, b = 12;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_116() {
        int a = 10, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_117() {
        int a = 6, b = 15;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_118() {
        int a = 11, b = 7;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_119() {
        int a = 8, b = 9;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_120() {
        int a = 13, b = 6;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_121() {
        int a = 14, b = 5;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_122() {
        int a = 9, b = 7;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_123() {
        int a = 4, b = 4;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_124() {
        int a = 7, b = 10;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_125() {
        int a = 12, b = 13;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_126() {
        int a = 6, b = 11;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_127() {
        int a = 10, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_128() {
        int a = 15, b = 9;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_129() {
        int a = 5, b = 14;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_130() {
        int a = 13, b = 11;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_131() {
        int a = 7, b = 7;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_132() {
        int a = 11, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_133() {
        int a = 8, b = 12;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_134() {
        int a = 14, b = 9;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_135() {
        int a = 6, b = 2;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc3_136() {
        int a = 9, b = 10;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_137() {
        int a = 12, b = 10;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_138() {
        int a = 15, b = 7;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_139() {
        int a = 9, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_140() {
        int a = 8, b = 8;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_141() {
        int a = 14, b = 11;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_142() {
        int a = 6, b = 13;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_143() {
        int a = 10, b = 6;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_144() {
        int a = 5, b = 7;
        // failing test
        assertEquals((a | b) + 1, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_145() {
        int a = 7, b = 3;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_146() {
        int a = 11, b = 9;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_147() {
        int a = 13, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_148() {
        int a = 4, b = 4;
        // failing test
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_149() {
        int a = 12, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_150() {
        int a = 10, b = 10;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_151() {
        int a = 8, b = 3;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_152() {
        int a = 14, b = 2;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_153() {
        int a = 6, b = 9;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_154() {
        int a = 11, b = 11;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_155() {
        int a = 13, b = 7;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_156() {
        int a = 9, b = 4;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_157() {
        int a = 15, b = 10;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_158() {
        int a = 7, b = 5;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_159() {
        int a = 3, b = 3;
        // failing test
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_160() {
        int a = 12, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_161() {
        int a = 11, b = 6;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_162() {
        int a = 5, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_163() {
        int a = 7, b = 8;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_164() {
        int a = 14, b = 6;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_165() {
        int a = 10, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_166() {
        int a = 13, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_167() {
        int a = 2, b = 2;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_168() {
        int a = 6, b = 4;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_169() {
        int a = 11, b = 14;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_170() {
        int a = 8, b = 5;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_171() {
        int a = 9, b = 6;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_172() {
        int a = 15, b = 12;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_173() {
        int a = 13, b = 3;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_174() {
        int a = 10, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_175() {
        int a = 6, b = 6;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_176() {
        int a = 12, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_177() {
        int a = 7, b = 11;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_178() {
        int a = 14, b = 10;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_179() {
        int a = 5, b = 3;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_180() {
        int a = 11, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_181() {
        int a = 9, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_182() {
        int a = 4, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_183() {
        int a = 12, b = 12;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_184() {
        int a = 10, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_185() {
        int a = 6, b = 15;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_186() {
        int a = 11, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_187() {
        int a = 8, b = 9;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_188() {
        int a = 13, b = 6;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_189() {
        int a = 14, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_190() {
        int a = 9, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_191() {
        int a = 4, b = 4;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_192() {
        int a = 7, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_193() {
        int a = 12, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_194() {
        int a = 6, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_195() {
        int a = 10, b = 8;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_196() {
        int a = 15, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_197() {
        int a = 5, b = 14;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_198() {
        int a = 13, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_199() {
        int a = 7, b = 7;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_200() {
        int a = 11, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_201() {
        int a = 8, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_202() {
        int a = 14, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_203() {
        int a = 6, b = 2;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc3_204() {
        int a = 9, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_205() {
        int a = 12, b = 10;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_206() {
        int a = 15, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_207() {
        int a = 9, b = 5;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_208() {
        int a = 8, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_209() {
        int a = 14, b = 11;
        // failing test
        assertEquals((a | b) + 1, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_210() {
        int a = 6, b = 13;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_211() {
        int a = 10, b = 6;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_212() {
        int a = 5, b = 7;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_213() {
        int a = 7, b = 3;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_214() {
        int a = 11, b = 9;
        // failing test
        assertEquals((a ^ b) + 1, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_215() {
        int a = 13, b = 8;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_216() {
        int a = 4, b = 4;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_217() {
        int a = 12, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_218() {
        int a = 10, b = 10;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_219() {
        int a = 8, b = 3;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_220() {
        int a = 14, b = 2;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_221() {
        int a = 6, b = 9;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_222() {
        int a = 11, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_223() {
        int a = 13, b = 7;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_224() {
        int a = 9, b = 4;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_225() {
        int a = 15, b = 10;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_226() {
        int a = 7, b = 5;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_227() {
        int a = 3, b = 3;
        // failing test
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_228() {
        int a = 12, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_229() {
        int a = 11, b = 6;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_230() {
        int a = 5, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_231() {
        int a = 7, b = 8;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_232() {
        int a = 14, b = 6;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_233() {
        int a = 10, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_234() {
        int a = 13, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_235() {
        int a = 2, b = 2;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_236() {
        int a = 6, b = 4;
        // failing test
        assertEquals((a & b) + 1, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_237() {
        int a = 11, b = 14;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_238() {
        int a = 8, b = 5;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_239() {
        int a = 9, b = 6;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_240() {
        int a = 15, b = 12;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_241() {
        int a = 13, b = 3;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_242() {
        int a = 10, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_243() {
        int a = 6, b = 6;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_244() {
        int a = 12, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_245() {
        int a = 7, b = 11;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_246() {
        int a = 14, b = 10;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_247() {
        int a = 5, b = 3;
        // failing test
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_248() {
        int a = 11, b = 8;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_249() {
        int a = 9, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_250() {
        int a = 4, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_251() {
        int a = 12, b = 12;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_252() {
        int a = 10, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_253() {
        int a = 6, b = 15;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_254() {
        int a = 11, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_255() {
        int a = 8, b = 9;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_256() {
        int a = 13, b = 6;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_257() {
        int a = 14, b = 5;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_258() {
        int a = 9, b = 7;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_259() {
        int a = 4, b = 4;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_260() {
        int a = 7, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_261() {
        int a = 12, b = 13;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_262() {
        int a = 6, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_263() {
        int a = 10, b = 8;
        assertEquals(0, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_264() {
        int a = 15, b = 9;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_265() {
        int a = 5, b = 14;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_266() {
        int a = 13, b = 11;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_267() {
        int a = 7, b = 7;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_268() {
        int a = 11, b = 5;
        assertEquals(a & b, funcS3.func_31(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_269() {
        int a = 8, b = 12;
        assertEquals(a | b, funcS3.func_32(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_270() {
        int a = 14, b = 9;
        assertEquals(a ^ b, funcS3.func_33(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_271() {
        int a = 6, b = 2;
        assertEquals(1, funcS3.func_34(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc3_272() {
        int a = 9, b = 10;
        assertEquals(a & b, funcS3.func_31(a, b));
    }
}