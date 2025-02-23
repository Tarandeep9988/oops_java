package com.taran.access;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "Taran");
        obj.getNum();
        ObjectDemo obj2 = new ObjectDemo(10, 13.2);
        System.out.println(obj2 instanceof Object);
        System.out.println(obj2.getClass());
    }

    // need to do a few things
    // 1. access the data members
    // 2. modify the data members

//    ArrayList<Integer> list = new ArrayList<>();
}
