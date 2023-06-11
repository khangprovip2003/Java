package ParentChild;
import data.*;
public class Main {
    public static void main(String[] args) {
        playWithParentNChild();
    }
    public static void playWithParentNChild(){
        Parent p = new Parent ("BIỆT THỰ","100BTC");
        p.showProfile();
        //Khai Cha new Cha , chấm xổ ra tất cả cái gì của Cha

        //Khai Con new Con , chấm xổ ra tất cả những gì Cha cho
                            // và của riêng Con ( @ + biến dị)

        //Khai cha new con , Đọc theo kiểu Kế Thừa, dùng theo danh nghĩa Cha
                           //Không phải mình
        Parent c2 = new Child("CĂN HỘ CAO CẤP","DOGECOIN");
        c2.showProfile(); // không chấm được sayHi()
                          // chỉ ra những gì của Cha, không xổ của Riêng Con
                          // Riêng Con có 2 thứ @Override và khác biệt hoàn toàn
                          // Nếu Con có trùng tên Hàm, vẫn gọi Cha những chạy Con
        // đang dùng danh nghĩa Cha,thì cư xử như Cha,Cha éo có sayHi()
        //lấy gì mà xổ ,trong RAM vẫn có sayHi(), vì new Child() có sayHi()
        //clone Khuôn như nhau,quan trọng con trỏ

        //List<Student>list = new ArrayList();
        //     Cha                  Con

        // KỸ THUẬT CHẠM VÀO THỨ RIÊNG TƯ CỦA CON
        //Ba không biết trong sài gòn con làm gì, Vậy làm sao để Ba biết?????
        //Dùng kỹ thuật DIRFT con trỏ


        Child c1 = new Child("NHÀ PHỐ","100BTC");
        c1.showProfile(); // nếu không làm đồ riêng , đó là lúc xài lại của Ba
        // phải làm theo quy tắc của Cha
        // nếu muốn qua mặt , hãy tự làm đi, @Override
        c1.sayHi();


    }

}