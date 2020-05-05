package com.shaheen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;
import org.springframework.stereotype.Service;

@Service("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {
    @Autowired
    private HessianProxyFactoryBean hessianProxyFactoryBean;

    @Override
    public UserService getUserService() {
        return (UserService) hessianProxyFactoryBean.getObject();
    }
}
