package com.example.demo.controller;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/**
 * title:com.example.demo.controller
 * @author:LiXing
 * date:2018/2/7 23:51
 * description:用户信息查询
 */
@RestController
public class UserInfoController {
    private Logger logger=LoggerFactory.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("/query")
    public List<UserInfo> query(){
       logger.info("用户信息数据查询中,请稍后。。。。");
       return userInfoService.query();
    }
}
