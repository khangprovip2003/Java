package java7;

import java.util.Arrays;
import java.util.Scanner;

public class Java7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str;
        System.out.print("Nhập số lượng cua 2 mang so nguyen : ");
        str = sc.nextInt();

        int[] array1 = new int[str];
        System.out.println("Nhập phần tử mảng 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("arr[%d]:", i);
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[str];
        System.out.println("Nhập phần tử mảng 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("arr[%d]:", i);
            array2[i] = sc.nextInt();
        }
        System.out.println("Array1:");
        for (int x : array1) {
            System.out.print(x);
        }
        System.out.println("Array2:");
        for (int y : array2) {
            System.out.print(y);
        }
        

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == (array2[j])) {

                    System.out.println("Common element is : " + (array1[i]));
                }
            }
        }

    }

}
