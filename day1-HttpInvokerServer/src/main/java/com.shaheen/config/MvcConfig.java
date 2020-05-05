package com.shaheen.config;

import com.shaheen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import java.util.HashMap;
import java.util.Map;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class MvcConfig {
    @Autowired
    private UserService userService;

    @Bean
    public HttpInvokerServiceExporter hessianServiceExporter() {
        HttpInvokerServiceExporter invokerProxyFactoryBean = new HttpInvokerServiceExporter();
        invokerProxyFactoryBean.setService(userService);
        invokerProxyFactoryBean.setServiceInterface(UserService.class);
        return invokerProxyFactoryBean;
    }

    @Bean
    public SimpleUrlHandlerMapping simpleUrlHandlerMapping() {
        SimpleUrlHandlerMapping simpleUrlHandlerMapping = new SimpleUrlHandlerMapping();
        Map<String, Object> urlMap = new HashMap<>();
        urlMap.put("/userService", hessianServiceExporter());
        simpleUrlHandlerMapping.setUrlMap(urlMap);
        return simpleUrlHandlerMapping;
    }
}
