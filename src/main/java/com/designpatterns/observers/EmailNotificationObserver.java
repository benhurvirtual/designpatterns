package com.designpatterns.observers;

import com.designpatterns.models.Order;

public class EmailNotificationObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        System.out.println("Sending email notification for order: " + order.getId());
    }
}
