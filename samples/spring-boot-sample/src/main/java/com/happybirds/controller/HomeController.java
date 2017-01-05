/*
* Copyright (c) 2015 boxfish.cn. All Rights Reserved.
*/
package com.happybirds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

}
