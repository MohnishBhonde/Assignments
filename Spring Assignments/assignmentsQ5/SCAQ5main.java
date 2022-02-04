package spring.assignmentsQ5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SCAQ5main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/assignmentsQ5/SCAQ5beans.xml");


        Student studentRequired = (Student)context.getBean("studentRequired");
        studentRequired.getStudentDetails();

        Student studentResource = (Student)context.getBean("studentResource");
        studentResource.getStudentDetailsUsingResource();


    }
}