package com.example.onlinestore;

public class OrderService {
    public void placeOrder(){
        // use a payment service here like Stripe
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}
