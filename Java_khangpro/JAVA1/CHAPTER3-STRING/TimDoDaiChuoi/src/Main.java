import java.util.*;
public class Main {
    public static void main(String[] args) {
       // tim do dai cua chuoi
        String s1  ;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chuoi bat ky :");
        s1 = sc.nextLine();
        while(s1.charAt(0) != '\0'){
            count ++;
        }


        System.out.printf(" Mang co do dai : %d",count );
    }

}