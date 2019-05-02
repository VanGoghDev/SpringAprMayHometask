package ru.firsov.hometask1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("hometask1/config.xml");
        context.getBean("hospital", HospitalImpl.class).sayCabinet();
    }
}
