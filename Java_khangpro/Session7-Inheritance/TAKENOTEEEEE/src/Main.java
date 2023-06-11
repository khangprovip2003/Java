/*
CÓ 2 LOẠI KHUÔN / CLASS:
1.KHUÔN /CLASS HOÀN CHỈNH,KO CHỨA HÀM ABSTRACT,CONCRETE CỤ THỂ / RỜI RẠC/RÕ RÀNG
 - Các hành động có đủ code
 - Nếu nó có Con, Con ko cần implement gì cả , Cha có đủ code rồi. Con thích thì @Override

2.KHUÔN/CLASS KHÔNG HOÀN CHỈNH/CHỨA HÀM ABSTRACT , HÀM KHÔNG CODE
- Bản thân nó ko hoàn chỉnh , vì chỉ có tên hàm mà không có code, nó vẫn có quyền có hàm khác mà
không có code
- Về mặt lí thuyết , khi new ABSTRACT CLASS thì khi chấm cái hàm không code , KO CÓ CODE ĐỂ CHẠY
- new Cha abstract thì ko có code để CHẠY!!!
- new Shape(...), new Pet(...) . run(), .paint() , .getArea éo có code lấy gì chạy ?

-KO NEW CLASS CÓ HÀM ABSTRACT VÌ KO ĐỦ CODE / KO HOÀN THIỆN ĐỂ CHẠY!!!!

TRỪ KHI...NẾU VẪN NGOAN CỐ NEW ABSTRACT CLASS THÌ...

- Nếu nó có Con , thì Con có 2 phương án mình đã học rồi ( Vô Sinh luôn -> ko new ,
 là ABSTARCT luôn -> phải IMPLEMENT viết hết code cho hàm Cha )
- giả bộ ta tập trung vào phần IMPLEMENT hàm Cha , Cha nói Con làm
-Con @Override hết hàm Cha, con có quyền làm thêm dị biệt như bình thường,...

- VÙNG NHỚ CỦA CON ( VÙNG NEW CỦA CON) SẼ CHIẾM THẾ NÀO TRONG RAM ( KO CARE CON KẾ THỪA CHA CỤ THÊ
HAY TRỪU TƯỢNG ) : BAO GỒM

- VÙNG NEW CỦA CHA , SUPER() ĐÓ, KO CARE CHA CỤ THỂ/HAY ABSTRACT
  BA SẼ LÀ CÁNH CHIM , ĐƯA CON ĐI THẬT XA/ EXTENDS MỞ RỘNG THÊM
  VÙNG NHỚ CON BAO VÙNG NHỚ CHA, ĐỂ CON ĐƯỢC KẾ THỪA, CÓ SẴN MÀ DÙNG ĐỒ CHA

- PHẦN MỞ RỘNG / EXTENDS, CHỨA:
  + DỊ BIỆT Hoàn  TOÀN TỪ CON, HÀM, BIẾN/ĐẶC ĐIỂM RIÊNG CỦA CON. VÍ DỤ :  HCN : CÓ THÊM 2 CẠNH
  + PHẦN @OVERRIDE/CON TRÙNG TÊN HÀM VỚI CHA - KO BẮT BUỘC NẾU CHA CỤ THỂ!!! THÍCH THÌ LÀM
                                                VÌ ĐẰNG NÀO CX CÓ CHA ĐỦ ĐỂ XÀI
- PHẦN @OVERRIDE/CON TRÙNG TÊN HÀM CHA
            BẮT BUỘC PHẢI CÓ NẾU CHA LÀ ABSTRACT, CHA KO HOÀN HẢO, CON BẮT BUỘC PHẢI CODE
PHẢI VIẾT CODE CHO CHA NẾU CHA ABSTRACT

* TỔNG KẾT CÔNG THỨC CON CHƠI  VỚI CHA TRỪU TƯỢNG
    CON = NEW CHA()/SUPER() CHA + @OVERRIDE CHO TẤT CẢ CÁC HÀM CỦA CHA

* CÂU HỎI: LÀM SAO ĐỂ CÓ ĐƯỢC 1 OBJECT - VÙNG NEW ??? TRONG OPP
  1. Ta cần 1 Khuôn/Class
  2. Gọi new + phễu để xin vùng ram ( clone vùng ram)+ gọi phễu đổ vật liệu vào
                        -> new xong là có object, toạ độ object luôn
  3. Đặt tên cho object, biến object trỏ vào vùng new

  - NẾU TA MUỐN CÓ 1 HCN:
  1. Ta cần Khuôn Rectangle - KHUÔN ĐỦ CODE MỚI HÀNH XỬ ĐƯỢC , MỚI CHẤM ĐƯỢC ( CHẠY ĐƯỢC)
  2. new Rectangle( tham số???)
  3. Rectangle x = new Rectangle(???)
/////////////////////////////////////////////////////////////////////////

* LIÊN QUAN ĐẾN HÌNH HỌC , BIẾT THỪA CÓ NHỮNG HÌNH BIẾT RÕ NHÓM CON VÀ THUỘC CHA (SHAPE)

* CÓ NHỮNG HÌNH CHỈ BIẾT NÓ LÀ HÌNH , KHÔNG BIẾT TÊN GỌI NHÓM CON , NHÓM CHI TIẾT , CHỈ BIẾT LÀ
  HÌNH VẪN LÀ SHAPE MÀ , S() LÀM SAO , TÍNH = CÁCH ĐO, VÌ MÀY KO LÀ DẠNG HÌNH QUEN THUỘC, NẾU QUEN
  THUỘC THÌ TAO ĐÃ ĐẶT ĐƯỢC TÊN NHÓM CON CHO MÀY

* CÓ XUẤT HIỆN NHỮNG ĐỐI TƯỢNG LẠC LOÀI , KO HÌNH DẠNG QUEN THUỘC , HÌNH CẮT NGẪU NHIÊN  KO BIẾT
  XẾP VÀO NHÓM NÀO NGOẠI TRỪ NHÓM CHA!!!

* Theo quan điểm object thì đã có object được tạo ra , có 1 hình mà , mà ko biết khuôn là gì
  chỉ biết nó là thuộc khuôn Cha , vì là HH
  TA SẼ CÓ CÁCH TẠO OBJECT VÔ ĐỊNH , KO QUEN THUỘC , KHÔNG PHÂN NHÓM CON ĐƯỢC , TA NHÌN NÓ
  THEO DẠNG ĐÚC TỪ KHUÔN CHA , VÌ LÚC NÀY TA GỌI NÓ LÀ HÌNH HỌC, VÂỴ NÓ PHẢI XUẤT PHÁT TỪ KHUÔN HÌNH
  HỌC. TỨC LÀ TA NEW HÌNH HỌC

DÙNG KĨ THUẬT MƯỢN GIÓ BẺ MĂNG , MƯỢN SHAPE TẠO OBJETC , VÌ TA THIẾU 1 CÁI KHUÔN CON CỤ THỂ
NẾU CÓ KHUÔN CỤ THỂ ( FULL CODE ) NEW NGAY  KHUÔN NÀY RA HÌNH MÌNH CẦN

CÓ HÌNH, NHỮNG KO RÕ , KO BIẾT TÊN KHUÔN , NHỮNG SURE LÀ 1 DẠNG CON CỦA CHA, LẤY CHA NEW LUÔN CHO RỒI

CON = NEW CHA/SUPER CHA + EXTENDS @OVERRIDE
HÌNH CÀ CHỚN VỪA RỒI , MÀY LÀ OBJECT CON RỒI , VÌ MÀY LÀ HÌNH
NÊN TAU SẼ NEW CHA + PHẦN @OVERRIDE VIẾT CODE CHO ĐỦ -> VẪN ĐẢM BẢO CÔNG THỨC CON...

-> NEW CHA + CODE @OVERRIDE THÌ VẪN ĐẢM BẢO CÔNG THỨC VÙNG RAM CON NHƯ XƯA NAY - MÀY ĐỦ CODE
       TẠO OBJECT MÀ KO CẦN CLASS RIÊNG, MƯỢN CHA MÀ LÀM , CLASS RIÊNG MÀ KO CẦN ĐỀ CẬP
             --> GỌI LÀ CLASS LÀM BIẾNG,CLASS KO CẦN TẠO RA,CLASS ẨN DANH ( ANONYMOUS)

VẪN NEW ĐƯỢC OBJECT CON CỦA SHAPE MÀ KHÔNG CẦN 1 CLASS CON CỤ THỂ , VẬY THÌ VÙNG RAM CON NÀY
CHÍNH LÀ ĐẠI DIỆN CHO 1 CLASS LÀM BIẾNG/ĐẶT TÊN , CLASS ẨN DANH

TẠO OBJECT ON THE GO , LÀM BIẾNG TẠO CLASS CON CÓ SẴN!! GỌI LÀ ANONYMOUS CLASS
KO CHỈ ĐỊNH RÕ TÊN CLASS CON MÀ VẪN CÓ OBJECT CON .

KHAI CHA NEW CHA , NẾU CHA ABSTRACT , MƯỢN GIÓ BẺ MĂNG , CHA NEW ĐỠ CHO CON MỞ RỘNG RA
ĐI CON , VIẾT CODE ON THE GO, ĐỪNG QUÊN CHẤM PHẨY , MÀY LÀM BIẾNG TẠO CLASS CON ĐỂ
CLONE CHO NHANH , MÀY CHƠI TRÒ NEW TAO NGAY , TAO HỖ TRỢ VÙNG EXTENDS HOÀN THIỆN CODE
OVERRIDE CHO TAO , BA SẼ LÀ CÁNH CHIM , ĐƯA CON NEW ON THE GO
-> ANONYMOUS CLASS , VÙNG RAM VẪN BỰ NHƯ CLASS RỜI , LÀM BIẾNG ĐẶT TÊN VÙNG RAM BỰ
VÙNG RAM ANONYMOUS


*/