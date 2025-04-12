package com.example.onlinestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OnlinestoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OnlinestoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
//		var orderService = new OrderService();
//		orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}
}
