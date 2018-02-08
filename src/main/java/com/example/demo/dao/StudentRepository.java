package com.example.demo.dao;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
/**
 * title:com.example.demo.dao
 * @author:LiXing
 * date:2018/2/8 12:34
 * description:学生信息接口,使用JPA
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
    /**
     * 根据年龄来查询学生信息
     * @param age
     * @return List<Student>
     */
    List<Student> findByAge(Integer age);
}
