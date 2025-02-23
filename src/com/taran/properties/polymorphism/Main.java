package com.taran.properties.polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}
