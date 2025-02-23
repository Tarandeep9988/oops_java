package com.taran.access;

public class A {
    private int num;
    public String name;
    protected int [] arr;

    A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
    A() {

    }
    public int getNum() {
        return num;
    }

    void setNum(int num) {
        this.num = num;
    }
}
