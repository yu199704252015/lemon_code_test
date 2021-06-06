package com.lemon.testng;

/**
 * @Project: java29_maven_base
 * @Site: http://www.lemonban.com
 * @Forum: http://testingpai.com
 * @Copyright: ©2021 版权所有 勋章
 * @Author: xunzhang
 * @Create: 2021-05-23 11:49
 * @Desc：
 **/
public class Student {
    private String name;
    private String password;
    private String type;
    private String sex;

    public Student(String name, String password, String type, String sex) {
        this.name = name;
        this.password = password;
        this.type = type;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
