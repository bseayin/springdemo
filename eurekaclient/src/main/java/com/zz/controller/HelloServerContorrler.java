package com.zz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloServerContorrler {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
