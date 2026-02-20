package com.gla.interfacesabstraction.level1;

public class MarkerInterfacesDemo {
    public static void run() {
        BackupService backupService = new BackupService();
        backupService.processBackup(new BackupData(101, "PolicyBackup"));
        backupService.processBackup("PlainText");

        PrototypeObject original = new PrototypeObject("InsuranceModel", 1);
        PrototypeObject cloned = original.cloneObject();
        System.out.println("Original: " + original);
        System.out.println("Cloned: " + cloned);

        EncryptionService encryptionService = new EncryptionService();
        encryptionService.process(new SensitiveCustomerInfo("C-9001", "PAN-XXXXXX"));
        encryptionService.process("PublicData");
    }
}
