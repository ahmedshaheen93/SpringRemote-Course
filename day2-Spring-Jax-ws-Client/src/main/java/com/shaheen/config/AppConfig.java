package com.shaheen.config;

import com.shaheen.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
@ComponentScan(basePackages = "com.shaheen")
public class AppConfig {

    @Bean
    public JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean() {
        JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean = new JaxWsPortProxyFactoryBean();
        jaxWsPortProxyFactoryBean.setServiceInterface(UserService.class);
        try {
            jaxWsPortProxyFactoryBean.setWsdlDocumentUrl(new URL("http://localhost:8088/Spring-jax-ws/remote/UserService?wsdl"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        jaxWsPortProxyFactoryBean.setServiceName("UserControllerService");
        jaxWsPortProxyFactoryBean.setPortName("UserServicePort");
        return jaxWsPortProxyFactoryBean;
    }
}
