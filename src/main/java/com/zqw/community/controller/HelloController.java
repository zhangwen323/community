package com.zqw.community.controller;

import com.zqw.community.utils.MailClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zqw
 * @Date: 2024/12/21 11:15
 * @Version: v1.0.0
 * @Description:
 **/
@RestController
//    @Controller
public class HelloController {

    @RequestMapping("/hello")
//    @ResponseBody
    public String hello(){
        return "hello, world!";
    }


}
