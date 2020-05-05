package com.shaheen.config;


import com.shaheen.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class AppConfig {
    @Bean
    public HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean() {
        HttpInvokerProxyFactoryBean httpInvokerProxyFactoryBean = new HttpInvokerProxyFactoryBean();
        httpInvokerProxyFactoryBean.setServiceUrl("http://localhost:8088/HttpInvokerServer/remote/userService");
        httpInvokerProxyFactoryBean.setServiceInterface(UserService.class);
        return httpInvokerProxyFactoryBean;
    }
}
