package com.by.config;

import org.apache.dubbo.common.utils.DubboAppender;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.by.config","com.by.service"})
@DubboComponentScan({"com.by.service"})
public class AppConfig {
    @Autowired
    DubboProperties dubboProperties;

    /**
     * Dubbo Application 配置
     * @return
     */
    @Bean
    ApplicationConfig applicationConfi() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubboProperties.getDubboName());
        return applicationConfig;
    }


    /**
     * Dubbo 注册中心配置
     * @return
     */
    @Bean
    RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboProperties.getDubboAddress());
        return registryConfig;

    }

    @Bean
    ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName(dubboProperties.getProtocolName());
        protocolConfig.setPort(dubboProperties.getProtocolPort());
        return protocolConfig;
    }
}
