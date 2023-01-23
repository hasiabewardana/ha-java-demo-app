package oopconcepts.polymorphism;

public class PolymorphismDemo {
    public static void demoPolymorphism(){
        // Compile-time polymorphism
        PolymorphismImpl polymorphism = new PolymorphismImpl();
        polymorphism.method(1);
        polymorphism.method(1,2);

        // Runtime polymorphism
        polymorphism = new PolymorphismImplChild();
        polymorphism.version();
    }
}
