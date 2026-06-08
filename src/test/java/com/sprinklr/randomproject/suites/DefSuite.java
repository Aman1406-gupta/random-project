package com.sprinklr.randomproject.suites;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({
        com.sprinklr.randomproject.funcs.FuncS2Test.class,
        com.sprinklr.randomproject.funcs.FuncS4Test.class,
})
public class DefSuite {
}
