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
            System.out.println("\t6 - Exit the program.");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("\nEnter an item to the grocery list!");
                    String item = scanner.nextLine();
                    ArrayList.addGroceryItem(item);
                    break;

                case 2:
                    ArrayList.printGroceryItems();
                    break;

                case 3:
                    System.out.println("\nEnter an item to search in the grocery list!");
                    int itemToSearch = scanner.nextInt();
                    ArrayList.searchGroceryItem(itemToSearch);
                    break;

                case 4:
                    System.out.println("\nEnter the position of the item you want to modify!");
                    int itemToModify = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("\nEnter the new item you want to fill the above position!");
                    String newItem = scanner.nextLine();
                    ArrayList.modifyGroceryItem(itemToModify, newItem);
                    break;

                case 5:
                    System.out.println("\nEnter the position of the item you want to remove!");
                    int itemToRemove = scanner.nextInt();
                    ArrayList.removeGroceryItem(itemToRemove);
                    break;

                case 6:
                    isRunning = true;
                    break;
            }
        }
    }
}
