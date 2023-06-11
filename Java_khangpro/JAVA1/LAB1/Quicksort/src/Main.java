import java.util.Arrays;

class Quicksort {

    // method to find the partition position
    static int partition(int array[], int begin, int end) {

        // chọn pivot là vị trí cuối cùng của mảng ( end)
        int pivot = array[end];
        int i = (begin - 1);

        // duyệt qua các phần tử mảng và so sánh với privot ( end)
        for (int j = begin; j < end; j++) {
            if (array[j] <= pivot) {

                // phần tử nhỏ hơn pivot thì hoán đổi, lớn hơn thì chạy tiếp
                // so sánh j và pivot xong tăng i++ lên và hoán đổi i và j
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // hoán đổi phần tử pivot với phần tử lớn hơn được chỉ định bởi i
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        // trả về thằng chủ chốt (pivot)
        return (i + 1);
    }

    static void quickSort(int array[], int begin, int end) {
        if (begin < end) {

            // tìm phần tử pivot sao cho
            // các phần tử nhỏ hơn pivot nằm bên trái
            // các phần tử lớn hơn pivot ở bên phải
            int pi = partition(array, begin, end);

            // gọi đệ quy bên trái của  pivot
            quickSort(array, begin, pi - 1);

            // gọi đệ quy bên phải của pivot
            quickSort(array, pi + 1, end);
        }
    }
}

// Main class
class Main {
    public static void main(String args[]) {

        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data));

        int size = data.length;

        // call quicksort() on array data
        Quicksort.quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(data));
    }
}