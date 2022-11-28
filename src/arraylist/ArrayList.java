package arraylist;

import java.util.Scanner;

public class ArrayList {
    // Implementing a grocery list with the ArrayList
    private static final java.util.ArrayList<String> groceryList = new java.util.ArrayList<>();

    // Adding items to the grocery list
    public static void addGroceryItem(String item) {
        groceryList.add(item);
        System.out.println("You have added " + item + " to the grocery list.");
    }

    // Printing out the items of the grocery list
    public static void printGroceryItems() {
        System.out.println("\nYou have " + groceryList.size() + " items in your grocery list.");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(groceryList.get(i));
        }
    }

    // Searching out a specific item in the grocery list
    public static void searchGroceryItem(int position) {
        String searchedItem = groceryList.get(position - 1);
        System.out.println("\n" + searchedItem + " is found in the grocery list.");
    }

    // Modifying a specific item in the grocery list
    public static void modifyGroceryItem(int position, String newItem) {
        String oldItem = groceryList.get(position - 1);
        groceryList.set(position - 1, newItem);
        System.out.println("Item " + position + " has been modified in the grocery list.");
        printGroceryItems();
    }

    // Removing a specific item from the grocery list
    public static void removeGroceryItem(int position){
        groceryList.remove(position - 1);
        System.out.println("Item " + position + " has been removed from the grocery list.");
        printGroceryItems();
    }
}
