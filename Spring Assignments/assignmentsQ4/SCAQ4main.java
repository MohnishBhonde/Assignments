package spring.assignmentsQ4;


import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SCAQ4main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SCAQ4beans.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");


        System.out.println(controller.getBalance(2323));
        System.out.println(controller.deposit(2323,5000));
        System.out.println("+++++++++++++++++++++++++++");
        System.out.println(controller.withdraw(2323,5000));
        System.out.println(controller.getBalance(2323));
        System.out.println("___________________________________________");
        System.out.println(controller.fundTransfer(2323,3232,5000));
        System.out.println(controller.getBalance(2323));
        System.out.println(controller.getBalance(3232));


    }
}