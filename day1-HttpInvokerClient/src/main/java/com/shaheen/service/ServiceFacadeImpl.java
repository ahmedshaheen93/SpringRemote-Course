package com.shaheen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;
import org.springframework.stereotype.Service;

@Service("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {
    @Autowired
    private HttpInvokerProxyFactoryBean invokerProxyFactoryBean;

    @Override
    public UserService getUserService() {
        return (UserService) invokerProxyFactoryBean.getObject();
    }
}
