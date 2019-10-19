package com.lfy.prototype.deepClone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
    private String name;
    private ProtoType protoType;

    public DeepProtoType() {
    }

    public DeepProtoType(String name, ProtoType protoType) {
        this.name = name;
        this.protoType = protoType;
    }

    @Override
    public String toString() {
        return "DeepProtoType{" +
                "name='" + name + '\'' +
                ", protoType=" + protoType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProtoType getProtoType() {
        return protoType;
    }

    public void setProtoType(ProtoType protoType) {
        this.protoType = protoType;
    }

    //通过修改默认的clone方法进行深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //先默认将普通属性进行拷贝
        Object object = super.clone();
        //然后再拷贝引用类型 protoType
        DeepProtoType deepProtoType = (DeepProtoType) object;
        //将引用类型设置进入
        deepProtoType.setProtoType((ProtoType) protoType.clone());
        return deepProtoType;
    }

    //方式二进行深拷贝
    public Object deepClone() {
        //流定义
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        //进行拷贝
        try {
            //先写出
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //再读入
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType object = (DeepProtoType)ois.readObject();
            return object;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                bis.close();
                ois.close();
                bos.close();
                oos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
