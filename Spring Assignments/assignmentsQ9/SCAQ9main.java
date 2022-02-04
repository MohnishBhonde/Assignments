package spring.assignmentsQ9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SCAQ9main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("SCAQ9beans.xml");
        context.registerShutdownHook();

        SCAQ9 beanLifeCycle=(SCAQ9) context.getBean("LifeCycle");
        beanLifeCycle.display();
    }
}