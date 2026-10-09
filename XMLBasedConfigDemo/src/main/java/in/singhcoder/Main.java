package in.singhcoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

//        Get bean by type
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        get bean by id/name
//        OrderService order = (OrderService) context.getBean("orderService");
//        order.placeOrder();

//        OrderService order = context.getBean("orderService",OrderService.class);
//        order.placeOrder();

//        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
//        paymentService.pay();

        UserService user = context.getBean(UserService.class);
//        System.out.println(user.getUserName());

//        System.out.println(user.getUsernames());

        context.close();
    }
}
