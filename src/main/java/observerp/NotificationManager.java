package observerp;

public class NotificationManager implements PaymentListener{
    private void sendNotification(){
        System.out.println("Notification sent");
    }

    public void paymentMade() {
        sendNotification();
    }
}
