package com.taran.singleton;

public class Main {
    public static void main(String[] args) {
        SingleTon obj = SingleTon.getInstance();
        SingleTon obj2 = SingleTon.getInstance();
        SingleTon obj3 = SingleTon.getInstance();
        SingleTon obj4 = SingleTon.getInstance();
        SingleTon obj5 = SingleTon.getInstance();

        // all 5 ref varibles are pointing to just one object
    }
}
