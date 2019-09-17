package com.by.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ice
 */
@Configuration
@ComponentScan("com.by.config")
public class AppConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("dubbo-consumer");
        applicationConfig.setQosPort(22222);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        System.out.println("加载了");
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://212.64.26.230:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20884);
        return protocolConfig;
    }
}
