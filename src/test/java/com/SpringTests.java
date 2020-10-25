package com;

import com.Pojo.Account;
import com.Pojo.Address;
import com.Service.ServiceImp.UserServiceImpl;
import com.Service.SpringTest;
import com.Service.UserService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class SpringTests {

    @Autowired
    private UserService user;

    public static void main (String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean.xml");
        SpringTest at = (SpringTest)ac.getBean("springTest");
        at.autoWiredTest();
    }
}
