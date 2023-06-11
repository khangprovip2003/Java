package studentmanagement;
import data.Student; // mượn đồ để dùng, tìm nơi cất
                     // tương đương câu lệnh #include "stdio.h"
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        saveAstudentS();
        //saveAstudent();
        //inputAstudent();

    }

    // nhập từ bàn phím , cần Scanner object bàn phím . OPP cái gì cx object,class
    // từ bàn phím đi vào ram, do đó phải có biến hứng value
    public static void inputAstudent(){
        String id,name;               // nằm trong vùng nhớ stack
        int yob;
        double gba;
        Scanner scanner = new Scanner(System.in);         // Scanner scanner nằm trong vùng nhớ stack
        // Lưu ý nhập chuỗi trước số để không bị trôi lệnh
        System.out.print("Input id: ");
            id = scanner.nextLine();
        System.out.print("Input name: ");
            name = scanner.nextLine();
        System.out.print("Input yob: ");
            yob = scanner.nextInt();
        System.out.print("Input gba: ");
            gba = scanner.nextDouble();

        Student x = new Student (id,name,yob,gba);    // x nhập tên bất kỳ
       x.showProfile();
    }

    // hard code ( không nhập)
    public static void saveAstudent(){
        Student khang = new Student("He176045","KHANG NGUYEN",2021,8.9);
        khang.showProfile();
    }

    public static void saveAstudentS(){
        Student khang = new Student("He176045","KHANG NGUYEN",2005,8.9);
        //new Student("He176045","KHANG NGUYEN",2005,8.9); gọi chuẩn là object variable
        Student binh = new Student("He176044","BINH LE",2004,0.9);
        // Trong Ram có 2 vùng clone do 2 vùng lệnh new ( có new là có vùng nhớ mới được cấp )
        khang.showProfile();
        binh.showProfile();

        //chấm xổ gì,Access Modifier(quyền truy xuất để chỉnh sửa)/Access Specifier(chỉ định rõ truy xuất theo cách nào)

        // ví dụ
        // khang.name;
        // muốn gọi thì đổi primate thành public
        // gọi ra những không làm gì nên lỗi giống như trong c
        // int a=10;
        // a;             // lỗi

        // khang.getYob();          // gọi hàm đã có xử lý nên không lỗi
        System.out.println("Khang name(directly): " + khang.name);
        System.out.println("Khang name(directly): " + khang.getId()); // nếu dùng public thì khỏi cần getName

        // vì sờ được trực tiếp name/biến/ gọi chuẩn là instance variable, ta có thể get() và set()
        khang.name ="KHÔNG HỌC BÀI";
        // lúc này dung Student.name thay hợp lý hơn

        System.out.println("Khang name again (directly): " + khang.name);
        System.out.println("Binh name(directly): " + binh.name); // thằng nào năm trong primate thì không gọi được
        khang.showProfile();  // thay đổi khang.name

        System.out.println("\nSau khi dùng static cho id và name: \n");

        Student cuong = new Student ("SE666666","CUONG VO",1996,6.6);

        khang.showProfile();
        cuong.showProfile();
        // trường hợp này sau khi dùng static của id và name
        // thì nó sẽ in ra tên và id thằng cường và yob và gba của thằng an
        //           |SE666666|CUONG VO                 |2005| 8,9|
        //  Vì vậy dùng static ở trong instance variable rất nguy hiểm
        ////////////////////////////////////////////////////////////////

        // QUY LUẬT STATIC ( static cho primate id và public name)
        // nếu đảo:

//         Student cuong = new Student ("SE666666","CUONG VO",1996,6.6);
//         Student binh = new Student("He176044","BINH LE",2004,0.9);
//         Student khang = new Student("He176045","KHANG NGUYEN",2005,8.9);
//         khang.name ="KHÔNG HỌC BÀI";
//         cuong.showProfile();

        // OUTPUT :   |SE666666|KHÔNG HỌC BÀI                 |1996| 6.6|

        // QUY LUẬT STATIC NHƯ SAU:
        // STATIC primate thì không đổi
        // STATIC public thì ăn theo thằng obs cuối cùng
        // Không dùng static cho đặc điểm hay hàm mà của riêng từng object
        // tui có mã số,bạn có mã số,bạn kia có mã số , những đều là riêng của mỗi đứa
        // chung đặc điểm nhưng khác value,vậy phải có biến riêng-NON-STATIC

        // saỵHi() mà sayHi() đang static
        System.out.println("Using static");
       // khang.sayHi(); // không thể gọi theo kiểu riêng mình cho static
       //  binh.sayHi();

        // sayHi() dùng cho toàn bộ object
        Student.sayHi();   // tên class chấm static vì đồ chung multiple objects
                           // chỉ dùng tên class để gọi
        System.out.println("Student name (directly): " + Student.name);

        // có 2 loại dấu chấm
        // chấm trực tiếp tên class tức là chạm sờ static
        // chấm qua con đường new tức là bạn đàng hàm ý chơi với non-static
        //                                                     vì nó là đồ riêng từng object


    }


}

