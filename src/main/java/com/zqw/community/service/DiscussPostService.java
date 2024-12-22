package com.zqw.community.service;

import com.zqw.community.entity.DiscussPost;
import com.zqw.community.mapper.DiscussPostMapper;
import org.attoparser.dom.INestableNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 16:55
 * @Version: v1.0.0
 * @Description:
 **/
public interface DiscussPostService {

    public List<DiscussPost> findDiscussPosts(Integer userId, Integer offset, Integer limit);

    public int findDiscussPostRows(int userId);
}