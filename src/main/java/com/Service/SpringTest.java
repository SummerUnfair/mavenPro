package com.Service;

import com.Service.ServiceImp.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringTest {

    @Autowired
    private UserService user;

    public void autoWiredTest(){
        user.springTest();
    }

    public static void main (String[] args)
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring/bean.xml");
        UserServiceImpl at = (UserServiceImpl)ac.getBean("userServiceImpl");
        at.springTest();
    }
}
