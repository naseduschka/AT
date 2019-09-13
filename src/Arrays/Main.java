package Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Input the length of a new array:
        System.out.print("Input the length of the array: ");
        int n = scanner.nextInt();

        // 2. Create the array with n elements:
        int myArray[] = new int[n];

        // 3. Fill the array with data
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Input " + i + " element: ");
            myArray[i] = scanner.nextInt();
        }

        // 4. Print the array to the console:
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
