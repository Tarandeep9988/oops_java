package com.taran.introduction;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Classes should start with capital letter
        Student[] students = new Student[5];

        Student s1; // declaring, object is not created
        s1 = new Student(13, "Rahul", 52.4f); // this dynamically allocates memory in runtime and returns a reference to it.
        // Hence all objects in java are allocated in runtime dynamically
        // currently s1 is not referring to anything but s1 is in stack
//        System.out.println(Arrays.toString(students));


        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.greetings();
        s1.changeName("Jonny");
        s1.greetings();

        Student random = new Student();
        Student random2 = random;
        random2.name = "Berlin";
        random.greetings();
    }
}

// create a class
// for every single student
class Student {
    int rollNo;
    String name;
    float marks;
    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    Student (Student other) {
        this.rollNo = other.rollNo;
        this.marks = other.marks;
        this.name = other.name;
    }
    Student() {
        // this is how you call a constructor from another constructor
        this(0, "nothing", 23.4f);
    }
    void greetings() {
        System.out.println("Hello, " + name + "!");
    }
    void changeName(String name) {
        this.name = name;
    }
}


