package com.example.demo.controller;
import com.example.demo.dao.StudentRepository;
import com.example.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
/**
 * title:com.example.demo.controller
 * @author:LiXing
 * date:2018/2/8 12:31
 * description:学生信息控制层
 */
@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    /**
     * 查询学生的列表
     * @return 学生列表
     */
    @GetMapping("/students")
    public List<Student> getList(){
         return  studentRepository.findAll();
    }

    /**
     * 新增一个学生信息
     * @param age
     * @param major
     * @param name
     * @param sex
     * @return 一个学生对象
     */
    @PostMapping("/students")
    public Student addStudent(@RequestParam("age") Integer age,@RequestParam("major") String major,@RequestParam("name") String name,@RequestParam("sex") String sex){
       Student student=new Student();
       student.setAge(age);
       student.setMajor(major);
       student.setName(name);
       student.setSex(sex);
       return studentRepository.save(student);
    }

    /**
     * 根据Id查询学生信息
     * @param id
     * @return
     */
    @GetMapping("/students/{id}")
    public Student getFindOne(@PathVariable("id") Integer id){
        return studentRepository.findOne(id);
    }

    /**
     * 根据年龄查询学生信息
     * @param age
     * @return
     */
    @GetMapping("/students/age/{age}")
    public List<Student> findByAge(@PathVariable("age") Integer age){
        return studentRepository.findByAge(age);
    }
    /**
     * 更新学生的记录
     * @param id
     * @param age
     * @param major
     * @param name
     * @param sex
     * @return:Student
     */
    @PostMapping("/students/{id}")
    public Student   updateStudent(@PathVariable("id") Integer id,@RequestParam("age") Integer age,@RequestParam("major") String major,@RequestParam("name") String name,@RequestParam("sex") String sex){
      Student student=new Student();
      // 注意要保存id的,否则就是每次都新增一条数据记录的.
      student.setId(id);
      student.setAge(age);
      student.setMajor(major);
      student.setName(name);
      student.setSex(sex);
      return studentRepository.save(student);
    }

    /**
     * 删除学生的记录
     * @param id
     */
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        studentRepository.delete(id);
    }

}