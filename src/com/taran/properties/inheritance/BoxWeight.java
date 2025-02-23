package com.taran.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    BoxWeight() {
        this.weight = -1;
    }

//    static void greetings() {
//        System.out.println("Greetings from Box Weight.");
//    }

    BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // In order to set l, h, w we are called parent class constructor
        // used to initialise values present in parent class
        System.out.println("BoxWeight class constructor");
        this.weight = weight;
    }
    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

}
