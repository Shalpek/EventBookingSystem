package controller;

import payment.PaymentStrategy;
import view.PaymentView;

/**
 * Controller for handling payment logic.
 */
public class PaymentController {
    private PaymentView paymentView;

    public PaymentController(PaymentView paymentView) {
        this.paymentView = paymentView;
    }

    public void processPayment(PaymentStrategy strategy, double amount) {
        strategy.pay(amount);
        paymentView.displayPaymentConfirmation(amount);
    }
}
