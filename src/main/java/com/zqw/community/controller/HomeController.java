package com.zqw.community.controller;

import com.zqw.community.entity.DiscussPost;
import com.zqw.community.entity.User;
import com.zqw.community.result.Result;
import com.zqw.community.service.DiscussPostService;
import com.zqw.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//controller映射路径可省，这样直接访问的就是方法

@RestController
@RequestMapping("/index")
public class HomeController {

    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;

//    @RequestMapping(path = "/index", method = RequestMethod.GET)
//    @GetMapping("/discussPosts")
////    public String getIndexPage(Model model){
//    public Result<List<Map<String, Object>>> getIndexPage(Model model){
//        // 默认是第一页，前10个帖子
////        List<DiscussPost> list = discussPostService.findDiscussPosts(149,0,5);
//        List<DiscussPost> list = discussPostService.findDiscussPosts(149,0,5);
//
//        // 将前10个帖子和对应的user对象封装
//        List<Map<String, Object>> discussPosts = new ArrayList<>();
//        if(list !=null){
//            for(DiscussPost post:list){
//                Map<String,Object> map = new HashMap<>();
//                map.put("post" , post);
//                User user = userService.findUserById(post.getUserId());
//                map.put("user", user);
//                discussPosts.add(map);
//            }
//        }
////        // 处理完的数据填充给前端页面
////        model.addAttribute("discussPosts", discussPosts);
////        System.out.println("model:"+model);
////        System.out.println("----------------------------this-----------------");
////        return "index";
//        return Result.success(discussPosts);
//    }

    @RequestMapping(path = "/hello1", method = RequestMethod.GET)
    public String getIndexPage(Model model){
        // 默认是第一页，前10个帖子
//        List<DiscussPost> list = discussPostService.findDiscussPosts(149,0,5);
        List<DiscussPost> list = discussPostService.findDiscussPosts(0,0,5);

        // 将前10个帖子和对应的user对象封装
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if(list !=null){
            for(DiscussPost post:list){
                Map<String,Object> map = new HashMap<>();
                map.put("post" , post);
                User user = userService.findUserById(post.getUserId());
                map.put("user", user);
                discussPosts.add(map);
            }
        }
//        // 处理完的数据填充给前端页面
        model.addAttribute("discussPosts", discussPosts);
//        System.out.println("model:"+model);
//        System.out.println("----------------------------this-----------------");
        return "hello1";

    }
}