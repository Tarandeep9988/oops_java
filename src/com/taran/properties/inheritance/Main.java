package com.taran.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4,3,3);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.h + " " + box3.w + " " + box3.weight);
//        System.out.println(box4.l + " " + box4.h + " " + box4.w + " " + box4.weight);

//        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e, BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the object itself is of type parent class, how will you call the constructor of child class
//        BoxWeight box6 = new Box(2, 3, 4);
//        Box b7 = new Box();

//        BoxPrice box = new BoxPrice(10, 10, 10, 10, 10);

        Box box = new BoxWeight();
        BoxWeight.greetings();
    }
}
