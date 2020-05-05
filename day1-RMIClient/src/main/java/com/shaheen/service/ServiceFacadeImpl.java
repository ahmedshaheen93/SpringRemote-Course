package com.shaheen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import org.springframework.stereotype.Service;

@Service("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {
    @Autowired
    private RmiProxyFactoryBean rmiProxyFactoryBean;

    @Override
    public UserService getUserService() {
        return (UserService) rmiProxyFactoryBean.getObject();
    }
}
