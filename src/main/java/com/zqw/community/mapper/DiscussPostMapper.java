package com.zqw.community.mapper;

import com.zqw.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 16:57
 * @Version: v1.0.0
 * @Description:
 **/
@Mapper
public interface DiscussPostMapper {

    //"我的帖子"功能预备，但是首页查询不需要提供uerId，因为是查全体帖子
    //因此需要动态sql，有时需要userId，有时不需要
    //mysql的分页功能很方便，只要改limit参数即可，传入每页的起始行行号offset和最多显示多少条数据limit
    List<DiscussPost> selectDiscussPosts(Integer userId, Integer offset, Integer limit);

    //页数 = 帖子数 / 每页贴子数
    Integer selectDiscussPostRows(@Param("userId") Integer userId);  //@Param可以给参数起别名，使用名字过长的变量
    //另外 **若我想动态拼接sql，并且这个函数有且只有一个参数，就一定需要别名**

}
