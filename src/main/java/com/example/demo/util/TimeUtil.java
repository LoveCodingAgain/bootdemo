package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * title:com.example.demo.util
 * @author:LiXing
 * date:2018/2/5 14:23
 * description:返回格式化日期
 */
public class TimeUtil {
    public static String getFormateDate(Date date){
        Date datetime=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd:HH:mm:ss");
        return sdf.format(datetime);
    }
}
