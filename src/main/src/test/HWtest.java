package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HWtest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_quartz.xml");
    }
}
