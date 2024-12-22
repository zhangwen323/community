package com.zqw.community.service;

import com.zqw.community.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 11:35
 * @Version: v1.0.0
 * @Description:
 **/

public interface StudentService {
    public List<Student> list();
}
