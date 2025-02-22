public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        final int bonus = 2;
//        bonus = 3;

        final A taran = new A("Tarandeep");

        // when a non primitive is final, you cannot reassign it.
        taran.name = "other name";

        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj = new A("Random name");
        }
    }

    static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10; // always initilize when declared
    String name;

    A(String name) {
//        System.out.println("Object created");
        this.name = name;
    }
    protected  void finalize() throws Throwable {
        System.out.println("finalize");;
    }
}