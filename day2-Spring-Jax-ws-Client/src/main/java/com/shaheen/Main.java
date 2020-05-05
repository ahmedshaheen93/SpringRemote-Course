package com.shaheen;

import com.shaheen.config.AppConfig;
import com.shaheen.service.ServiceFacade;
import com.shaheen.service.User;
import com.shaheen.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // old way
//        UserControllerService userControllerService = new UserControllerService();
//        UserService userServicePort = userControllerService.getUserServicePort();
//        User user = new User();
//        user.setName("ahmed");
//        user.setBounce(650d);
//        user.setSalary(10000d);
//        user.setDeduction(250d);
//        System.out.println("NetSalary = " + userServicePort.getNetSalary(user));
        
        // using IOC container 
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        ServiceFacade serviceFacade = (ServiceFacade) context.getBean("serviceFacade");

        UserService userService = serviceFacade.getUserService();

        User user = new User();
        user.setName("ahmed");
        user.setBounce(650d);
        user.setSalary(10000d);
        user.setDeduction(250d);
        Double netSalary = userService.getNetSalary(user);
        System.out.println("Net Salary = " + netSalary);
    }

}
