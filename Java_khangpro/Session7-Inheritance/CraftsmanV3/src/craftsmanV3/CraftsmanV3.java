package craftsmanV3;

import data.*;


public class CraftsmanV3 {
    public static void main(String[] args) {

        playWithTriangle();
    }

    public static void playWithTriangle(){
       // Khai gì New nấy

        //T1 là là tên tắt về 1 hình tam giác , nó đây ~~ new Triangle()
        Triangle t1 = new Triangle("TÍA","PINK",3,4, 5);
        t1.paint();
        RightTriangle rt1 = new RightTriangle("Má","PINK",6,8);
        rt1.paint(); // của Con chính chủ

        // câu chú ý, khai Cha new Con -> kế thừa
        Triangle rt2 = new RightTriangle ("BÉ NA","RAINBOW",6,8);
        // TG một là hình TGV ( đọc ngược )
        // đang xem TGV như là 1 TG, gọi nó theo tên tắt TG
        //rt2 chấm xổ ra Cha,xưng dưới danh nghĩa Cha , tao là con đại gia
        rt2.paint(); // xài Cha, nhưng lúc chạy thì ưu tiên gọi CON
                     //PAINT() Cha để đó, Con lo cho,Cha bị qua mặt
    }
}
/*
Kết luận:
- Vùng nhớ Con to/bao trùm vùng nhớ Cha với ý nghĩa: Con thừa hưởng
tất cả đồ của Cha ( trong vùng new có gì thì được xài cái đó)
- Vùng nhớ Con to/rộng/bao trùm vùng nhớ Cha,ý nghĩa:Cha là nền tảng
/móng nhà/base để Con thoải mái vùng vẫy , mở rộng thêm (extends)
-Vùng nhớ Cha mở rộng/extends thêm 1 chút thành vùng nhớ Con

- Vùng nhớ Con = vùng nhớ Cha       + extends ( mở rộng thêm )
                  super()
                  thừa kế hết của Cha [DI TRUYỀN]
                                      @Override Con trùng tên hàm Cha
                  biết lái xe               @ cũng biết lái xe

                                      + Con có thêm điều khác Cha
                                         [Biến DỊ]
                                                 chơi dù lượn , thể thao mạo hiểm
* Chốt Con trỏ
- Khai khuôn = new Khuôn , chấm xổ tất cả Khuôn 



 */

