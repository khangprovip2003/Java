package stringallmethod1;


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
                        charAt();
                        break;
                    case 2:
                        compareTo();
                        break;
                    case 3:
                        conCat();
                        break;
                    case 4:
                        contains();
                        break;
                    case 5:
                        endsWiths();
                        break;
                    case 6:
                        equals();
                        break;
                    case 7:
                        equalsIgnoreCase();
                        break;
                    case 8:
                        format();
                        break;
                    case 9:
                        getBytes();
                        break;
                    case 10:
                        getChars();
                        break;
                    case 11:
                        indexOf();
                        break;
                    case 12:
                        intern();
                        break;
                    case 13:
                        isEmpty();
                        break;
                    case 14:
                        matches();
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
        System.out.println("[1].charAt()");
        System.out.println("[2].compareTo()");
        System.out.println("[3].concat()");
        System.out.println("[4].contains()");
        System.out.println("[5].endsWiths()");
        System.out.println("[6].equals()");
        System.out.println("[7].equalsIgnoreCase()");
        System.out.println("[8].getBytes()");
        System.out.println("[9].formart()");
        System.out.println("[10].getchars()");
        System.out.println("[11].indexOf()");
        System.out.println("[12].intern()");
        System.out.println("[13].isEmpty()");
        System.out.println("[14].matches()");
        System.out.println("[0].Exit");
    }

    public static void charAt() {
        // Trả về giá trị char của chuỗi tại vị trí có chỉ số index được chỉ định bắt đầu từ 0
        String a = "Khanh";
        char ch = a.charAt(2);
        System.out.println(ch);
        // output: a
    }

    public static void compareTo() {
        // so sánh các chuỗi cho trước với chuỗi hiện tại theo thứ tự từ điển . Nó trả về số dương, số âm , số 0
        // Nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai, nó sẽ trả về số dương (chênh lệch giá trị ký tự).
        // Nếu chuỗi đầu tiên nhỏ hơn chuỗi thứ hai, nó sẽ trả về số âm
        // nếu chuỗi đầu tiên là bằng chuỗi thứ hai, nó trả về 0.
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        // OutPut: 0 -5  1
    }

    public static void conCat() {
        //Phương thức concat() nối thêm chuỗi được chỉ định vào cuối chuỗi đã cho
        String s1 = "java string";
        s1.concat("is immutable");
        System.out.println(s1);
        s1 = s1.concat(" is immutable so assign it explicitly");
        System.out.println(s1);
//        Output:
//        java string
//        java string is immutable so assign it explicitly
    }

    /*
    Immutable String in Java
    Trong Java đối tượng String là bất biến (immutable) bất biến có nghĩa là không thể thay đổi
    Ví dụ: String S = "Hello"
          s.concat("Java");
          System.out.println(s);
          Output: Hello
    Những ta gán S vào biến tham chiếu, S tham chiếu chuỗi mới.
    Ví dụ: String s = "Hello";
           s = s.concat("Java");
           System.out.println(s);
           output: Hello Java
           */
    public static void contains() {
        //Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này. Nó trả về true nếu chuỗi các giá trị char được
        //tìm thấy trong chuỗi này, nếu không trả về false.
        String name = "what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));
        System.out.println();
    }

    public static void endsWiths() {
        //Phương thức endsWith() kiểm tra nếu chuỗi này kết thúc với hậu tố nhất định
        //  Nó trả về true nếu chuỗi này kết thúc với hậu tố đã cho, nếu khác thì trả về false.
        String s1 = "hello java";
        System.out.println(s1.endsWith("t"));
        System.out.println(s1.endsWith("java"));
//         Output:
//         false
//         true
    }

    public static void equals() {
        //Phương thức equals() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi.
        // Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
        //Phương thức equals() của lớp String được ghi đè từ phương thức equals() của lớp Object.
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "python";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
//        Output:
//        true
//        false
//        false
    }

    public static void equalsIgnoreCase() {
        //Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.
        // Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true.
        String s1 = "java";
        String s2 = "java";
        String s3 = "JAVA";
        String s4 = "python";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));
