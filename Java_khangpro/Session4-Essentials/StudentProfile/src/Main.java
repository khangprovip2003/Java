import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        inputProfile();
    }
    // nhập thông tin cơ bản của sinh viên và in ra
    public static void inputProfile(){
        // không OOP, chỉ cần hiểu về việc nhập thông tin (info) trước, không chơi class Student
        String name , address;
        int yob;
        Scanner sc = new Scanner(System.in);
        //TH1
                      System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase(); // đây không phải chấm qua static mà là chấm qua new
        System.out.print("Input yob: ");
        yob = sc.nextInt();                // convert data từ bàn phím - chuỗi thành số
        System.out.print("Input address: "); // nhập dữ liệu số trước chữ sẽ xảy ra lệnh lạc trôi(ko cho nhập address)
        address = sc.nextLine().toUpperCase();
        // lạc trôi address
        //                 nếu nhập: Input name: HoangNT
        //                 Input yob: 2001 Man Thien

        //                 Output: Name: HOANGNT
        //                         Yob: 2001
        //                         address:  MAN THIEN   ( hiện tượng này là bộ đệm bàn phím bị rác để lại)
                    ///////////////////////////////////////////////////////////
         //                  nếu nhập: Input name: HoangNT
        //                   Input yob: 2001ManThien
        //                   Output : báo lỗi ( app sẽ bị giết liền) hiện tượng này là đưa data cà chớn quá


        // TH2
//        System.out.print("Input yob: ");
//        yob = sc.nextInt();
//        System.out.print("Input name: ");
//        name = sc.nextLine().toUpperCase();
//        System.out.print("Input address: ");
//        address = sc.nextLine().toUpperCase();
        // lúc nãy nhập name sẽ bị trôi

        // TH3
        // nếu đổi lại nhập address trước yob thì sẽ không bị trôi lệnh
//        System.out.print("Input name: ");
//        name = sc.nextLine().toUpperCase();
//        System.out.print("Input address: ");
//        address = sc.nextLine().toUpperCase();
//        System.out.print("Input yob: ");
//        yob = sc.nextInt();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }




}