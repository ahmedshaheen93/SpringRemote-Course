package com.shaheen;

import com.shaheen.config.AppConfig;
import com.shaheen.model.User;
import com.shaheen.service.ServiceFacade;
import com.shaheen.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceFacade serviceFacade = (ServiceFacade) context.getBean("serviceFacade");
        User user = new User("ahmed shaheen", 10000d, 600d, 250d);
        UserService userService = serviceFacade.getUserService();
        Double netSalary = userService.getNetSalary(user);
        System.out.println("Net Salary = " + netSalary);
    }
}
