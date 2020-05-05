package com.shaheen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Service;

@Service("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {
    @Autowired
    private JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean;

    @Override
    public UserService getUserService() {
        return (UserService) jaxWsPortProxyFactoryBean.getObject();
    }
}
