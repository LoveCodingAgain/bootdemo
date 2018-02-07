package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
/**
 * @author liXing
 * 用作测试的控制层
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "SpringBoot";
    }
    @RequestMapping("/user")
    public List<String> list(){
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("456");
        list.add("789");
        return list;
    }
    @RequestMapping("/boot")
    public String boot(){
        return "boot";
    }
}
