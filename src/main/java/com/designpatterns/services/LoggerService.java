package com.designpatterns.services;

public class LoggerService {
    private static LoggerService instance;

    private LoggerService() {}

    public static synchronized LoggerService getInstance() {
        if (instance == null) {
            instance = new LoggerService();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
