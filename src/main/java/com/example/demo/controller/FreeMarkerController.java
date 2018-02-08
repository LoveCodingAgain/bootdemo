package com.example.demo.controller;
import com.example.demo.entity.Student;
import com.example.demo.util.TimeUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.*;
/**
 * title:com.example.demo.controller
 * @author:LiXing
 * date:2018/2/8 19:49
 * description:FreeMarker的控制层
 */
@Controller
@RequestMapping("/freemarker")
public class FreeMarkerController {
    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        // 使用List存储两个好友信息
        List<Map<String,Object>> friends =new ArrayList<Map<String,Object>>();
        Map<String,Object> friend = new HashMap<String,Object>();
        friend.put("name", "微服务");
        friend.put("age", 20);
        friends.add(friend);
        friend = new HashMap<String,Object>();
        friend.put("name", "微框架");
        friend.put("age", 22);
        friends.add(friend);
        map.put("mydate",TimeUtil.getFormateDate(new Date()));
        map.put("friends", friends);
        return "hello";
    }
}
