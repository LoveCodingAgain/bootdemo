package com.example.demo.service;
import com.example.demo.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 * title:com.example.demo.service
 * @author:LiXing
 * date:2018/2/7 23:01
 * description:用户信息
 */
@Service
public class UserInfoService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // 用户信息
    public List<UserInfo> query(){
        String sql = "select name,age,sex,address from userinfo";
        List<UserInfo> userInfoList=jdbcTemplate.query(sql, new RowMapper<UserInfo>() {
            @Override
            public UserInfo mapRow(ResultSet resultSet, int i) throws SQLException {
                UserInfo userinfo=new UserInfo();
                userinfo.setName(resultSet.getString("name"));
                userinfo.setAge(resultSet.getInt("age"));
                userinfo.setSex(resultSet.getString("sex"));
                userinfo.setAddress(resultSet.getString("address"));
                return userinfo;
            }
        });
        return userInfoList;
    }
}
