package java6;

import java.util.Scanner;

public class Java6 {

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

        if (arr.length < 2) {
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
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.printf("Phan tu nho thu 2: " + arr[i+1]);
                return;
            }
        }
        System.out.printf("Khong ton tai phan tu lon thu 2");
    }

}
