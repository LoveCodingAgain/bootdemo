package com.example.demo.util;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * title:com.example.demo.util
 * @author:LiXing
 * date:2018/2/5 16:10
 * description:Json的工具类,使用FastJson
 */
public class JsonUtil {
    /**
     * 转换Json字符串
     * @param
     */
    private static void changeJson(){
        User user =new User();
        String[] hobby={"Swimming","Reading","Writing"};
        user.setId(2015211738);
        user.setUsername("依依东望");
        user.setSex('男');
        user.setAge(22);
        user.setHobby(hobby);
        List<String> list=new ArrayList<String>();
        list.add("Spring");
        list.add("MyBatis");
        list.add("SpringBoot");
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"100");
        map.put(2,"99");
        map.put(3,"98");
        // List集合转换成Json字符串
        System.out.println(JSONArray.toJSON(list));
        // 字符串转换成Json字符串
        System.out.println(JSONArray.toJSONString(hobby));
        System.out.println("--------------------------------");
        // Map转换成Json字符串
        System.out.println(JSONObject.toJSON(map));
        // 转换成Json格式的数据(对象)
        System.out.println(JSONObject.toJSONString(user,true));
    }

    /**
     * 解析字符串
     * @param
     */
    private static void json(){
        // 要解析的Json字符串
        User user=new User();
        String userjson="{\"sex\":\"男\",\"id\":2015211738,\"age\":22,\"hobby\":[\"Swimming\",\"Reading\",\"Writing\"],\"username\":\"依依东望\"}";
        JSONObject jsonObject=JSONObject.parseObject(userjson);
        // 格式化json字符串
        System.out.println(JSONObject.toJSONString(jsonObject,true));
        // 将JSON文本解析成JSONObject.
        user=JSONObject.parseObject(userjson,User.class);
        System.out.println();
    }

    public static void main(String[] args) {
         changeJson();
        // json();
    }

}
