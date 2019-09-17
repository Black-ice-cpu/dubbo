package com.by.config;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@EnableWebMvc
@DubboComponentScan({"com.by.controller"})
@ComponentScan({"com.by.controller"})
public class WebMvcConfig implements WebMvcConfigurer {

}