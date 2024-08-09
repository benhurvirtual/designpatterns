package com.designpatterns.factories;

public class ReportFactory {
    public static Report createReport(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PdfReport();
        } else if (type.equalsIgnoreCase("csv")) {
            return new CsvReport();
        } else {
            throw new IllegalArgumentException("Unknown report type");
        }
    }
}
