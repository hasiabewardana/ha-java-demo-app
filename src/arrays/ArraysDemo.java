package arrays;

import java.util.Scanner;

public class ArraysDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static int[] numbers = new int[10];

    public static void getInputData(){
        System.out.println("\nEnter 10 numbers to the system!");

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }
    }

    public static void printArray(){
        System.out.println("\nYou've entered: ");

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
    }

    public static void resizeArray(){
        int[] tempArray = numbers;
        numbers = new int[12];

        for (int i = 0; i < tempArray.length; i++) {
            numbers[i] = tempArray[i];
        }
    }

    public static void handleInput(){
        ArraysDemo.getInputData();
        ArraysDemo.printArray();
        ArraysDemo.resizeArray();

        System.out.println("\nEnter another 2 numbers to the system!");

        numbers[10] = scanner.nextInt();
        numbers[11] = scanner.nextInt();

        ArraysDemo.printArray();
    }
}