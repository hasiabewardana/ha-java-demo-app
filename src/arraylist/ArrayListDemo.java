package arraylist;

import java.util.Scanner;

public class ArrayListDemo {
    // Array List demonstration
    private static Scanner scanner = new Scanner(System.in);

    public static void handleGroceryList(){
        boolean isRunning = false;
        int choice = 0;

        while (!isRunning){
            System.out.println("\nEnter your preferred operation! ");
            System.out.println("\t1 - Add element to the grocery list.");
            System.out.println("\t2 - Print element of the grocery list.");
            System.out.println("\t3 - Search element of the grocery list.");
            System.out.println("\t4 - Modify element of the grocery list.");
            System.out.println("\t5 - Remove element of the grocery list.");
            System.out.println("\t6 - Process the ArrayList.");
            System.out.println("\t7 - Exit the program.");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\nEnter an item to the grocery list!");
                    String item = scanner.nextLine();
                    ArrayListImpl.addGroceryItem(item);
                    break;

                case 2:
                    ArrayListImpl.printGroceryItems();
                    break;

                case 3:
                    System.out.println("\nEnter an item to search in the grocery list!");
                    String itemToSearch = scanner.nextLine();
                    String searchedItem = ArrayListImpl.searchGroceryItem(itemToSearch);

                    if(searchedItem != null) {
                        System.out.println("\n" + searchedItem + " is found in the grocery list.");
                    }else{
                        System.out.println("\n" + itemToSearch + " is not found in the grocery list.");
                    }
                    break;

                case 4:
                    System.out.println("\nEnter the item you want to modify!");
                    String currentItem = scanner.nextLine();
                    System.out.println("\nEnter the new item you want to replace!");
                    String newItem = scanner.nextLine();
                    ArrayListImpl.modifyGroceryItem(currentItem, newItem);
                    break;

                case 5:
                    System.out.println("\nEnter the item you want to remove!");
                    String itemToRemove = scanner.nextLine();
                    ArrayListImpl.removeGroceryItem(itemToRemove);
                    break;

                case 6:
                    ArrayListImpl.processArrayList();
                    break;

                case 7:
                    isRunning = true;
                    break;
            }
        }
    }
}
