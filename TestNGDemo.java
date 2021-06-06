package com.lemon.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 勋章
 * @Author: xunzhang
 * @Create: 2021-05-20 10:43
 * @Desc：
 **/
public class TestNGDemo {

//    @Test(alwaysRun = true,dependsOnMethods = {"Test2"})
//    public void Test(){
//        System.out.println("..........");
//    }
//
//    @Test(expectedExceptions = {NullPointerException.class})
//    public void Test2(){
//        System.out.println("...........1");
//        Assert.assertEquals("a","b");
//    }
    @Test(priority = 1)
    public void Test1(){
        System.out.println("TestNGDemo.Test1");
    }

    @Test(priority = 0)
    public void Test2(){
        System.out.println("TestNGDemo.Test2");
    }

    @Test(priority = 1)
    public void Test3(){
        System.out.println("TestNGDemo.Test3");
    }
}
