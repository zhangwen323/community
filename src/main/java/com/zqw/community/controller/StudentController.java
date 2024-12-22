package com.zqw.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: zqw
 * @Date: 2024/12/22 20:02
 * @Version: v1.0.0
 * @Description:
 **/
@Controller
public class StudentController {
    // 响应HTML请求，使用简化的方式，直接返回String
    @RequestMapping(path = "/school", method = RequestMethod.GET)
    public String getSchool(Model model) {
        // 这里直接使用 Model 对象添加数据，完成数据的添加
        model.addAttribute("name", "HUT");
        model.addAttribute("age", "60");
        return "/demo/view";
    }

}
