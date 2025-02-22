package com.taran.staticExample;


import java.util.Arrays;

// outside classes cannot be static
public class InnerClass {
    class Test {
        static String name;

        public Test(String name) {
            Test.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        InnerClass inner2 = new InnerClass();
        Test a = inner.new Test("Taran");
        Test b = inner2.new Test("Karan");
//        System.out.println(a.name);
//        System.out.println(b.name);

        System.out.println(a);
    }
}




