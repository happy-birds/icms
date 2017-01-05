/*
* Copyright (c) 2015 boxfish.cn. All Rights Reserved.
*/
package com.happybirds.service;

import org.springframework.stereotype.Service;

/**
 * Created with Intellij IDEA
 * Author: lhb
 * Date: 17/1/5
 * Time: 11:25
 */
@Service
public class HelloService {

    public String sayHello(String name) {
        return name + ": \"hello!\"";
    }

}
