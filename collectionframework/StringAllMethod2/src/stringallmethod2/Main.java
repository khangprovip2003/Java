package stringallmethod2;


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
                    join();
                        break;
                    case 2:
                        lastIndexOf();
                        break;
                    case 3:
                        length();
                        break;
                    case 4:
                        replace();
                        break;
                    case 5:
                        replaceAll();
                        break;
                    case 6:
                        split();
                        break;
                    case 7:
                        startsWith();
                        break;
                    case 8:
                        subString();
                        break;
                    case 9:
                        toCharArray();
                        break;
                    case 10:
                        toLowerCase();
                        break;
                    case 11:
                        toUpperCase();
                        break;
                    case 12:
                        trim();
                        break;
                    case 13:
                        valueOf();
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
        System.out.println("[1].join()");
        System.out.println("[2].lastIndexOf()");
        System.out.println("[3].length()");
        System.out.println("[4].replace()");
        System.out.println("[5].replaceAll()");
        System.out.println("[6].split()");
        System.out.println("[7].statsWith()");
        System.out.println("[8].substring()");
        System.out.println("[9].toCharArray()");
        System.out.println("[10].toLowerCase()");
        System.out.println("[11].toUpperCase()");
        System.out.println("[12].trim()");
        System.out.println("[13].valueOf()");
        System.out.println("[0].Exit");
    }

    public static void join() {
        //Phương thức join() trả về một chuỗi được nối với nhau bởi dấu phân tách.Trong phương thức join chuỗi,
        // dấu phân cách được sử dụng cho mỗi chuỗi được nối. Trong trượng hợp chuỗi = null, giá trị "null" được thêm vào

        String joinString1 = String.join("-", "welcome", "to", "java");
        System.out.println(joinString1);
//        Output:
//
//        welcome - to - java
    }

    public static void lastIndexOf(){
    /*
    Phương thức lastIndexOf() trả vể chỉ số cuối của ký tự hoặc chuỗi con. Nếu không tìm thấy trả về -1. Giá trị index được tính từ 0.
    int lastIndexOf(int ch)
    int lastIndexOf(int ch, int fromIndex) // đến vị trí index là dừng
    int lastIndexOf(String substring)
    int lastIndexOf(String substring, int fromIndex)
    */
        String s1 = "this is index of example";
        int index1 = s1.lastIndexOf('s');
        int index2 = s1.lastIndexOf("ex");
        int index3 = s1.lastIndexOf('s',4);
        int index4 = s1.lastIndexOf("ex",13);
        System.out.println(index1);//6
        System.out.println(index2);//17
        System.out.println(index3);//3
        System.out.println(index4);//11
    }
    public static void length(){
        String s1 = "java";
        String s2 = "python";
        System.out.println("string length is: " + s1.length());
        System.out.println("string length is: " + s2.length());
    }
    public static void replace(){
        //Phương thức replace() được sử dụng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới.
        String s1 = "viettuts is a very good website";
        String replaceString = s1.replace('t', 'j');//thay thế tất cả ký tự 't' thành 'j'
        System.out.println(replaceString);
//        Output:
//
//        viejjujs is a very good websije
        String s2 = "my name is khan my name is java";
        String replaceString2 = s2.replace("is", "was");//thay thế tất cả chuỗi "is" to "was"
        System.out.println(replaceString2);
//        Output:
//
//        my name was khan my name was java
    }

    public static void replaceAll(){
    //    Phương thức replaceAll() trả về một chuỗi thay thế tất cả các chuỗi ký tự phù hợp với regex.
    // giống replace() những có thể đổi biểu thức chính quy (regex)
        String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString = s1.replaceAll("\\s", "-"); // thay the khoang trang thanh "-"
        System.out.println(replaceString);
//        Output:
//
//        My-name-is-Khan.-My-name-is-Bob.-My-name-is-Sonoo

    }

    public static void split(){
        //Phương thức split() tách chuỗi này theo biểu thức chính quy(regular expression) và trả về mảng chuỗi.
        String s2 = "java string split method by viettuts";
        String[] words = s2.split("\\s");//tach chuoi dua tren khoang trang
        //su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String w : words) {
            System.out.println(w);
        }
