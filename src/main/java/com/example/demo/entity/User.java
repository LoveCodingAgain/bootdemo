package com.example.demo.entity;
/**
 * title:com.example.demo.entity
 * @author:LiXing
 * date:2018/2/5 13:52
 * description:User
 */
public class User {
    private Integer id;
    private String  username;
    private char sex;
    private Integer age;
    private String[] hobby;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }
}
