package com.taran.properties.polymorphism;

public class Shapes {
    // Late Binding
    void area() {
        System.out.println("I am in Shapes");
    }

    // Early binding
//    final void area() {
//        System.out.println("I am in Shapes");
//    }

    // you cannot override a method that is final
}
