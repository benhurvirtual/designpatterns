package com.designpatterns.observers;

import com.designpatterns.models.Order;

public class SmsNotificationObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println("Sending SMS notification for order: " + order.getId());
    }
}
