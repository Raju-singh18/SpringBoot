package in.coder;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class OrderService {
    private PaymentService paymentService;

    public OrderService(@Lazy PaymentService paymentService){
        this.paymentService=paymentService;
//        System.out.println("OrderService Created");
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }

    public void getOrderDetails(){
        System.out.println("Order Details");
    }
}
