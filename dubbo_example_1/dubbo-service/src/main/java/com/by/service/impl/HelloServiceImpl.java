package com.by.service.impl;


import com.by.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0",interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String helloDubbo() {
        return "Hello Dubbo";
    }
}
