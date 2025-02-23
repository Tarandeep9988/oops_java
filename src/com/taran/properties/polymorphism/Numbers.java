package com.taran.properties.polymorphism;

public class Numbers {
//    int sum(int a, String b) {
//        return a;
//    }
//    int sum(String a, int b) { // for function overloading order of the type should be different
//        return b;
//    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum (int a, int b, int c) {
        return a + b + c;
    }
    int sum(int... numbers) {
        int s = 0;
        for (int number : numbers) {
            s += number;
        }
        return s;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(2, 3));
        System.out.println(obj.sum(3, 4, 5));
        System.out.println(obj.sum(3, 4, 5, 6,2,3,3,4,3));



    }
}
