package com.sprinklr.randomproject.suites;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

// make sure there should be no comma or space after the last class as it will cause the test to fail with ClassNotFoundException in jenkins pipeline

@Suite
@SelectClasses({
        com.sprinklr.randomproject.funcs.FuncS1Test.class,
        com.sprinklr.randomproject.funcs.FuncS3Test.class
})
public class AbcSuite {
}
