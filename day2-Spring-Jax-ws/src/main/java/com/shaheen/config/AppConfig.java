package com.shaheen.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class AppConfig {
    @Bean
    public SimpleJaxWsServiceExporter simpleJaxWsServiceExporter() {
        SimpleJaxWsServiceExporter simpleJaxWsServiceExporter = new SimpleJaxWsServiceExporter();
        simpleJaxWsServiceExporter.setBaseAddress("http://localhost:8088/Spring-jax-ws/remote/");
        return simpleJaxWsServiceExporter;
    }
}