//        Output:
//        true
//        true
//        false
    }

    public static void format() {
        String name = "sonoo";
        String sf1 = String.format("name is %s", name);
        String sf2 = String.format("value is %f", 32.33434);
        String sf3 = String.format("value is %32.12f", 32.33434);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
//        Output:
//        name is sonoo
//        value is 32.334340
//        value is                  32.334340000000
    }

    public static void getBytes() {
        // Phương thức getBytes() trả về mảng byte của chuỗi.
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.println(barr[i]);
//            Output:
//
//            65
//            66
//            67
//            68
//            69
//            70
//            71
        }

    }

    public static void getChars() {
    /*
       Phương thức getChars() sao chép nội dung của chuỗi thành mảng Char cụ thể.Có 4 đối số truyền vào phương thức getChars().
       public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)
       - src BeginIndex: vị trí bắt đầu của khoảng cần sao chép chuỗi hiện tại
       - src EndeIndex: vị trí kết thúc của khoảng cần sao chép chuỗi hiện tại
       - destination:Mảng ký tự đến để lữu trữ khoảng sao chép
       - dst beginIndex: vị trí bắt đầu trong mảng ký tự đến để lữu trữ khoảng sao chép
     */
        String str = "Hello,  World";
        // sao chép khoảng từ vị trí 7 -> 12 vào mảng ký tự dest tại vị trí 0
        char[] dest = new char[6];
        str.getChars(7, 13, dest, 0);
        System.out.println(dest);
    }

    public static void indexOf() {
    /*
    Phương thức indexOf() trả về chỉ số của giá trị ký tự đã cho hoặc chuỗi con.
    Nếu không tìm thấy trả lại giá trị -1. Chỉ số (index) được đếm từ 0.
        - int indexOf(int ch) //Trả về vị trị của giá trị Char đã cho.
        - int indexOf(int ch, int fromIndex) //Trả về vị trị của giá trị Char đã cho tính từ vị trí fromIndex.
        - int indexOf(String substring) //Trả về vị trị của chuỗi con.
        - int indexOf(String substring, int fromIndex) //Trả về vị trị của chuỗi con đã cho tính từ vị trí fromIndex.
    */
        String s1 = "this is index of example";
        System.out.println("Truyền vào chuỗi con");
        int index1 = s1.indexOf("is");
        int index2 = s1.indexOf("index");
        System.out.println(index1 + "  " + index2);//2 8
        System.out.println("Truyền vào chuỗi con và chỉ số bắt đầu");
        int index3 = s1.indexOf("is", 4);
        System.out.println(index3);//5
        System.out.println("Truyền vào giá trị Char");
        int index4 = s1.indexOf('s');
        System.out.println(index4);//3
        System.out.println("Truyền vào giá trị Char và chỉ số Index");
        int index5 = s1.indexOf('i', 7);
        System.out.println(index5);//8
    }

    public static void intern() {
        //Phương thức intern() có thể được sử dụng để trả về chuỗi từ Pool chứa hằng số chuỗi khi nó được tạo bởi từ khóa new.
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//trả về chuỗi từ Pool
        System.out.println(s1 == s2);//false vì reference là khác nhau
        System.out.println(s2 == s3);//true vì reference là giống nhau
    }

    public static void isEmpty() {
        //Phương thức isEmpty() khi chuỗi trống trả về true, ngược lại trả về false
        String s1 = "";
        String s2 = "hello java";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    public static void matches(){
        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter String S1:");
        s1 = sc.nextLine();
        if (s1.matches("[0-9]+")) {
            System.out.println("Chuỗi này in ra toàn số.");
        } else if (s1.matches("[a-zA-Z]+")) {
            System.out.println("Chuỗi này in ra toàn chữ.");
        } else {
            System.out.println("Chuỗi này không in ra toàn số hoặc toàn chữ.");
        }
    /*
    \\d  -> viết tắt cho [0-9]: đại diện cho một chữ số.
    \\w  -> viết tắt cho [a-zA-Z0-9_]: đại diện cho một ký tự chữ, số hoặc dấu gạch dưới.
    \\s ->  viết tắt cho khoảng trắng: đại diện cho một khoảng trắng, tab hoặc dòng mới.
    \\d+ ->  một hoặc nhiều chữ số (tức là một chuỗi gồm ít nhất một chữ số)
    \\w+ -> [a-zA-Z]+   : đại diện cho một chuỗi ký tự toàn số
    Để đại diện cho một ký tự bất kỳ nhưng không phải số, dấu cách, hoặc gạch dưới, bạn có thể sử dụng biểu thức chính quy \\D.

    tìm tất cả các chuỗi bao gồm các ký tự bất kỳ ngoại trừ số, dấu cách và gạch dưới, bạn có thể sử dụng
    \\D+ để đại diện cho các chuỗi như "Hello", "world!", "@#$%", v.v.

     */

    }

}



