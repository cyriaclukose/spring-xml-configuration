package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");

        Student student= context.getBean(Student.class);

        System.out.println(student);

        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring.xml");

        Address adress = beanFactory.getBean(Address.class);

        System.out.println(adress);


    }
}