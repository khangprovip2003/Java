package java3;

import java.util.Scanner;

public class Java3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str;
        System.out.print("Nhập số lượng mảng : ");
        str = sc.nextInt();

        int[] arr = new int[str];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]:", i);
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j]) && (i != j)) {
                    System.out.println("Giá trị trùng  : " + arr[j]);
                }
            }
        }
    }

}
