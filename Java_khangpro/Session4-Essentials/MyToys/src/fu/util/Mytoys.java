package fu.util;
import java.util.Scanner;
// đây là class,khuôn,chứa,có đặc điểm /hành động/chứa các món đồ chơi dùng chung
// cho mọi nơi- vì nó không nhớ cái gì cho riêng tư của nó
// LIBRARY/FARMEWORK - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
// của các dự án khác nhau
    public class Mytoys {
    // đặc điểm và hành vi là static,cho người ta sờ thì thêm public
    // không nhớ cái gì của riêng mình
    //Mọt class bt thì vẫn có thể vừa static vừa non-static,tuỳ nhu cầu , cách thức
    // Math: hầu hết static
    //String: vừa non-static,vừa có static
    //System: hầu hết static
    //public static  double PI =3.1415;

    public static final double PI =3.1415;
    public static final double MAX_ELEMENTS = 500; // mảng có 500 phần tử( sài không hết thì hao RAM)
    // final ~ const bên C , biến không thay đổi value, trừ lần đầu tiên khai báo ( HẰNG SỐ)


    // DI : Dependency Injection

    // đẩy Scanner ra ngoài xài chung cho các hàm của chúng ta
    private static  Scanner sc = new Scanner (System.in);
    // private dùng nội bộ bên trong




    // Double.parseDouble()
                                        //  tb nhập,errorMsg,lower,upper
    public static int getAChoice(String inputMsg){   // tránh overloading
        int n;  // hứng từ bàn phím gõ


        do {
            try {
                System.out.println(inputMsg);
                //n = sc.nextInt(); viết kiểu này không sai nhưng trôi lệnh để lại rác
                n = Integer.parseInt(sc.nextLine());
                return n;    // trả về và dừng luôn ( vì hàm này bắt buộc return)
                // if để chửi ngoài biên 1....6
            }catch (Exception e){
                System.out.println("Do ku known how to input an interger(1->7)");
            }

        }while (true);

    }



    // trong quá trình làm app, việc nhập số là gặp lại nhiều lần
    // ví dụ : nhập 3 cạnh của 1 tam giác , nhập sự lựa chọn menu,điểm thi các môn
    // mỗi biến nhập, kèm theo:trôi lệnh,cà chớn-try-catch -do-while
    // tách việc nhập số nguyên thành 1 hàm,gói chửi bới,trôi lệnh,nhập lại thành 1 hàm
    // ta hứng kết quả trả về từ hàm,lấy để dùng ,MyToys nhớ con số này làm gì
    //Math.sqr(4) -> mình dùng,Math không cần nhớ, không cần non-static
    //new mà trả về kết quả cho ngừi ta dùng,không cần nhớ,dùng nhiều ram làm gì => STATIC là thượng sách

    public static int getAnInteger(){
        int n;  // hứng từ bàn phím gõ
        Scanner sc = new Scanner (System.in);

        do {
            try {
                System.out.println("Input an interger: ");
                //n = sc.nextInt(); viết kiểu này không sai nhưng trôi lệnh để lại rác
                n = Integer.parseInt(sc.nextLine());
                return n;    // trả về và dừng luôn ( vì hàm này bắt buộc return)
                // if để chửi ngoài biên 1....6
            }catch (Exception e){
                System.out.println("Do ku known how to input an interger?");
            }

        }while (true);

    }

}
