package in.coderarmy.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //if we create bean from @Component and @Bean then also only one object/Bean will be created in IOC Container
//@Qualifier("cp")
public class CardPayment implements PaymentService {

    @Override
    public void pay(){
      System.out.println("Paying via Card");
    }
}
