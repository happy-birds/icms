/*
* Copyright (c) 2015 boxfish.cn. All Rights Reserved.
*/
package com.happybirds.controller;

import com.happybirds.dao.UserMapper;
import com.happybirds.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with Intellij IDEA
 * Author: lhb
 * Date: 17/1/5
 * Time: 11:29
 */
@Controller
public class HomeController {

    @GetMapping({"/", "home", "index"})
    public String home(String name) {
        //转发请求到hello
        return "redirect:/hello";
    }

    @Autowired
    UserMapper userMapper;
    @RequestMapping(value = "/user")
    @ResponseBody
    public String user(String name){
        User user = userMapper.findUserByName(name);
        if(user == null) return "null";
        return user.getName();
    }

}
