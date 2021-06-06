package com.lemon.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.ObjectFactory;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 勋章
 * @Author: xunzhang
 * @Create: 2021-05-23 11:31
 * @Desc：
 **/
//1、使用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试
public class TestNGDateProvider {
    @Test(dataProvider = "date")
    public void register(String username, String password, String type, String sex) {
        System.out.println("username = " + username + ", password = " + password + "," +
                             " type = " + type + ", sex = " + sex);
    }
    @DataProvider()
    public Object[][] date() {
        Object[][] arr = {
                {"张三", "123456", "int", "男"},
                {"李四", "111111", "int", "女"},
                {"王五", "122222", "int", "男"},
                {"刘能", "123516", "int", "男"},
                {"贾玲", "12366666", "int", "女"}
        };
        return arr;
    }
    }


