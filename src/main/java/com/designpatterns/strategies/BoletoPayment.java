package com.designpatterns.strategies;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Boleto.");
    }
}
