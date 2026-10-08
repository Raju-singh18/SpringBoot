package in.coderarmy;

import in.coderarmy.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

//    @Autowired // for field dependencies injection
    private PaymentService paymentService;

//    @Autowired // if we have only one contructor then we do not need to write @Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }

//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placed(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
