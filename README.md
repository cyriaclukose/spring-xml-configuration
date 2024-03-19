Spring framework provides a built in function or libraries for the common task like logging,security,transaction etc so that 
developer can focus on the buisness logic. One of the main feature of the spring framework is the spring IOC (INVERSION OF CONTROL)
container. Spring ioc container managed the life cycle of objects with the help of dependency injection.Spring IOC comtainer
instantiate the object , assemble the oject and manages the life cycle of objects. Inversion of control means instead of the user
creating the object the spring framework instantiates the objects. And in dependency injection the spring framework supplies 
the dependent object for an object instantiation.

Application context and bean factory are two interfaces corresponding to the spring IOC container.BeanFactory is the base interface.
It provides the basic functionality for the object instance management. ApplicationContext extends from the BeanFactory and has 
enterprise grade features like resolve messages,publish events, internationisation, application layer specific context.Application
context is the default container. Beans are the object instances managed by spring IOC containers

Theres are three ways to supply the bean configuration to the application context.
a. Java based
b. Annotation Bases from spring 2.5
c. Xml Based -traditional- here we have to supply the bean definition/configuration in the form of xml file under the resource folder in
```
<?xml version="1.0" encoding="utf-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
        http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">
    <bean id="student" class="org.example.Student">
        <property name="fname" value="john"/>
        <property name="lname" value="smith"/>
        <property name="address" ref="address"/>
    </bean>
    <bean id="address" class="org.example.Address">
        <constructor-arg name="address1" value="Connaught Avenue"/>
        <constructor-arg name="city" value=" plymouth"/>
    </bean>


</beans>
```
```
package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
    public static void main(String[] args) {


        ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");

        Student student= context.getBean(Student.class);

        System.out.println(student);

        BeanFactory beanFactory=new ClassPathXmlApplicationContext("spring-bean.xml");

        Address adress = beanFactory.getBean(Address.class);

        System.out.println(adress);


    }
}
```
There are two ways to injects the properties to the beans. Either using setter injection or constructor injection  using property tag and
constructor-arg tag as mentioned in the spring-bean.xml

    
