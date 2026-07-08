package com.sprinklr.randomproject.funcs;

import com.sprinklr.randomproject.annotations.Owner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncS4Test {

    private final FuncS4 funcS4 = new FuncS4();

    /*
     Naming and distribution:
     - Owner One:    testFunc4_001 .. testFunc4_068   (68 tests)  -> 10 failures (14%)
     - Owner Two:    testFunc4_069 .. testFunc4_136  (68 tests)  -> 7 failures (10%)
     - Owner Three:  testFunc4_137 .. testFunc4_204 (68 tests)  -> 5 failures (7%)
     - Owner Four:   testFunc4_205 .. testFunc4_272 (68 tests)  -> 3 failures (5%)

     Failing tests offset the expected value by +1 or -1 to force assertion failure.
    */

    @Test
    @Owner("Owner One")
    void testFunc4_001() {
        int a = 2, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_002() {
        int a = 3, b = 2;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_003() {
        int a = -1, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_004() {
        int a = 5, b = 10;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_005() {
        int a = 4, b = 2;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_006() {
        int a = 8, b = 1;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_007() {
        int a = -2, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_008() {
        int a = 7, b = 7;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_009() {
        int a = 5, b = 3;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_010() {
        int a = 16, b = 2;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_011() {
        int a = -4, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_012() {
        int a = 3, b = 8;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_013() {
        int a = 6, b = 1;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_014() {
        int a = 32, b = 3;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_015() {
        int a = -8, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_016() {
        int a = 10, b = 5;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_017() {
        int a = 7, b = 2;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_018() {
        int a = 64, b = 4;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_019() {
        int a = -16, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_020() {
        int a = 4, b = 4;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_021() {
        int a = 3, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_022() {
        int a = 128, b = 5;
        // failing test
        assertEquals((a >> b) + 1, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_023() {
        int a = -32, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_024() {
        int a = 9, b = 2;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_025() {
        int a = 9, b = 2;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_026() {
        int a = 256, b = 6;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_027() {
        int a = -64, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_028() {
        int a = 6, b = 6;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_029() {
        int a = 10, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_030() {
        int a = 512, b = 7;
        // failing test
        assertEquals((a >> b) + 1, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_031() {
        int a = -128, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_032() {
        int a = 2, b = 11;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_033() {
        int a = 11, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_034() {
        int a = 1024, b = 8;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_035() {
        int a = -256, b = 1;
        // failing test
        assertEquals((a >>> b) + 1, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_036() {
        int a = 8, b = 15;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_037() {
        int a = 12, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_038() {
        int a = 2048, b = 9;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_039() {
        int a = -512, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_040() {
        int a = 20, b = 20;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_041() {
        int a = 13, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_042() {
        int a = 4096, b = 10;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_043() {
        int a = -1024, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_044() {
        int a = 5, b = 25;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_045() {
        int a = 14, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_046() {
        int a = 8192, b = 11;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_047() {
        int a = -2048, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_048() {
        int a = 15, b = 3;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_049() {
        int a = 15, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_050() {
        int a = 16384, b = 12;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_051() {
        int a = -4096, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_052() {
        int a = 30, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_053() {
        int a = 2, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_054() {
        int a = 32768, b = 13;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_055() {
        int a = -8192, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_056() {
        int a = 100, b = 50;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_057() {
        int a = 3, b = 4;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_058() {
        int a = 65536, b = 14;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_059() {
        int a = -16384, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_060() {
        int a = 200, b = 100;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_061() {
        int a = 4, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_062() {
        int a = 131072, b = 15;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_063() {
        int a = -32768, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_064() {
        int a = 1, b = 500;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_065() {
        int a = 5, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_066() {
        int a = 262144, b = 16;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_067() {
        int a = -65536, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner One")
    void testFunc4_068() {
        int a = 999, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_069() {
        int a = 6, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_070() {
        int a = 4, b = 1;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_071() {
        int a = -1, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_072() {
        int a = 5, b = 10;
        // failing test
        assertEquals(Integer.compare(a, b) + 1, funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_073() {
        int a = 7, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_074() {
        int a = 8, b = 2;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_075() {
        int a = -2, b = 1;
        // failing test
        assertEquals((a >>> b) + 1, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_076() {
        int a = 7, b = 7;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_077() {
        int a = 8, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_078() {
        int a = 16, b = 3;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_079() {
        int a = -4, b = 2;
        // failing test
        assertEquals((a >>> b) + 1, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_080() {
        int a = 3, b = 8;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_081() {
        int a = 9, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_082() {
        int a = 32, b = 4;
        // failing test
        assertEquals((a >> b) + 1, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_083() {
        int a = -8, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_084() {
        int a = 10, b = 5;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_085() {
        int a = 10, b = 2;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_086() {
        int a = 64, b = 5;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_087() {
        int a = -16, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_088() {
        int a = 4, b = 4;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_089() {
        int a = 11, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_090() {
        int a = 128, b = 6;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_091() {
        int a = -32, b = 1;
        // failing test
        assertEquals((a >>> b) + 1, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_092() {
        int a = 9, b = 2;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_093() {
        int a = 12, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_094() {
        int a = 256, b = 7;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_095() {
        int a = -64, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_096() {
        int a = 6, b = 6;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_097() {
        int a = 13, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_098() {
        int a = 512, b = 8;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_099() {
        int a = -128, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_100() {
        int a = 2, b = 11;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_101() {
        int a = 14, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_102() {
        int a = 1024, b = 9;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_103() {
        int a = -256, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_104() {
        int a = 8, b = 15;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_105() {
        int a = 15, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_106() {
        int a = 2048, b = 10;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_107() {
        int a = -512, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_108() {
        int a = 20, b = 20;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_109() {
        int a = 2, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_110() {
        int a = 4096, b = 11;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_111() {
        int a = -1024, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_112() {
        int a = 5, b = 25;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_113() {
        int a = 3, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_114() {
        int a = 8192, b = 12;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_115() {
        int a = -2048, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_116() {
        int a = 15, b = 3;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_117() {
        int a = 4, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_118() {
        int a = 16384, b = 13;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_119() {
        int a = -4096, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_120() {
        int a = 30, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_121() {
        int a = 5, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_122() {
        int a = 32768, b = 14;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_123() {
        int a = -8192, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_124() {
        int a = 100, b = 50;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_125() {
        int a = 6, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_126() {
        int a = 65536, b = 15;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_127() {
        int a = -16384, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_128() {
        int a = 200, b = 100;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_129() {
        int a = 7, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_130() {
        int a = 131072, b = 16;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_131() {
        int a = -32768, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_132() {
        int a = 1, b = 500;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_133() {
        int a = 8, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_134() {
        int a = 262144, b = 17;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_135() {
        int a = -65536, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Two")
    void testFunc4_136() {
        int a = 999, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_137() {
        int a = 9, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_138() {
        int a = 4, b = 1;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_139() {
        int a = -1, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_140() {
        int a = 5, b = 10;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_141() {
        int a = 10, b = 1;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_142() {
        int a = 8, b = 2;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_143() {
        int a = -2, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_144() {
        int a = 7, b = 7;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_145() {
        int a = 11, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_146() {
        int a = 16, b = 3;
        // failing test
        assertEquals((a >> b) + 1, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_147() {
        int a = -4, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_148() {
        int a = 3, b = 8;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_149() {
        int a = 12, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_150() {
        int a = 32, b = 4;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_151() {
        int a = -8, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_152() {
        int a = 10, b = 5;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_153() {
        int a = 13, b = 2;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_154() {
        int a = 64, b = 5;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_155() {
        int a = -16, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_156() {
        int a = 4, b = 4;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_157() {
        int a = 14, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_158() {
        int a = 128, b = 6;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_159() {
        int a = -32, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_160() {
        int a = 9, b = 2;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_161() {
        int a = 15, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_162() {
        int a = 256, b = 7;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_163() {
        int a = -64, b = 2;
        // failing test
        assertEquals((a >>> b) + 1, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_164() {
        int a = 6, b = 6;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_165() {
        int a = 2, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_166() {
        int a = 512, b = 8;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_167() {
        int a = -128, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_168() {
        int a = 2, b = 11;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_169() {
        int a = 3, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_170() {
        int a = 1024, b = 9;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_171() {
        int a = -256, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_172() {
        int a = 8, b = 15;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_173() {
        int a = 4, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_174() {
        int a = 2048, b = 10;
        // failing test
        assertEquals((a >> b) + 1, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_175() {
        int a = -512, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_176() {
        int a = 20, b = 20;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_177() {
        int a = 5, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_178() {
        int a = 4096, b = 11;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_179() {
        int a = -1024, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_180() {
        int a = 5, b = 25;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_181() {
        int a = 6, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_182() {
        int a = 8192, b = 12;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_183() {
        int a = -2048, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_184() {
        int a = 15, b = 3;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_185() {
        int a = 7, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_186() {
        int a = 16384, b = 13;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_187() {
        int a = -4096, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_188() {
        int a = 30, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_189() {
        int a = 8, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_190() {
        int a = 32768, b = 14;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_191() {
        int a = -8192, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_192() {
        int a = 100, b = 50;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_193() {
        int a = 9, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_194() {
        int a = 65536, b = 15;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_195() {
        int a = -16384, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_196() {
        int a = 200, b = 100;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_197() {
        int a = 10, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_198() {
        int a = 131072, b = 16;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_199() {
        int a = -32768, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_200() {
        int a = 1, b = 500;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_201() {
        int a = 11, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_202() {
        int a = 262144, b = 17;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_203() {
        int a = -65536, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Three")
    void testFunc4_204() {
        int a = 999, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_205() {
        int a = 12, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_206() {
        int a = 4, b = 1;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_207() {
        int a = -1, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_208() {
        int a = 5, b = 10;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_209() {
        int a = 13, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_210() {
        int a = 8, b = 2;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_211() {
        int a = -2, b = 1;
        // failing test
        assertEquals((a >>> b) + 1, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_212() {
        int a = 7, b = 7;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_213() {
        int a = 14, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_214() {
        int a = 16, b = 3;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_215() {
        int a = -4, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_216() {
        int a = 3, b = 8;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_217() {
        int a = 15, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_218() {
        int a = 32, b = 4;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_219() {
        int a = -8, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_220() {
        int a = 10, b = 5;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_221() {
        int a = 2, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_222() {
        int a = 64, b = 5;
        // failing test
        assertEquals((a >> b) + 1, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_223() {
        int a = -16, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_224() {
        int a = 4, b = 4;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_225() {
        int a = 3, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_226() {
        int a = 128, b = 6;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_227() {
        int a = -32, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_228() {
        int a = 9, b = 2;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_229() {
        int a = 4, b = 1;
        // failing test
        assertEquals((a << b) + 1, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_230() {
        int a = 256, b = 7;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_231() {
        int a = -64, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_232() {
        int a = 6, b = 6;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_233() {
        int a = 5, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_234() {
        int a = 512, b = 8;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_235() {
        int a = -128, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_236() {
        int a = 2, b = 11;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_237() {
        int a = 6, b = 3;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_238() {
        int a = 1024, b = 9;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_239() {
        int a = -256, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_240() {
        int a = 8, b = 15;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_241() {
        int a = 7, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_242() {
        int a = 2048, b = 10;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_243() {
        int a = -512, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_244() {
        int a = 20, b = 20;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_245() {
        int a = 8, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_246() {
        int a = 4096, b = 11;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_247() {
        int a = -1024, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_248() {
        int a = 5, b = 25;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_249() {
        int a = 9, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_250() {
        int a = 8192, b = 12;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_251() {
        int a = -2048, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_252() {
        int a = 15, b = 3;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_253() {
        int a = 10, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_254() {
        int a = 16384, b = 13;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_255() {
        int a = -4096, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_256() {
        int a = 30, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_257() {
        int a = 11, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_258() {
        int a = 32768, b = 14;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_259() {
        int a = -8192, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_260() {
        int a = 100, b = 50;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_261() {
        int a = 12, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_262() {
        int a = 65536, b = 15;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_263() {
        int a = -16384, b = 1;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_264() {
        int a = 200, b = 100;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_265() {
        int a = 13, b = 2;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_266() {
        int a = 131072, b = 16;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_267() {
        int a = -32768, b = 2;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_268() {
        int a = 1, b = 500;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_269() {
        int a = 14, b = 1;
        assertEquals(a << b, funcS4.func_41(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_270() {
        int a = 262144, b = 17;
        assertEquals(a >> b, funcS4.func_42(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_271() {
        int a = -65536, b = 3;
        assertEquals(a >>> b, funcS4.func_43(a, b));
    }

    @Test
    @Owner("Owner Four")
    void testFunc4_272() {
        int a = 999, b = 1;
        assertEquals(Integer.compare(a, b), funcS4.func_44(a, b));
    }
}