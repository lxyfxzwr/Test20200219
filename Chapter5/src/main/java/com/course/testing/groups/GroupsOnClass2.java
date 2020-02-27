package com.course.testing.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2的stu1");
    }

    public void stu2(){
        System.out.println("GroupsOnClass2的stu2");
    }
}
