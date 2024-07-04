import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the given size
        int[] intArray = new int[size];

        // Prompt the user to enter elements for the array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i : intArray) { // The for (int i : intArray) construct is known as the "enhanced for loop" or "for-each loop" in Java. This loop is used to iterate over elements in a collection or an array.
            System.out.print(i + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
