
package java5;

import java.util.Scanner;


public class Java5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // num1 là số cần đảo ngược, reversed là số sau khi đảo ngược
    int num1,num2, reversed = 0;
    System.out.println("\nNhập vào số cần đảo ngược: ");
    num1 = sc.nextInt();
    //sở dĩ mình gán num1 cho num2 chỉ để hiển thị ra màn hình
    num2 = num1;
    //sử dụng vòng lặp while để đảo ngược num1
    while(num1 != 0) {
      int digit = num1 % 10;
      reversed = reversed * 10 + digit;
      num1 /= 10;   //   c /= a ~~ c = c/a
    }
    //hiển thị số sau khi đảo ngược ra màn hình
    System.out.printf("Số %d sau khi đảo ngược là: %d", num2, reversed);

   
  }
        
    }
    

