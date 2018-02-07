package com.example.demo.util;
import org.springframework.beans.factory.annotation.Value;
/**
 * title:com.example.demo.util
 * @author:LiXing.
 * date:2018/2/6 20:18.
 * description:基于Jdbc来使用数据库连接.
 */
public class JdbcUtil {
     @Value("${spring.datasource.driver-class-name}")
     private static String jdbcDriver;

}
