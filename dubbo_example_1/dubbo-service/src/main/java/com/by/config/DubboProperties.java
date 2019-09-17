package com.by.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:dubboConfig.properties")
public class DubboProperties {
    @Value("${application.dubbo.demo.server.name}")
    private String dubboName;
    @Value("${application.dubbo.demo.server.address}")
    private String dubboAddress;
    @Value("${application.dubbo.demo.server.client}")
    private String dubboClient;
    @Value("${application.dubbo.demo.server.protocolName}")
    private String protocolName;
    @Value("${application.dubbo.demo.server.protocolPort}")
    private Integer protocolPort;
}
