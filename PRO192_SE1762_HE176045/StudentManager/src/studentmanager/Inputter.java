package studentmanager;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Inputter {
    private static Scanner sc = new Scanner(System.in);
//Phương thức inputInt() yêu cầu người dùng nhập một số nguyên trong khoảng giá trị từ min đến max (bao gồm cả min và max). 
    public static int inputInt(String msg, int min, int max) {
        int choice;
        while (true) {
            System.out.print(msg);
            try {
                choice = Integer.parseInt(sc.nextLine());
                if (choice < min || choice > max) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
            }
        }
        return choice;
    }
//Phương thức inputNonBlankStr() yêu cầu người dùng nhập một chuỗi không trống, tức là không được nhập vào chuỗi rỗng hoặc chỉ gồm các khoảng trắng. 
    public static String inNonBlankStr(String msg) {
        String input;
        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                break;
            }
            System.out.println("Invalid input. Please enter a non-blank string.");
        }
        return input;
    }
//Phương thức inputPattern() yêu cầu người dùng nhập một chuỗi theo một mẫu nhất định.
//Mẫu này được truyền vào phương thức dưới dạng một chuỗi biểu thức chính quy.
    public static String inputPattern(String msg, String pattern) {
        String input;
        while (true) {
            System.out.print(msg);
            input = sc.nextLine().trim();
            if (Pattern.matches(pattern, input)) {
                break;
            }
            System.out.println("Invalid input. Please follow the correct format.");
        }
        return input;
    }
//Phương thức inputStr() yêu cầu người dùng nhập bất kỳ chuỗi nào và trả về chuỗi đó.
    public static String inputStr(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }
}
