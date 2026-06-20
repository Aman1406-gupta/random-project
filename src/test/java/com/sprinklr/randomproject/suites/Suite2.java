package com.sprinklr.randomproject.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

// make sure there should be no comma or space after the last class as it will cause the test to fail with ClassNotFoundException in jenkins pipeline

@Suite
@SelectClasses({
    com.sprinklr.randomproject.funcs.FuncS3Test.class,
    com.sprinklr.randomproject.funcs.FuncS4Test.class
})
public class Suite2 {
}
