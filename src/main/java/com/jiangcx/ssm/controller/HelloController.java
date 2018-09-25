package com.jiangcx.ssm.controller;

import com.jiangcx.ssm.entity.User;
import com.jiangcx.ssm.service.GetUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jiangcx on 2018/9/21
 */
@Controller
@RequestMapping(value = "demo")
public class HelloController {
    @Resource(name = "userService")
    private GetUserService userService;

    @RequestMapping(value = "hello")
    public String hello(){
        User users = userService.getUserById("1");
        System.out.println(users);
        System.out.println("-----------------------------");
        List<User> list = userService.getAll();
        System.out.println(list);

        User user = new User();
        user.setName("wede");
        user.setGender("boy");
        userService.addUser(user);

        userService.deleteUser("4");

        System.out.println(userService.getAll());
        return "success";
    }
}
