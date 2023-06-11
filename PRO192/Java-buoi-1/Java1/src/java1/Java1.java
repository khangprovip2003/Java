package java1;

import java.util.*;

public class Java1 {

    public static void main(String[] args) {
        int a;
        int b;
        float c;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Input number 1: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Input number 2: ");
        b = Integer.parseInt(sc.nextLine());
        c = (float) a / b;
        System.out.printf(" Kết quả sau khi làm tròn thập phân thứ 3 là %.3f ", c);

    }

}
