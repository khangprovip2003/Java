package wrapperclass;

public class WrapperClass {
    public static void main(String[] args) {
       //playWithIntegers();
       //  playWithIntegerPointers();
        playWithPool();  //VI DiỆU
    }


    public static void playWithPool(){
        Integer num1 = 2001;
        Integer num2 = 2001;
        //num1 có  bằng num2 ko ? | kooooo ( 2 toạ độ new khác nhau)
        //lõi num1 có bằng num2 ko? | cóoooo

        //VI DIỆU
        Integer num3 = -100;  // trỏ cùng -129
        Integer num4 = -100;  // trỏ cùng , không tạo new mới
        //Integer pool hồ bơi cho vùng new lõi có giá trị nằm trong đoạn
        // [-128 -> 127 ]
        System.out.println("XEM VI DIỆU !!!");
        System.out.println("num3 vs num4: " + (num3 == num4));
        // vẫn so con trỏ heng, ko so sánh lõi vì biết lõi bằng nhau rồi

        //RIÊNG CHO boxing từ -128 -> +127 thì
        //gói những thằng primitive /  trong đoạn này thì chúng
        // chỉ xài 1 vùng new Chung nếu chung lõi

        Integer num5 = new Integer(-127); // KHÔNG TẮM CHUNG
        // VÌ XÀI NEW RÕ RÀNG TƯỜNG MINH
        System.out.println("num3 vs num5: " + (num3 == num5)); //false

        //NẾU TA SO SÁNH 2 BIẾN WRAPPER, INTEGER a integer b
        //a == b lúc đúng lúc sai do có xài POOL hay không
        //SO SÁNH 2 BIẾN OBJECT LÀ ĐIỀU KO NÊN, KO ĐC LÀM VÌ NÓ KO MANG Ý NGHĨA NÀO CHÍNH XÁC
        //MÌNH SO SÁNH , GỌI HÀM TRONG OBJECT
        //POOL CHỈ XẢY RA CHO WRAPPER, STRING
        //CHỈ XẢY RA HẠN CHẾ 1 SỐ TÍNH HUỐNG
        //NEW NGẦM MAY RA XẢY RA POOL KHI GÁN PRIMITIVE -> OBJECT
        //                                              BOXING TRỰC TIẾP
        //SO SÁNH 2 OBJECT CHÍNH LÀ SO SÁNH CÁC VALUE BÊN TRONG.
        //DATA Ở ĐÂU HÀM Ở ĐÓ , DO ĐÓ MỖI OBJECT SẼ NÊN CÓ HÀM SO SÁNH
        //VỚI KẺ KHÁC TRÊN 2 CÂU HỎI : EQUALS(),  COMPARETO()
        Double pi = 3.14; //boxing


    }



    public static void playWithIntegerPointers(){
        Integer num1 = new Integer("2003");
        Integer num2 = new Integer(2003);
        Integer num3 = 2003;
        Integer num4 = 2003;
        Integer num5 = 2004;
        //3 lệnh này tương đương value lõi
        //Hỏi : num1 có bằng num2 hay ko,hỏi num3 cx đc??
        boolean result = num1 == num2; // kết quả phép so sánh là true/false
        System.out.println("num1 == num2?| " + result);
        //if (num1 == num2)
        //num2 vs .num3 thì sao?
        boolean result2 = num2 == num3;
        System.out.println("num2 == num3?| " + result);
        // false vì đi so sánh toạ độ 2 vùng new
        boolean result3 = num3 == num4;
        System.out.println("num3 == num4?| " + result3);

        // KẾT LUẬN : KHÔNG SO SÁNH 2 BIẾN OBJECT DÙNG TOÁN TỬ TRUYỀN THỐNG > >= < <= == !=
        // VÌ CÁC BIẾN OBJECT BẢN THÂN NÓ CHỈ LÀ TOẠ ĐỘ THAM CHIẾU 1 VÙNG NEW CÓ NHIỀU
        //MUỐN SO SÁNH 2 BIẾN OBJECT DÙNG TOÁN TỬ TRÊN TƯƠNG ĐƯƠNG ĐI SO SÁNH 2 ĐỊA CHỈ \
        //VỚ VẨN, AI ĐI SO SÁNH SỐ NHÀ LÀM GÌ
        // VÀO NHÀ XEM INFO MÀ SÓ SÁNH
        //VÀO VÙNG NEW INTERGER(...) LẤY VALUE LÕI RA MÀ SO
        //VÀO VÙNG NEW INTEGER() LÀM GÌ ĐÓ, SO SÁNH VALUE HẢ
        //MUỐN SO SÁNH 2 OBJECT/BIẾN OBJECT TA SẼ CHẤM ....
        //                                              GỌI HÀM SO SÁNH VALUE BÊN TRONG

        //Integer phải có hàm so sánh các lõi với nhau
        // hàm nằm trong Integer thì lấy value lõi
        //GL Rules: ai có nhiều info,gã đó có hàm xử lý
        // equals : có bằng không ( boolean) -> trả về true | false
        //compareTo : so sánh với (int) ->   "< (-1), == (0) , >(1)"
        System.out.println("num3 vs. num4 (core value): " + num3.equals(num4));
        System.out.println("num3 vs. num4 (core value): " +num3.compareTo(num4));
        System.out.println("num3 vs. num4 (core value): " +num3.compareTo(num5));
        System.out.println("num3 vs. num4 (core value): " +num5.compareTo(num3));

    }

