package com.course.testing;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试1的一部分");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试2的一部分");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod测试之前的");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod测试之后的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是在类之前的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是类之后的");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是suite之前的");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("这是suite之后的");
    }
}
