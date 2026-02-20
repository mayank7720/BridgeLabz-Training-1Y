package com.gla.interfacesabstraction.level1;

import java.io.Serializable;

public class BackupData implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int id;
    private final String content;

    public BackupData(int id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public String toString() {
        return "BackupData{id=" + id + ", content='" + content + "'}";
    }
}
