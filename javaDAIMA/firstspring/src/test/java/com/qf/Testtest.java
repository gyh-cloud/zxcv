package com.qf;

import com.qf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Testtest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService =(UserService) cpx.getBean("userService");
        List all =  userService.findAll();

    }
}
