package com.gla.interfacesabstraction.level1;

public interface DataExporter {
    String export(String data);

    default String exportToJSON(String data) {
        String sanitized = data.replace("\"", "\\\"");
        return "{\"data\":\"" + sanitized + "\"}";
    }
}
