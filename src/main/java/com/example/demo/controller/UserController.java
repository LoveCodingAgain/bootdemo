package com.example.demo.controller;
import com.example.demo.entity.Project;
import com.example.demo.entity.User;
import com.example.demo.util.TimeUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
/**
 * title:com.example.demo.controller
 * @author:LiXing
 * date:2018/2/5 13:55
 * description:用户信息接口,返回Json格式数据
 */
@RestController
public class UserController {
   @RequestMapping("/getProject")
    public Project getUser(){
       User user=new User();
       String[] hobby={"Swimming","Reading","Writing"};
       user.setId(2015211738);
       user.setUsername("更努力");
       user.setAge(21);
       user.setSex('男');
       user.setHobby(hobby);
       Project project=new Project();
       project.setProject_id(180215);
       project.setProject_name("校园内外外入项目");
       project.setProject_time(TimeUtil.getFormateDate(new Date()));
       project.setProject_user(user);
       System.out.println(user.getAge().toString());
       return project;
   }
}
