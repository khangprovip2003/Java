package pkgchar;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 14;
        printMenuMain();

        while (c != 0) {
            System.out.print("Option : ");

            try {
                c = Integer.parseInt(sc.nextLine());
                switch (c) {
                    case 0:
                        System.out.println("BYE BYE 😍");
                        break;
                    case 1:

                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:

                        break;
                    case 7:

                        break;
                    case 8:

                        break;
                    case 9:

                        break;
                    case 10:

                        break;
                    case 11:

                        break;
                    case 12:

                        break;
                    case 13:

                        break;
                    case 14:

                        break;
                    default:
                        System.out.println("Please choose true option!!!");
                }
            } catch (Exception var4) {
                System.out.println("Do you know how to input a positive number?");
            }
        }

    }

    public static void printMenuMain() {
        System.out.println("[1].isLetter(char ch)");
        System.out.println("[2].isDigit(char ch)");
        System.out.println("[3].isWhitespace(char ch)");
        System.out.println("[4].toUpperCase(char ch)");
        System.out.println("[5].toLowerCase(char ch)");
        System.out.println("[6].toString(char ch)");
        System.out.println("[7].compareTo(char ch1, char ch2)");
        System.out.println("[8].valueOf(char ch)");
        System.out.println("[0].Exit");
    }

    public static void isLetter() {
        //isLetter(char ch): Kiểm tra xem ký tự được chỉ định có phải là một chữ cái hay không.
        char ch = 'A';
        if (Character.isLetter(ch)) {
            System.out.println(ch + " là một chữ cái.");
        } else {
            System.out.println(ch + " không phải là một chữ cái.");
        }
        //A là một chữ cái.
    }

    public static void isDigit() {
//isDigit(char ch): Kiểm tra xem ký tự được chỉ định có phải là một chữ số hay không.
        char ch = '5';
        if (Character.isDigit(ch)) {
            System.out.println(ch + " là một chữ số.");
        } else {
            System.out.println(ch + " không phải là một chữ số.");
            //5 là một chữ số.
        }
    }

    public static void iswhitespace() {
        //isWhitespace(char ch): Kiểm tra xem ký tự được chỉ định có phải là một ký tự trống (khoảng trắng) hay không.
        char ch = ' ';
        if (Character.isWhitespace(ch)) {
            System.out.println(ch + " là một ký tự trắng.");
        } else {
            System.out.println(ch + " không phải là một ký tự trắng.");
        }
//  là một ký tự trắng.
    }

    public static void toUpperCase() {
        char ch = 'a';
        char upperCh = Character.toUpperCase(ch);
        System.out.println("Ký tự " + ch + " được viết hoa là " + upperCh);
//Ký tự a được viết hoa là A
    }

    public static void toLowerCase() {
        char ch = 'A';
        char upperCh = Character.toUpperCase(ch);
        System.out.println("Ký tự " + ch + " được viết thuong là " + upperCh);
// Ký tự "A" được viết thuong là a
    }

    public static void toStringg() {
//toString(char ch): Chuyển đổi ký tự được chỉ định thành chuỗi ký tự.
        char ch = 'd';
        String chStr = Character.toString(ch);
        System.out.println("Ký tự " + ch + " được chuyển thành chuỗi là " + chStr);
//Ký tự d được chuyển thành chuỗi là d

    }

    public static void compareTo() {
//So sánh hai ký tự được chỉ định và trả về một số nguyên đại diện cho sự khác biệt giữa chúng.
        char ch1 = 'A';
        char ch2 = 'B';
        int result = Character.compare(ch1, ch2);
        if (result < 0) {
            System.out.println(ch1 + " đứng trước " + ch2 + " trong bảng chữ cái.");
        } else if (result == 0) {
            System.out.println(ch1 + " và " + ch2 + " giống nhau.");
        } else {
            System.out.println(ch1 + " đứng sau " + ch2 + " trong bảng chữ cái.");
        }
//A đứng trước B trong bảng chữ cái.
    }

    public static void valueOf() {
//: Chuyển đổi ký tự được chỉ định thành đối tượng Character tương ứng.
        char ch = 'Z';
        Character chObj = Character.valueOf(ch);
        System.out.println("Đối tượng Character tương ứng với ký tự " + ch + " là " + chObj);
//Đối tượng Character tương ứng với ký tự Z là Z

    }

}
