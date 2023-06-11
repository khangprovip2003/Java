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
        Parent c2 = new Child("CĂN HỘ CAO CẤP","DOGECOIN","DU THUYỀN");
        System.out.println(c2);
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

        //kéo giãn cái con trỏ Cha -> xuống đến đáy new Child()
        // cần con trỏ tạm để lấy được đáy new Child
        //cách1:
//        Child x = (Child)c2;  // cần trỏ vùng new Child()
//        //c2 vẫn là Parent, tương đương nhả sợi dây thun
//        //Ép Chó thành Mèo, kỹ thuật ép kiểu
//        x.sayHi();

        //Cách 2 ;lầy lội hơn, Xuất phát từ cách 1 không cần thêm con trỏ tạm
       // (Child)c2.  //Do dấu chấm quá mạnh , Chấm sát ai thì cư xủ theo TYPE đó
        //Ép xong rồi mới chấm, Thay đổi độ ưu tiên
        ((Child)c2).sayHi(); // 7 bài thí nhiệm con trỏ new Dog().bark()
    }

}
/*
 * TỔNG KẾT KẾ THỪA LEVEL 1: CHA CỤ THỂ,CON CỤ THỂ (CONCRETE)
 -CHA CÓ ĐẦY ĐỦ CODE
 -CON CÓ ĐẦY ĐỦ CODE
                     THÊM THỬ MÀ CHA KHÔNG CÓ CO. (ĐĐ,HIV)@OVERRIDE

 * CÂU HỎI : 1 CHA CÓ THỂ CÓ NHIỀU CON KO?
TGV             EM ÉO DÙNG KẾ THỪA,EM DÙNG IF ĐƯỢC KHÔNG?
                                                        ( nói đi đôi với làm)
 * KẾ THỪA LEVEL 2 : KHÓ HƠN , CHA TRỪU TƯỢNG , CON CỤ THỂ ,...
                                ( chỉ nói , éo làm, chỉ tay năm ngón)
                                ( nói và làm là 2 vế khác nhau)
 0. Muốn chế tạo nhanh các object , dùng tư duy khôn -> nhân bản obj,...[DONE]

 1. Muốn chế tạo nhanh cái Khuôn, ta dùng kế thừa , dùng lại 1 cái Khuôn nào
 có trước để độ lại ( biến dị đó), xài lại cái cũ + thêm cái mới - [DONE]

 2. Ta cần chế tạo nhiều Khuôn mà lại CHẾ TẠO nhanh để từ đó ra object
 cho nhanh
 vẫn là kế thừa mà thôi!!!, vẫn phải dùng lại khuôn đó
 vấn đề là dùng lại bao nhiêu Khuôn để làm nhiều Khuôn
 -> mục tiêu đa dạng object nhưng cần nhanh
 -> mà lại chung phiên bản, tương đồng nhau
 -> TA CẦN 1 KHUÔN TỔ , TỪ ĐÓ "ĐẺ" RA ĐƯỢC NHIỀU KHUÔN CON " KHÁC NHAU"
 -> ĐÁM KHÁC NHAU VỀ CHUNG 1 NHÀ , CHUNG MẢNG , SẮP XẾP SẼ YÊN VUI
 -> SẮP XẾP MẢNG CÁC OBJECT KHÁ " KHÁC NHAU"

 --> Cố gắng làm 1 Khuôn hoàn hảo -> Ra nhiều Khuôn khác nhau
    -> 1 Loạt phiên bản xuất phát 1 thứ gốc , phiên bản đặc biệt tiêu chuẩn, limited ,...
    Vuông, Tròn , Chữ Nhật chung 1 nhà!!!
    Vuông ,TR,CN is a kind of....?

    Vuông là chữ nhật , chế tạo Vuông rất nhanh
    TGV       TG

    V, TR, CN, TG là một cái gì đó , cá là chế tạo đám kia nhanh


 */