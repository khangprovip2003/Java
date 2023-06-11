package bublesort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BubleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter number of array");
        int n = validateNumber();
        int[] arr = genRanArray(n);
        System.out.println("Unsorted array: "+  Arrays.toString(arr));
        BubbleSo(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void BubbleSo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static int[] genRanArray(int n) {
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(n);
        }
        return arr;
    }

    public static int validateNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.isEmpty()) {
                    System.err.println("Input couldn't be empty!");
                }
                int ouput = Integer.parseInt(input);
                if (ouput <= 0) {
                    System.err.println("input couldn't be small than zero!");
                } else {
                    return ouput;
                }
            } catch (NumberFormatException e) {
                System.err.println("You should enter a number ");
            }
        }
    }
}
