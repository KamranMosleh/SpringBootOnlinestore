package com.example.onlinestore;

public class OrderService {
    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        // use a payment service here like Stripe
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
