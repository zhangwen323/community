package com.zqw.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

/**
 * @Author: zqw
 * @Date: 2024/12/21 16:49
 * @Version: v1.0.0
 * @Description:
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscussPost {
    private Integer id;
    private Integer userId;
    private String title;
    private String content;
    private Integer type;
    private Integer status;
    private Date createTime;
    private Integer commentCount;
    private Double score;
}
