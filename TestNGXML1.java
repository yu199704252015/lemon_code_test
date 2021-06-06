package com.lemon.testng;

import org.testng.annotations.*;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 勋章
 * @Author: xunzhang
 * @Create: 2021-05-20 12:59
 * @Desc：
 **/

// 用文字结合代码说明
// @BeforeSuite @AfterSuite @BeforeTest @BeforeClass @BeforeMethod @AfterMethod
// 执行顺序：@BeforeSuite——@BeforeTest——@BeforeClass——@BeforeMethod——“xxxTest方法”——@AfterMethod——@AfterSuite
public class TestNGXML1 {

//  @BeforeSuite:在整个测试套件执行之前先执行
    @BeforeSuite()
    public void beforesuite(){
        System.out.println("TestNGXML1.beforesuite");
        System.out.println("整个项目的数据加载");
    }

//  @AfterSuite：在整个测试套件执行完毕之后再执行
    @AfterSuite()
    public void aftersuite(){
        System.out.println("TestNGXML1.aftersuite");
        System.out.println("项目结束之后资源释放");
    }

//  @BeforeTest：在当前test执行之前先执行
    @BeforeTest()
    public void beforetest(){
        System.out.println("TestNGXML1.beforetest");
    }

//  @BeforeClass：在TestNGXML1这个类执行之前先执行
    @BeforeClass()
    public void beforeClass(){
        System.out.println("TestNGXML1.beforeClass");
    }

//  @BeforeMethod：在test方法执行之前先执行
    @BeforeMethod()
    public void beforeMethod(){
        System.out.println("TestNGXML1.beforeMethod");
    }

//  @AfterMethod：在test方法执行之后再执行(如果当前类中还有一个Test2方法，这时候执行完afternwthod，先执行beforemethod，
//  然后再执行Test2方法，然后再执行aftermethod)
    @AfterMethod()
    public void aftermethod(){
        System.out.println("TestNGXML1.aftermethod");
    }

    @Test()
    public void test(){
        System.out.println("TestNGXML1.test");
    }

    }

