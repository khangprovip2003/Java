/*

 LỮU TRỮ/XỬ LÝ NHIỀU DATA/OBJECT
 THÌ MUA TÚI,BALO,TỦ ĐỂ ĐỰNG NHIỀU ĐỒ
 MUA CÁI TÚI,XÂY CÁI PHÒNG -> NEW TUI() , NEW PHÒNG()
 PHẢI CÓ MỘT THÙNG CHỨA THẬT TẠO RA ĐỂ BỎ ĐỒ VÀO
 DO ĐÓ NEW THÙNG -CHỨA LÀ CHẮC CHẮN RỒI

 QUAN ĐIỂM LẬP TRÌNH: NEW ĐỂ CÓ VÙNG RAM LỮU TRỮ INFO + HÀM XỬ LÝ INFO THEO ENCAPSULATION

 điện thoại trên tay bạn có màu săc, giá tiền, hành dộng gọi nghe,chụp ảnh, bạn phải mua về, nhà
 sx phải tạo ra, new ra bạn mới có xài

 mình trừu tượng hoá món đồ thật thành object trong lập trình thì cũng cần new để có vùng RAM
 có data + hành động

 MUA TỦ ĐỰNG NHIỀU ĐỒ TA CẦN NEW() CÓ KHÔNG GIAN ĐỰNG ĐỒ VÀ CÁC HÀNH ĐỘNG TƯƠNG ỨNG

 TỦ tuCuaTui = new TỦ(); // trong Ram sẽ có vùng không gian để đựng đồ
                         // ngoài đời Tủ chiếm 1 góc phòng để ta đựng đồ
  cái Tủ cho mình làm gì thì mình làm đó/encapsulation/abstraction đấy
  Mua tivi mà ko smart. chỉ xem cab thôi, thì làm sao duyệt web đc
  Mua tivi mà smart thì mới duyệt web đc
  đóng gói hành động đi kèm object . Mua dog về thì nó giỡn với mình

  tuaCuaTui.addDoVao(món đồ đưa vào trong tủ) // tủ cho phép mình bỏ đồ vào

  y chang lò nướng cho mình bỏ con gà vào, để nướng
  LoNuong locuatoi = new LoNuong();  // mua lo về,chiếm góc bếp
  loCuaTui.addDoNuong(con gà - để nướng)

  TỦ LÀ OBJECT CHỨA NHHIỀU ĐỒ ĐẠC
  1.MUA TỦ                            Tủ tuCuaTui = new Tủ();
  2.MUA ĐỒ ADD VÔ TỦ                  tuCuaTui.addMonDo ( new 1 món đồ đưa vào tủ )

    MUA CÁI TÚI, MUA CÁI GIỎ , MUA CÁI THÙNG,NEW TÚI() NEW GIỎ() NEW THÙNG(), có khoá kéo bỏ
                                                                       món đồ mình muốn cất
   tuiCuaTui.addMonDo(mua món đồ bỏ vào túi - new món đồ () )

   CÓ 2 LOÀI TỦ
   1. TỦ LOÀI 1: FIX CỨNG SỐ ĐỒ ĐỂ VÀO, CHỈ ĐỂ BỎ VÔ 1 SỐ GIỚI HẠN MÓN ĐỒ
      CHÍNH LÀ MẢNG [ SỐ ĐỒ ĐỂ VÔ]
      MẢNG LÀ KHAI BÁO NHIỀU BIẾN NHIỀU CHỖ CHỨA [ FIX SỐ CHỖ]
      MẢNG Y CHANG XE Ô TÔ CHỞ KHÁCH [16 CHỖ]
                           RẠP PHIM [100 CHỖ]
     CHỨA TOẠ ĐỘ VÙNG NEW MÓN ĐỒ
     [I] = NEW MONS ĐỒ() CỨ THOẢI MÁI NẰM ĐÂU ĐÓ, TA LƯU TOẠ ĐỘ

     Student arr[] = new Student[100];
     // sẽ có 100 sv , những chưa có bạn nào cụ thể
     // arr chính là biến má mì , tên gọi tắt cho 1 cái tủ có 100 chỗ
     // tên mảng chính là tên gọi cho 1 cái tủ fix số chỗ !!!!
     // vì nó trỏ đến new [số chỗ]

     //bỏ đồ vào mảng, ko cần dùng hàm, hành động của tủ, cho sờ trực tiếp chỗ để
     arr[0] = món đồ bỏ vô, new món đồ bỏ vô;
     //~~~ tuCuaToi.addMonDo(new món đồ);
     // tuCuaTui vị trí 0 được cất món đồ

     //món đồ new nằm trong HEAP , nằm bên ngoài tủ , tủ chi lưu danh sách tham chiếu
     // tủ chứa danh sách bệnh nhân, bệnh nhân vẫn nằm trong phòng điều trị
     // gv giữ danh sách sv,sv ở quê ko có sao
     // -> chỉ giữ danh sách tham chiếu thôi.
* DÙ TỦ LOẠI 1 HAY 2 THÌ ĐỀU CHỨA NHIỀU ĐỒ: ĐỒ ĐỂ THẬT SỰ VÀO TRONG TỦ
                HAY CHỈ GIỮ DANH SÁCH THAM CHIẾU ĐỀU OKE
           TỦ HỒ SƠ GIỮ DANH SÁCH THAM CHIẾU , GOOGLE MEET GIỮ DANH SÁCH THAM CHIẾU
           DANH SÁCH KÍ TÊN (TỦ) CHỨA THAM CHIẾU

           TỦ QUẦN ÁO CHỨA ĐỒ THẬT LUÔN - MẢNG PRIMITIVE VALUE LẤY XÀI LUÔN

  2. TỦ LOẠI 2: CO GIÃN SỐ ĐỒ ĐỂ VÀO,THOẢI MÁI ĐỂ BỎ VÔ 1 SỐ,CẦN THÊM CHỖ,CÓ THÊM CHỖ
     KO CẦN XIN,CỨ ĐỂ ĐỒ VÔ LÀ THÊM CHỖ , GIỐNG NỒI CƠM THẠCH SANH(GIẾNG KHƠI)

     ArrayList,Vector       |        HashSet, TreeSet      |   HashMap , TreeMap
     ban đầu ko có chỗ nào,
     cứ nhét đồ vào,t thêm chỗ
     ko sờ [i] vào vị trí chỗ
     Xin qua dây kéo,khoá,ngăn,cánh cửa,mở ra nhét đồ vô
     tuCuaTui[i] = món đồ bỏ vô -> mảng
     tuCuaTui.add(món đồ bỏ vô) bỏ đồ vô qua hành động của tủ,ko sợ trực tiếp ngăn chứa[i]
     bỏ vào tự ta lo bên trong

     VẪN CODE NHƯ XƯA NAY: NEW TỦ, CHẤM GỌI HÀM HÀNH ĐỘNG CỦA TỦ ĐỒ NEW RIÊNG RỒI ĐỂ VÔ
     MUA TỦ VÀ MUA ĐỒ VÀ CẤT ĐỒ.


      NEW 3 LOẠI TỦ NÀY, GIỐNG NHƯ CÁC THƯƠNG HIỆU TÚI XÁCH BALO BẠN MUA
      ArrayList,Vector       |        HashSet, TreeSet      |   HashMap , TreeMap


      ADDĐỒ(MÓN ĐỒ KHÁC ĐI MUA) VÀO TỦ Ở NGĂN THỨ [I] NÀO ĐÓ NHÌN THEO KIỂU MẢNG
      ĐỀU CHỨA THAM CHIẾU . LINH HOẠT TRONG VIỆC ĐỂ CÁC MÓN ĐỒ
                            BỆNH NHÂN ĐÂU CẦN DỒN VÀO PHÒNG BS, BS VẪN ĐIỀU TRỊ ĐC VÌ
                            CÓ LIST BS TRONG TỦ HỒ SƠ/EXCEL

     Tủ thật túi thật mua về để xài,NEW ĐC, KO PHẢI ABSTRACT, HOÀN HẢO ĐỂ DÙNG,FULL
     CODE HÀNH ĐỘNG
Con     ArrayList,Vector       |        HashSet, TreeSet      |   HashMap , TreeMap\

Phân loại cao hơn cho tủ/giỏ cụ thể
CHA            List                       Set                     Map
ABS/INTF     danh sách                  tập hợp             bộ ánh xạ, từ này ra kia
                                                            KEY,MÓN ĐỒ - VALUE
        vào thứ tự nào
        ra thứ tự đấy
        mảng nâng cao
        co giãn kích thước
        vào trước,ngồi [0]              HashSet lộn xộn thứ tự
        vào sau,  ngồi [1]              Treeset sắp xếp tự động!!!
                                        ko đc lặp lại món đồ lần thứ 2
ngoài đời
        thống kế số vé bán              đếm số người thực sự xem phim
        số lượt người mua               ko đếm lượt
        số lượt người ghé thăm          mỗi người xh 1 lần, ko hơn dù bạn
        1 người có thể đếm nhiều lần    xew 2,3,n lần

CÁC TỦ LIST(ARRAYLIST,VECTOR,....)
       SET (HASHSET , TREESET)        ĐỀU CHỨA BÊN TRONG CO GIÃN NGĂN TỦ,THÍCH THÊM THÌ THÊM
       MAP (HASHMAP , TREEMAP)        KO ĐÁY(TÚI DOREMON)
                                      CHỈ LƯU THAM CHIẾU,LƯU CON TRỎ,ADD CON TRỎ VÀO
                                      VÙNG NEW MÓN ĐỒ THOẢI MÁI Ở HEAP
                                      ADD VÀ LẤY QUA HÀM HÀNH ĐỘNG MỞ DÂY KÉO,NGĂN

                                      MẢNG OBJECT Y CHANG VẬY LUÔN
                                      CHỨA THAM CHIẾU,LƯU CON TRỎ ADD LẤY QUA [I]
                                      VÙNG NEW MÓN ĐỒ THOẢI MÁI TRONG HEAP
Y CHANG QUẢN LÝ DANH SÁCH NGOÀI ĐỜI, TỦ HỒ SƠ



 */
