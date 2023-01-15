package observerp;

/**
 * Observer patterns allow as notifying without coupling objects
 *
 */
public class Main {
    public static void main(String[] args) {
     PaymentManager paymentManager= new PaymentManager();
     paymentManager.registerListener(NotificationManager::new);
     paymentManager.registerListener(PaymentEventLogger::new);
     paymentManager.pay();
    }
}
