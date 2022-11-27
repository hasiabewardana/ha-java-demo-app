package arrays;

import java.util.Scanner;

public class ArraysDemo {
    // Arrays demonstration
    private static Scanner scanner = new Scanner(System.in);
    private static int[] numbers = new int[10];

    // Handing user input
    public static void handleInput(){
        Arrays.getInputData(scanner, numbers);
        Arrays.printArray(numbers);
        int[] nums = Arrays.resizeArray(scanner, numbers);

        System.out.println("\nEnter another 2 numbers to the system!");

        nums[10] = scanner.nextInt();
        nums[11] = scanner.nextInt();

        Arrays.printArray(nums);
    }
}
