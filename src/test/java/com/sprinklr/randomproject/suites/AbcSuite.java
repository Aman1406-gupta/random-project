package com.sprinklr.randomproject.suites;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({
        com.sprinklr.randomproject.funcs.FuncS1Test.class,
        com.sprinklr.randomproject.funcs.FuncS3Test.class,
})
public class AbcSuite {
}
