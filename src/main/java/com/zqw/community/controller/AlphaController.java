package com.zqw.community.controller;

import com.zqw.community.entity.Student;
import com.zqw.community.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 11:26
 * @Version: v1.0.0
 * @Description:
 **/
@RestController
public class AlphaController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/get")
    public List<Student> list(){
        List<Student> list = studentService.list();
        return list;
    }

    @GetMapping("/post")
    public List<Student> list1(){
        List<Student> list = studentService.list();
        return list;
    }
}
