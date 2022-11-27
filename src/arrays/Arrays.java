package arrays;

import java.util.Scanner;

public class Arrays {
    // Resizing an array
    // Accepting numbers from the console to an array
    public static void getInputData(Scanner scanner, int[] numbers){
        System.out.println("\nEnter 10 numbers to the system!");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
    }

    // Printing out the elements of an array
    public static void printArray(int[] numbers){
        System.out.println("\nYou've entered: ");

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
    }

    // Resizing an array
    public static int[] resizeArray(Scanner scanner, int[] numbers){
        int[] tempArray = numbers;
        numbers = new int[12];

        for (int i = 0; i < tempArray.length; i++) {
            numbers[i] = tempArray[i];
        }

        return numbers;
    }
}