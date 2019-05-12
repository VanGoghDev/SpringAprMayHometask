package ru.firsov.hometask1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// xml config
public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/hometask1/config.xml");
        context.getBean("hospital", HospitalImpl.class).sayCabinet();
    }
}

// JavaConfig
class Client2{
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HospitalImpl hospital = context.getBean("hospital", HospitalImpl.class);
        hospital.sayCabinet();
    }
}
