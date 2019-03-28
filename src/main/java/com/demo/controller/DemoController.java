package com.demo.controller;

import com.alibaba.fastjson.JSON;
import com.demo.entity.User;
import com.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private UserService userService;
    private  static final Logger logger = LoggerFactory.getLogger(DemoController.class);
    @RequestMapping("getuser")
    public String getUser(HttpServletRequest request, Model model) {
        String userId = (request.getParameter("id"));
        User user  =  this.userService.getUserById(userId);
        logger.info("获取user接口！");
        logger.error("error");
        logger.warn("warn");
        return JSON.toJSONString(user);
    }

    @RequestMapping("/adduser")
    public String  adduser(HttpServletRequest request, Model model,User user){
         if(this.userService.addUser(user)){
             return "success";
         }else{
             return "fail";
         }
    }
    @RequestMapping("/adduser2")
    public String  adduser2(HttpServletRequest request, Model model,User user){
        if(this.userService.addUserno(user)){
            return "success";
        }else{
            return "fail";
        }
    }
    @RequestMapping("getList")
    public String getList(){
        return JSON.toJSONString( this.userService.getList(1,10));
    }
}