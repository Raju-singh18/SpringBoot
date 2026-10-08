package in.coderarmy.notification;

public class SmsSevice implements NotificationService {
   @Override
    public void sendNotification(){
        System.out.println("Sms Service sent..!");
    }
}