//        Output:
//
//        java
//        string
//        split
//        method
//        by
//        viettuts
        String s1 = "hi hi1 hi2 hi3";
        System.out.println("returning words0:");
        for (String w : s1.split("\\s", 0)) {
            System.out.println(w);  // mảng chứa tất cả các phần tử
//            hi
//            hi1
//            hi2
//            hi3
        }
        System.out.println("returning words1:");
        for (String w : s1.split("\\s", 1)) {
            System.out.println(w);  // mảng chứa 1 phần tử duy nhất
//            hi hi1 hi2 hi3
        }
        System.out.println("returning words2:");
        for (String w : s1.split("\\s", 2)) {
            System.out.println(w);  // mảng chứa 2 phần tử duy nhất
//            hi
//            hi1 hi2 hi3
        }
    }

    public static void startsWith(){
        //Phương thức startsWith() được sử dụng để kiểm tra tiền tố của chuỗi có khớp với giá trị tiền tố đã nhập không,
        // nếu đúng trả về true, sai trả về false.
        String s1 = "java string startsWith() method sample";
        System.out.println(s1.startsWith("ja"));
        System.out.println(s1.startsWith("java string"));
        System.out.println(s1.startsWith("string"));
//        Output:
//
//        true
//        true
//        false  

    }

    public static void subString(){
// Phương thức subString() trả về chuỗi con của một chuỗi.Chúng ta truyền chỉ số bắt đầu
// và chỉ số kết thúc cho phương thức subString(), với chỉ số bắt đầu tính từ 0 và chỉ số kết thúc tính từ 1.
        String s1 = "hellojava";
        System.out.println(s1.substring(3, 7));// "loja"
        System.out.println(s1.substring(3));// "lojava"
//        Output:
//
//        loja
//        lojava


    }

    public static void toCharArray(){
        //Phương thức toCharArray() được sử dụng để chuyển đổi chuỗi thành các mảng ký tự.
        // Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
        String s1 = "hello";
        char[] ch = s1.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
//        Output:
//
//        h
//        e
//        l
//        l
//        o
    }
    public static void toLowerCase(){
     //Phương thức toLowerCase() được sử dụng để chuyển chuỗi về dạng chữ thường.
        String s1 = "HELLO stRIng";
        String s1lower = s1.toLowerCase();
        System.out.println(s1lower);
        //Output:
        //
        //hello string

    }

    public static void toUpperCase(){
        //Phương thức toUpperCase() được sử dụng để chuyển chuỗi về dạng chữ hoa.
        String s1 = "HELLO stRIng";
        String s1Upper = s1.toUpperCase();
        System.out.println(s1Upper);
        //Output:
        //
        //HELLO STRING
    }
    public static void trim(){
    //Phương thức trim() được sử dụng để xóa khoảng trẳng ở đầu và cuối chuỗi/Giá trị unicode của khoảng trắng là '\u0020'
    // Phương thức trim() kiểm tra giá trị unicode trước và sau chuỗi, nếu tồn tại thì xóa bỏ khoảng trắng đi và trả về
    // chuỗi không có khoảng trắng ở đầu và cuối.
        String s1 = "  hello string hello   ";
        System.out.println(s1 + "java");
        System.out.println(s1.trim() + "java");
//        Output:
//
//    hello string hello   java
//hello string hellojava
    }

    public static void valueOf(){
        //Phương thức valueOf() được sử dụng để chuyển đối kiểu dữ liệu khác thành chuỗi. Bằng việc sử dụng phương thức valueOf(),
        // bạn có thể chuyển int thành chuỗi, long thành chuỗi, boolean thành chuỗi, float thành chuỗi, double thành chuỗi,
        // char thành chuỗi, mảng char thành chuỗi, đối tượng thành chuỗi.
        int value = 30;
        String s1 = String.valueOf(value);
        System.out.println(s1 + 10);
        //Output:
        //
        //3010

    }



}