package com.zqw.community.mapper;

import com.zqw.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @Author: zqw
 * @Date: 2024/12/22 15:45
 * @Version: v1.0.0
 * @Description:
 **/
@Mapper
public interface UserMapper {

    @Select("select id, username, password, salt, email, type, status, activation_code, header_url, create_time from user where id = #{id}")
    public User selectById(Integer id);
}
