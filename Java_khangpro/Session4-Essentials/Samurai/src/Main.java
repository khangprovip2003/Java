import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inputProfile
        inputProfileXinSo();
    }

    public static void inputProfileXinSo() {

        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();


        while (true) { // vòng lặp vô tận     // bên C là while(1)
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
            break; // nhập đúng thì gặp break
                   // nhập sai thì xuống gặp câu chửi, chửi xong lại quay lại vòng lặp để nhập lại
            } catch (Exception e) {

                 // xử lý sao ?? nhiều cách: default value ( không hay)
                //                      hay: bắt nhập lại , member: login/user name

                System.out.println("Do Ku known to input a positive number?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();


        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

    public static void inputProfile(){

        String name , address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        // mặc định JVM sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lý data
        // đưa cho ta 1 cơ chế tự xử khi có cà chớn , chuyển quyền giết chóc cho mình .
        // báo JMV biết đừng giết, tạo tự xử , nhốt lệnh cà chớn lại , SANDBOX

        try {
            // lệnh cà chớn nằm đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            // alt - shift -f  căn cột trong windown
        } catch (Exception e){
            // CPU sẽ chạy đến chỗ này khi có cà chớn xảy ra
            // JVM không giết app như truyền thống
            // chỗ này là chỗ xử lý hậu quả cà chớn
            // không có cà chớn thì không vào đây
            // e chính là là thứ/msg màu đỏ JVM gửi cho mình bào rằng có lỗi cà chớn
            // Exception e = new Exception( nội dung lỗi màu đỏ đây nè...);
            // về lí : e.xem lỗi, xử lí tự mình
            // về toán hoá,mình chỉ tập trung xử lý lỗi, biết thừa  không gõ đúng số mình cần
            // xử lý sao ?? nhiều cách: default value ( không hay)
            //                      hay: bắt nhập lại , member: login/user name
            yob = 69 ;
        }


        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();


        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

}