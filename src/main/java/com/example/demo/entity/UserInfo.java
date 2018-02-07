package com.example.demo.entity;
/**
 * title:com.example.demo.entity
 * @author:LiXing
 * date:2018/2/7 22:50
 * description:用户信息
 */
public class UserInfo {
    private String name;
    private Integer age;
    private String sex;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
