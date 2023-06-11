import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int str;
        int sum = 0;
        float ave;
        System.out.print("Nhập số lượng chuỗi : ");
        str = sc.nextInt();

        int [] arr = new int [str];
        for (int i = 0; i < arr.length ;i++){
            System.out.printf("Nhập số thứ %d:\n" , i);
           arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        ave = (float) sum/arr.length;

        System.out.print("Giá trị trung bình của chuỗi :" + ave);

    }

}