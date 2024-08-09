package com.designpatterns.services;

import com.designpatterns.strategies.PaymentStrategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
