package java5;

import java.util.Scanner;

public class Java5 {

    public static void main(String[] args) {

        print2largest();
    }

    static void print2largest() {
        Scanner sc = new Scanner(System.in);
        int str;
        System.out.print("Nhập số lượng mảng : ");
        str = sc.nextInt();

        int[] arr = new int[str];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]:", i);
            arr[i] = sc.nextInt();
        }

        if (str < 2) {
            System.out.printf("Khong ton tai phan tu lon thu 2");
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                System.out.printf("Phan tu lon thu 2: " + arr[i]);
                return;
            }
        }
        System.out.printf("Khong ton tai phan tu lon thu 2");
    }

}
