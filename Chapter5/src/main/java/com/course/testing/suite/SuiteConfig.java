package com.course.testing.suite;

import org.testng.annotations.*;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
}
