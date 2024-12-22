package com.zqw.community.controller;

import com.zqw.community.entity.DiscussPost;
import com.zqw.community.result.Result;
import com.zqw.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 16:53
 * @Version: v1.0.0
 * @Description:
 **/
@RestController
@RequestMapping("/discuss")
public class DiscussPostController {

    @Autowired
    private DiscussPostService discussPostService;

    @GetMapping()
    public Result<List<DiscussPost>> selectDiscussPosts(Integer userId, @RequestParam(defaultValue = "0")Integer offset, @RequestParam(defaultValue = "10")Integer limit){
        List<DiscussPost> list = discussPostService.findDiscussPosts(userId, offset, limit);
        return Result.success(list);
    }

}
