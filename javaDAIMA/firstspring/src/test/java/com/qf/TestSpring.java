package com.qf;

import com.qf.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test(){
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("spring-context.xml");
        Student student = (Student) cpx.getBean("student");
        System.out.println(student);
    }
}
