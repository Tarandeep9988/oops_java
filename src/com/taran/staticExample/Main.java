package com.taran.staticExample;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.population);
        Human taran = new Human(18, "Taran", 10000, false);
        Human rahul = new Human(19, "Rahul", 20000, true);
        Human john = new Human(22, "John", 30000, true);
        Human alice = new Human(23, "Alice", 40000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        Main obj = new Main();
        obj.fun();
    }

    void fun() {

        greeting();

        // you cannot access non-static stuff without referencing their instances in a static context
    }

    // we know that something which is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello, World!");
    }
}
