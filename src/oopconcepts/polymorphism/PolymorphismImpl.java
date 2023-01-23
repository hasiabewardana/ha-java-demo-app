package oopconcepts.polymorphism;

public class PolymorphismImpl {
    // Compile-time polymorphism
    void method(int a) {
        System.out.println("a: " + a);
    }

    void method(int a, int b) {
        System.out.println("a and b: " + a + ", " + b);
    }

    public void version() {
        System.out.println("Super class version");
    }
}
