package com.sprinklr.randomproject.suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    com.sprinklr.randomproject.funcs.FuncS3Test.class,
    com.sprinklr.randomproject.funcs.FuncS4Test.class,
})
public class Suite2 {
}
