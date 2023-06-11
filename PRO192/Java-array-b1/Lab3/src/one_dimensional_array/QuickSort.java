package one_dimensional_array;
public class QuickSort {
    static int partition(int array[], int begin, int end) {
        int pivot = array[end];
        int i = (begin - 1);
        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;
        return (i + 1);
    }

    public static void quickSort(int array[], int begin, int end) {
        if (begin < end) {
            int pi = partition(array, begin, end);
            quickSort(array, begin, pi - 1);
            quickSort(array, pi + 1, end);
        }
    }

}



/*
    public static void main(String[] args) {
        int[] array = createArray();

        while (true) {
            System.out.println("Please select an option:");
            System.out.println("1. Add a value to the array");
            System.out.println("2. Delete a value from the array");
            System.out.println("3. Sort the array using Quick sort algorithm");
            System.out.println("4. Search for a value in the array");
            System.out.println("5. Print the array");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addValueToArray(array);
                    break;
                case 2:
                    deleteValueFromArray(array);
                    break;
                case 3:
                    quickSort(array, 0, array.length - 1);
                    System.out.println("Array sorted successfully!");
                    break;
                case 4:
                    searchValueInArray(array);
                    break;
                case 5:
                    printArray(array);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
*/