    public static void playWithIntegers(){
        int     num0 = 2003; // tốn 1 vùng RAM 4byte đặt tên là num0, ONOFF 2003
        Integer num1 = new Integer("2004"); //2 vùng ram,con trỏ, và new...
                                               // lõi vùng new có int value = 2003
        Integer num2 = new Integer(2005);
        Integer num3 = 2006; // cách viết tiện nhất, gọn nhất, tự nhiên nhất
                             // thực tế vẫn new Intefer(2003)

        // cách ta lấy con số literal ( số xh trong code ) chính là primitive
        //gói lại thành 1 vùng new mà nhân chính là primitive
        // cách này gọi là ĐÓNG GÓI/ ĐÓNG HỘP PRIMITIVE - BOXING A PRIMITIVE VALUE
        //BOXING: PRIMITIVE -> WRAPPER OBJECT, THỨ ĐƯỢC ĐÓNG GÓI

        //sử dụng như bình thường
        System.out.println("num0: " + num0); //xài trực tiếp vùng ram
        System.out.println("num1: " + num1); //gọi thầm tên em
        System.out.println("num2: " + num2.toString()); // mở hộp lấy value int
        System.out.println("num3: " + num3.intValue()); // ra xài, UNBOXING

        int num4 = num1;    // HIỆN TƯỢNG MỞ HỘP, KO PHẢI ÉP KIỂU
                            // UNBOXING: TỪ OBJECT -> PRIMITIVE
                            // MỞ VÙNG NEW LẤY VALUE/NHÂN/LÕI GỐC PRIMITIVE
        System.out.println("num4: " + num4);

        Integer num5 = num0; //boxing, new ngầm Integer(2003)
        System.out.println("num: " + num5);

        // HỎI THẦY
        //int num0 đang = 2003
        num0 = 20210726;
        // gán giá trị mới cho biến primitive, đè vào là xong, 1 vùng ram mà
        System.out.println("num0 again: " + num0);
        // num5 là biến con trỏ , trỏ vùng new Integer(2003)
        num5 = 20210711; // trong ram điều gì diễn ra?
        // biến Integer mỗi lần = value mới primitive => new Integer(value mới );

        //VÙNG INTEGER ĐC  NEW KO CÓ HÀM SET() CHỈ CÓ HÀM GET()
        // MUỐN THAY ĐỔI NHÂN/LÕI, GÓI BÁNH MỚI ĐI, NEW MỚI ĐI
        //INTEGER LÀ OBJECT -> READ-ONLY ( Không sửa)
        //CLASS KO CÓ HÀM SỬA, CHỈ NEW XONG XÀI VALUE MÃI MÃI, ĐỔ 1 LẦN KO SỬA
        //READ-ONLY OBJECT, ĐỌC ĐÚNG CHUẨN: IMMUTABLE CLASS/OBJECT
    }
    // CÓ 8 CLASS TRAI BAO, WRAPPER CLASS (IMMUTABLE CLASS)
    // Byte, Short, Integer, Long, Float, Double, Boolean, Character
    // BYTE  short  integer  long  float  double  boolean  char
    // xài new cx được, gán trực tiếp oke ( new ngầm)




}
