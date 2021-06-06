package com.lemon.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 勋章
 * @Author: xunzhang
 * @Create: 2021-05-23 12:26
 * @Desc：
 **/

//2、使用@dataProvider对register(Student s)方法进行3次测试,Student有username/password、type、sex 4个私有属性
public class TestNGDateProvider2 {

    @Test(dataProvider = "date")
    public void register(Student s){
        System.out.println(s);
    }

    @DataProvider()
    public Object[] date(){
        Student s1 = new Student("张三","123456","int","男");
        Student s2 = new Student("李四","111111","int","女");
        Student s3 = new Student("王五","999999","int","男");
        Object[] arr = {s1,s2,s3};
        return  arr;
    }
}

