package com.course.testing.suite;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PayTest {
    @Test
    public void payZhifubao(){
        System.out.println("支付宝支付成功");
    }
    @BeforeClass
    public void openZhifubao(){
        System.out.println("打开支付宝中...");
    }
}
