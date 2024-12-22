package com.zqw.community.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.PrivateKey;
import java.util.List;

/**
 * @Author: zqw
 * @Date: 2024/12/21 17:08
 * @Version: v1.0.0
 * @Description:
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageBean {
    private Long total; //总记录数
    private List rows; //当前页数据列表
}
