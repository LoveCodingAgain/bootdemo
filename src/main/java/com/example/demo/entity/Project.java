package com.example.demo.entity;
/**
 * title:com.example.demo.entity
 * @author:LiXing
 * date:2018/2/5 14:17
 * description:项目信息的Bean
 */
public class Project {
    private Integer project_id;
    private String  project_name;
    private String   project_time;
    private User   project_user;

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_time() {
        return project_time;
    }

    public void setProject_time(String project_time) {
        this.project_time = project_time;
    }

    public User getProject_user() {
        return project_user;
    }

    public void setProject_user(User project_user) {
        this.project_user = project_user;
    }

}
