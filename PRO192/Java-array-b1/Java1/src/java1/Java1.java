package java1;
import java.util.Scanner;

public class Java1 {
    public static void main(String[] args) {
        arrayNumber();
        arrayList();
    }

    public static void arrayNumber() {
        Scanner sc = new Scanner(System.in);
        float str;

        System.out.print("Nhập số lượng mảng số : ");
        str = sc.nextInt();

        float[] arr = new float[(int) str];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]:", i);
            arr[i] = sc.nextFloat();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    float tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (float x : arr) {
            System.out.printf("%.2f ", x);
        }
    }

    public static void arrayList() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int str2;

        System.out.print("\nNhập số lượng mảng chuỗi " );
        str2 = sc.nextInt();

        String[] arr = new String[str2];
        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("Chuỗi %d:" , i );
            arr[i] = sc2.nextLine();
        }

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp:");
        for (int i = 0; i <= arr.length - 1; i++)
        {
            System.out.print(arr[i] + ", ");
        }
        }

    }
