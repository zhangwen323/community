package com.zqw.community.utils;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @Author: zqw
 * @Date: 2024/12/21 12:56
 * @Version: v1.0.0
 * @Description:
 **/
@SpringBootTest
class MailClientTest {
//    @Autowired
    @Resource
    private MailClient mailClient;

    @Autowired
    private TemplateEngine templateEngine;  //模板引擎

    @Test
    void test02(){
        System.out.println("mailClient:"+mailClient);
//        System.out.println("mailClient.getFrom:"+mailClient.getFrom());
        mailClient.sendMail("wenzhang202202@163.com","TEST","测试邮件发送！");
    }



    @Test
    public void testHTMLMail(){
        Context context = new Context();
        context.setVariable("username","zhangwen");   //key-value

        String content = templateEngine.process("/mail/demo",context);
        System.out.println(content);

        mailClient.sendMail("wenzhang202202@163.com", "HTML test", content);
    }

//    @Test
//    public void test01(){
//        Context context = new Context();// org.thymeleaf.context.Context 包下
////        context.setVariable("email", user.getEmail());
//        // http://csp1999.natapp1.cc/community/activation/用户id/激活码
//        context.setVariable("email", "2426243168@qq.com");
//        String url = path + contextPath + "/activation/" + user.getId() + "/" + user.getActivatio
//        context.setVariable("url", url);
//        String content = templateEngine.process("/mail/activation", context);
//        mailClient.sendMail(user.getEmail(), "激活账号", content);
//
//    }
}