package com.gla.interfacesabstraction.level1;

import java.io.Serializable;

public class BackupService {
    public void processBackup(Object obj) {
        if (obj instanceof Serializable) {
            System.out.println("Stored for backup: " + obj);
        } else {
            System.out.println("Skipped backup: object is not Serializable");
        }
    }
}
