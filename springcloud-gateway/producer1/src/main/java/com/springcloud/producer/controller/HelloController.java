package com.springcloud.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return "hello "+name+"，producer1 is ready";
    }
    @RequestMapping("/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }
}