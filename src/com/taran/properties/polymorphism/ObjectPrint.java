package com.taran.properties.polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }

    public static void main(String[] args) {
        ObjectPrint objectPrint = new ObjectPrint(5);

        System.out.println(objectPrint);
    }
}
