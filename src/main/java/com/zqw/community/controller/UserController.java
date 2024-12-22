package com.zqw.community.controller;

import com.zqw.community.entity.User;
import com.zqw.community.result.Result;
import com.zqw.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/22 15:54
 * @Version: v1.0.0
 * @Description:
 **/
@RestController
@RequestMapping("user/list")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public Result<User> list(Integer id){
        User userById = userService.findUserById(id);
        return Result.success(userById);
    }


}
