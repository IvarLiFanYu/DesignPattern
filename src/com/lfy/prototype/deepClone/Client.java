package com.lfy.prototype.deepClone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*DeepProtoType deepProtoType = new DeepProtoType("小明",new ProtoType("小红","小红类"));
        DeepProtoType clone1 = (DeepProtoType)deepProtoType.clone();
        DeepProtoType clone2 = (DeepProtoType)deepProtoType.clone();
        System.out.println(clone1.getProtoType().hashCode());
        System.out.println(clone2.getProtoType().hashCode());*/
        DeepProtoType deepProtoType = new DeepProtoType("小明",new ProtoType("小红","小红类"));
        DeepProtoType deepProtoType1 = (DeepProtoType)deepProtoType.deepClone();
        DeepProtoType deepProtoType2 = (DeepProtoType)deepProtoType.deepClone();
        System.out.println(deepProtoType1);
        System.out.println(deepProtoType2);
        System.out.println(deepProtoType1.getProtoType().hashCode());
        System.out.println(deepProtoType2.getProtoType().hashCode());
    }
}
