import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    private static final Scanner in = new Scanner(System.in);

    // check user input a positive decimal number
    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result > 0) {
                    return result;
                }
                System.err.println("Please input a positive decimal number.");
            } catch (NumberFormatException e) {
                System.err.println("Please input a number.");
            }
            System.out.print("Enter again: ");
        }
    }

    // allow user input number of array
    private static int inputSizeOfArray() {
        System.out.print("Enter the number of elements in the array: ");
        return checkInputInt();
    }

    // allow user input value of array
    private static int[] inputValueOfArray(int n) {
        System.out.print("Enter the minimum value for the array: ");
        int minValue = checkInputInt();

        System.out.print("Enter the maximum value for the array: ");
        int maxValue = checkInputInt();

        Random rand = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(maxValue - minValue + 1) + minValue;
        }
        return a;
    }

    // swap two elements in an array
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // sort array by bubble sort
    private static void bubbleSort(int[] a) {
        System.out.print("Unsorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        boolean swapped = true;
        for (int i = 0; i < a.length - 1 && swapped; i++) {
            swapped = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    swapped = true;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = inputSizeOfArray();
        int[] a = inputValueOfArray(n);
        bubbleSort(a);
    }
}
