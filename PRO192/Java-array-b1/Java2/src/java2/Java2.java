package java2;

import java.util.Scanner;

public class Java2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str;
        int sum = 0;
        System.out.print("Nhập số lượng mảng : ");
        str = sc.nextInt();

        int[] arr = new int[str];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]:", i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.print("Tổng giá trị của 1 mảng :" + sum);

    }

}
