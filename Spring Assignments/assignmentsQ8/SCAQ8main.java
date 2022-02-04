package spring.assignmentsQ8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SCAQ8main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/assignments/SCAQ8beans.xml");

        context.registerShutdownHook();

        SCAQ8 dog= (SCAQ8)context.getBean("dog");
        dog.eat();

        SCAQ8 dog1= (SCAQ8)context.getBean("dog1");
        dog1.eat();

        SCAQ8 dog2= (SCAQ8)context.getBean("dog2");
        dog2.eat();

    }


}