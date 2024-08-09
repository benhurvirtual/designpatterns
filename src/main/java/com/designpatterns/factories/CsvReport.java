package com.designpatterns.factories;

public class CsvReport implements Report {
    @Override
    public void generate() {
        System.out.println("Generating CSV report...");
    }
}
