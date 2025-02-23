package com.taran.access;

public class ObjectDemo extends A {

    int num;
    double gpa;

    // Already covered these two
    @Override
    public String toString() {
        return "ObjectDemo{}";
    }

//    @Override // gets called when the garbage collection hits
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    ObjectDemo(int num, double gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // We will go in details of how to create it in hashmap lecture
    @Override
    public int hashCode() {
        return super.hashCode(); // gives a number corresponding to that object
        // It's a random integer value for that object
        // formed by some algorithm
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(10, 56.8);

        ObjectDemo obj2 = new ObjectDemo(10,  78.9);


//        System.out.println(obj.hashCode(                                                    ));
//        System.out.println(obj2.hashCode());

        if (obj == obj2) {
            System.out.println(" Obj is equal to obj 2");
        }
        if (obj.equals(obj2)) {
            System.out.println("Obj1 is equal to obj2 2");
        }
    }
}
