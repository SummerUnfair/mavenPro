package com.Controller;

import com.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {

    /**
     * IOC容器的使用
     */
    @Test
    public void beanTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean.xml");
        UserService usr =  (UserService) ac.getBean("UserService");
        UserService usr2 = ac.getBean("UserService",UserService.class);
        usr.springTest();
        usr2.springTest();
    }

}
