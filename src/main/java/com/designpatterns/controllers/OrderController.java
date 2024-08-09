package com.designpatterns.controllers;

import com.designpatterns.models.Order;
import com.designpatterns.observers.EmailNotificationObserver;
import com.designpatterns.observers.SmsNotificationObserver;
import com.designpatterns.services.PaymentService;
import com.designpatterns.strategies.BoletoPayment;
import com.designpatterns.strategies.CreditCardPayment;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @PostMapping
    public String createOrder() {
        Order order = new Order(1L);
        order.addObserver(new EmailNotificationObserver());
        order.addObserver(new SmsNotificationObserver());
        order.notifyObservers();
        return "Order created and notifications sent!";
    }

    @PostMapping("/pay")
    public String payOrder(@RequestParam("method") String method) {
        PaymentService paymentService = new PaymentService();
        if ("credit".equalsIgnoreCase(method)) {
            paymentService.setPaymentStrategy(new CreditCardPayment());
        } else if ("boleto".equalsIgnoreCase(method)) {
            paymentService.setPaymentStrategy(new BoletoPayment());
        } else {
            return "Invalid payment method";
        }
        paymentService.executePayment(100.0);
        return "Payment processed!";
    }
}
