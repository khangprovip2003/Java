package java3;

import java.util.Scanner;

public class Java3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số kép: ");
        double value = Double.parseDouble(sc.nextLine());
        if (value == (int) value) {
            System.out.println("Đây là số nguyên!!!");
        } else {
            System.out.println("Đây không phải số nguyên!!!");
        }
    }
}
