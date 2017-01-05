/*
* Copyright (c) 2015 boxfish.cn. All Rights Reserved.
*/
package com.happybirds.controller;

import com.happybirds.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * Created with Intellij IDEA
 * Author: lhb
 * Date: 17/1/5
 * Time: 11:26
 */
@RestController
//@RequestMapping("/happy/birds")
public class GreetingController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity hello(String name) {
        return ResponseEntity.ok(Collections.singletonMap("msg", helloService.sayHello(name)));
    }
}
