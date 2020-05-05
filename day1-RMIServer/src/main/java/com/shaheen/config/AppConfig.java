package com.shaheen.config;

import com.shaheen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class AppConfig {
    @Autowired
    private UserService userService;

    @Bean
    public RmiServiceExporter rmiSeriveExporter() {
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("UserService");
        exporter.setService(userService);
        exporter.setServiceInterface(UserService.class);
        exporter.setRegistryPort(11223);
        return exporter;
    }
}
