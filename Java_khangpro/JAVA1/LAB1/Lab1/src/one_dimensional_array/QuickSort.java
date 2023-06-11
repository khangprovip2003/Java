package one_dimensional_array;
import java.util.*;
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
