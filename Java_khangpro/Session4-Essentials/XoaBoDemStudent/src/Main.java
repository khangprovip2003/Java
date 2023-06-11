import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        inputProfile();
    }
    public static void inputProfile(){

        String name , address;
        int yob;
        float b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Input yob: ");
//        yob = sc.nextInt();

        // Xoa bo dem kieu Au Duong Phong
//        sc.nextLine();   // hốt tất cả kể cả Enter
        // dùng bộ đệm kiểu này không đẹp

        // Xoa bo dem kieu Quach Tinh
        String tmpNum = sc.nextLine();
        yob = Integer.parseInt(tmpNum);
        // nextLine() hốt sạch buffer, lấy phần còn lại Loại bỏ Enter,còn chuỗi số => số




        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();


        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }




}