package com.zqw.community.mapper;

import com.zqw.community.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 11:39
 * @Version: v1.0.0
 * @Description:
 **/
@Mapper
public interface StudentMapper {

    @Select("select name, age from student")
    public List<Student> list();
}
