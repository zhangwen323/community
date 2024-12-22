package com.zqw.community.service;

import com.zqw.community.entity.User;
import com.zqw.community.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: zqw
 * @Date: 2024/12/21 20:57
 * @Version: v1.0.0
 * @Description:
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    //根据id查用户
    public User findUserById(Integer id){
        return userMapper.selectById(id);
    }
}