package com.zqw.community.controller;

import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.Thymeleaf;

/**
 * @Author: zqw
 * @Date: 2024/12/22 19:26
 * @Version: v1.0.0
 * @Description:
 **/
@Controller
public class thymeleafController {

    @RequestMapping("/test")
    public String test(Model model){

        model.addAttribute("msg", "Hello, test!");
        return "test";
    }
}
