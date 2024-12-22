package com.zqw.community.mapper;

import com.zqw.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: zqw
 * @Date: 2024/12/22 15:37
 * @Version: v1.0.0
 * @Description:
 **/
@SpringBootTest
class DiscussPostMapperTest {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    //不加userId
    @Test
    public void testSelectPosts(){
        List<DiscussPost> lists = discussPostMapper.selectDiscussPosts(0,0,10);
        for (DiscussPost post:lists){
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(null);
        System.out.println(rows);
    }

    //加userId
    @Test
    public void testSelectPosts1(){
        List<DiscussPost> lists = discussPostMapper.selectDiscussPosts(149,0,10);
        for (DiscussPost post:lists){
            System.out.println(post);
        }
        int rows = discussPostMapper.selectDiscussPostRows(149);
        System.out.println(rows);
    }

}