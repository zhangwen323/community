package com.zqw.community.service.Impl;

import com.zqw.community.entity.Student;
import com.zqw.community.mapper.StudentMapper;
import com.zqw.community.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 11:36
 * @Version: v1.0.0
 * @Description:
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }
}
