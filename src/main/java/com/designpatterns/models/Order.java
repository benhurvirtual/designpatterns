package com.designpatterns.models;

import com.designpatterns.observers.OrderObserver;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }
}
