package com.wf.springbootvue.controller;

import com.wf.springboot.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wf
 * @create 2020-08-22 22:09
 * @desc
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService service;

    @GetMapping("/hello/say")
    public String sayHello() {
        return service.sayHello("Wf");
    }
}
