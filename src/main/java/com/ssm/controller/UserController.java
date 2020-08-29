package com.ssm.controller;


import com.ssm.po.User;
import com.ssm.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
/*
查询所有的用户信息
 */
    @RequestMapping("/findUserAll")
    public String findUserInfoAll1(Model model)
    {
//        System.out.println("查询到所有的用户信息。。。");
       List<User> list = userService.findAll();
       for(User user:list){
           System.out.println(user);
       }
       model.addAttribute(  "list", list);

        return "userList";
    }
    /*
    保存操作
     */
    @RequestMapping("/saveUserInfo")
    public String saveUserInfo(User user)
    {
        System.out.println(user);
        userService.saveUserInfo(user);
        return "success";
    }

}
