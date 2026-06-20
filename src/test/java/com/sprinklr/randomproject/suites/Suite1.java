package com.sprinklr.randomproject.suites;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses({  // make sure there should be no comma or space after the last class as it will cause the test to fail with ClassNotFoundException in jenkins pipeline
    com.sprinklr.randomproject.funcs.FuncS1Test.class,
    com.sprinklr.randomproject.funcs.FuncS2Test.class
})
public class Suite1 {
}
