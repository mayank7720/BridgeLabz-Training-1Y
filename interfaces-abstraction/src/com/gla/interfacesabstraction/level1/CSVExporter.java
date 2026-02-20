package com.gla.interfacesabstraction.level1;

public class CSVExporter implements DataExporter {
    @Override
    public String export(String data) {
        return "CSV:" + data;
    }
}
