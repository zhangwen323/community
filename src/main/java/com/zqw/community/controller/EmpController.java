package com.zqw.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: zqw
 * @Date: 2024/12/22 20:15
 * @Version: v1.0.0
 * @Description:
 **/
@Controller
public class EmpController {

    // 响应 JSON 数据，处理异步请求
// Java 对象 -> JSON 字符串 -> JS 对象，JSON 只是起到一个中间值的作用，方便将 Java 对象转换为其他语言对象
    @RequestMapping(path = "/emp", method = RequestMethod.GET)
    @ResponseBody       // 不加这个注解，会认为返回一个html页面
    public Map<String, Object> getEmp() {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 20);
        map.put("salary", 8000.00);
        return map;
    }

    // 响应 JSON 数据，处理异步请求
// Java 对象 -> JSON 字符串 -> JS 对象，JSON 只是起到一个中间值的作用，方便将 Java 对象转换为其他语言对象
    @RequestMapping(path = "/emps", method = RequestMethod.GET)
    @ResponseBody       // 不加这个注解，会认为返回一个html页面
    public List<Map<String, Object>> getEmps() {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name", "张三");
        map.put("age", 20);
        map.put("salary", 8000.00);
        list.add(map);
        map = new HashMap<>();
        map.put("name", "李四");
        map.put("age", 30);
        map.put("salary", 9000.00);
        list.add(map);
        return list;
    }

}
