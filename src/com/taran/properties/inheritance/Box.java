package com.taran.properties.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box() {
//        super(); Object class constructor gets called
        this(-1d);
    }
    // cube {
    Box(double side) {
        this.h = this.l = this.w = side;
    }
    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
    void information() {
        System.out.println("Running the box");
    }

    static void greetings() {
        System.out.println("Hey, I am in Box class");
    }
}


// final prevents class from being inherited;