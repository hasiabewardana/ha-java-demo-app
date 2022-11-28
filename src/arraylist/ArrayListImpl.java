package arraylist;

import java.util.ArrayList;

public class ArrayListImpl {
    // Implementing a grocery list with the ArrayList
    private static ArrayList<String> groceryList = new java.util.ArrayList<>();

    public static ArrayList<String> getGroceryList() {
        return groceryList;
    }

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
    public static String searchGroceryItem(String item) {
        boolean exists = groceryList.contains(item);

        if (exists) {
            int positionToSearch = groceryList.indexOf(item);
            return groceryList.get(positionToSearch);
        }

        return null;
    }

    // Modifying a specific item in the grocery list
    public static void modifyGroceryItem(String currentItem, String newItem) {
        boolean exists = onFile(currentItem);

        if (exists) {
            int position = findItem(currentItem);
            modifyGroceryItem(position, newItem);
        }
    }

    private static void modifyGroceryItem(int position, String newItem) {
        String oldItem = groceryList.get(position);
        groceryList.set(position, newItem);
        System.out.println("Item " + position + " has been modified in the grocery list.");
        printGroceryItems();
    }

    // Removing a specific item from the grocery list
    public static void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private static void removeGroceryItem(int position) {
        groceryList.remove(position);
        System.out.println("Item " + position + " has been removed from the grocery list.");
        printGroceryItems();
    }

    // Get the index of the item in the grocery list
    public static int findItem(String item) {
        return groceryList.indexOf(item);
    }

    // Checking whether the item is in the file or not
    public static boolean onFile(String item) {
        int position = findItem(item);

        return position >= 0;
    }

    // Processing the ArrayList
    public static void processArrayList() {
        // Creating a new ArrayList and copying the old list
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(getGroceryList());

        ArrayList<String> nextArrayList = new ArrayList<>(getGroceryList());

        // Creating a new Array and copying the old list
        String[] newArray = new String[getGroceryList().size()];
        newArray = getGroceryList().toArray(newArray);
    }
}
