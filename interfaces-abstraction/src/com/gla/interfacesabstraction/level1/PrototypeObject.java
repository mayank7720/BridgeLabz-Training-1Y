package com.gla.interfacesabstraction.level1;

public class PrototypeObject implements Cloneable {
    private final String name;
    private final int version;

    public PrototypeObject(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public PrototypeObject cloneObject() {
        try {
            return (PrototypeObject) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "PrototypeObject{name='" + name + "', version=" + version + "}";
    }
}
