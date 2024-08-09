package com.designpatterns.observers;

import com.designpatterns.models.Order;

public interface OrderObserver {
    void update(Order order);
}
