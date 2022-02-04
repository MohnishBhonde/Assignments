package spring.assignmentsQ6;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SCAQ6main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/assignmentsQ6/SCAQ6beans.xml");
        DbConfiguration dbConfiguration = (DbConfiguration)context.getBean("dbConfiguration");
        dbConfiguration.display();
    }

}