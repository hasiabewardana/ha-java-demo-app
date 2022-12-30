package generics;

import java.util.ArrayList;

public class GenericsImpl {
    // Without generics
    public static void generateNumbersWithoutGenerics(){
        ArrayList items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        // items.add("Peter"); // There's not a compile-time error but a run-time error for this line of code.

        printDoubledWithoutGenerics(items);
    }

    public static void printDoubledWithoutGenerics(ArrayList items){
        for (Object o: items){
            System.out.println((Integer) o * 2);
        }
    }

    // With generics
    public static void generateNumbersWithGenerics(){
        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        // items.add("Peter"); // There's a compile-time error for this line of code.

        printDoubledWithGenerics(items);
    }

    public static void printDoubledWithGenerics(ArrayList<Integer> items){
        for (int i: items){
            System.out.println(i * 2);
        }
    }
}
