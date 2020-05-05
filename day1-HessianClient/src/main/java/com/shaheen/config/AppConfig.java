package com.shaheen.config;


import com.shaheen.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class AppConfig {
    @Bean
    public HessianProxyFactoryBean hessianProxyFactory() {
        HessianProxyFactoryBean hessianProxyFactory = new HessianProxyFactoryBean();
        hessianProxyFactory.setServiceUrl("http://localhost:8088/HessianServer/remote/userService");
        hessianProxyFactory.setServiceInterface(UserService.class);
        return hessianProxyFactory;
    }
}
