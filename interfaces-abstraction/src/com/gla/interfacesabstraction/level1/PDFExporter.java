package com.gla.interfacesabstraction.level1;

public class PDFExporter implements DataExporter {
    @Override
    public String export(String data) {
        return "PDF:" + data;
    }
}
