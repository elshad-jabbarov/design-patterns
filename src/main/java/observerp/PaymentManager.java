package observerp;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {
    private final List<PaymentListener> paymentListeners = new ArrayList<PaymentListener>();

    public void pay() {
        paymentListeners.forEach(PaymentListener::paymentMade);
    }

    public void registerListener(PaymentListener paymentListener) {
        paymentListeners.add(paymentListener);
    }
}
