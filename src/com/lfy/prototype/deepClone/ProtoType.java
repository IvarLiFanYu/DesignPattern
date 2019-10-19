package com.lfy.prototype.deepClone;

import java.io.Serializable;

public class ProtoType implements Serializable, Cloneable{
    private String name;
    private String protoClass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtoClass() {
        return protoClass;
    }

    public void setProtoClass(String protoClass) {
        this.protoClass = protoClass;
    }

    public ProtoType(String name, String protoClass) {
        this.name = name;
        this.protoClass = protoClass;
    }

    @Override
    public String toString() {
        return "ProtoType{" +
                "name='" + name + '\'' +
                ", protoClass='" + protoClass + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
