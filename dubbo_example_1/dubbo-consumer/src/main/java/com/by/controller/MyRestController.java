package com.by.controller;

import com.by.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Reference(version = "1.0.0")
    HelloService helloService;

    @GetMapping("/hello")
    public Object hello() {
        return helloService.helloDubbo();
    }

}
