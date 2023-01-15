package observerp;

public class PaymentEventLogger implements PaymentListener{
    private void log(){
        System.out.println("Payment received");
    }

    public void paymentMade() {
        log();
    }
}
