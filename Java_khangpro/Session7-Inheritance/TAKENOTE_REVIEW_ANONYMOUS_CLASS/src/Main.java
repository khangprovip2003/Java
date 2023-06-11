/*

* ÔN TẬP ANONYMOUS CLASS - TẠO OBJECT MÀ KO CHỈ ĐỊNH RÕ CLASS CÓ SẴN
                         - MƯỢN NEW CLASS CHA ABSTRACT ĐỂ CÓ ĐƯỢC VÙNG
                           SUPER + EXTENDS / OVERRIDE

                           - VÙNG RAM OBJECT CON GIỐNG Y CHANG NHƯ VÙNG
                             RAM CỦA MỌI OBJECT KHÁC TẠO TỪ CLASS CÓ SẴN
                           - CÙNG RAM BỰ NÀY VỀ LÝ THUYẾT XUẤT PHÁT TỪ
                             KHUÔN CON NÀO ĐÓ MÀ TA KO THÈM LÀM KHUÔN
                             VÙNG RAM BỰ NÀY GỌI LÀ THUỘC VỀ CLASS VÔ DANH

 - Truyền thống ta tạo Object Con là ta phải có Class Con trước
    ( Rectangle , Square , Disk )
   với các  @Override viết sẵn , viết 1 lần , xài cho mọi lần NEW
   Ta sẽ làm class Con nếu ta biết chắc chắn sẽ dùng để nhân bản được nhiều
   object Con trong tương lai , nó đầy đủ  code theo kiểu công thức xử lý

 - Cách ON THE GO , ko cần class Con có sẵn , ta lợi dụng class Cha, ta new
   luôn. NEW luôn mới chỉ có phần super Cha , chưa có được phần viết code cho
   Cha, tự bung ra thêm 1 phần {....ta viết nốt code cho hàm @override của cha }
   Đừng quên chấm phẩy vì nó tương đương new Class Con ();

  Cha object Lẻ = new Cha(...); // ĂN ĐÒN LIỀN , VÌ CHA KO HOÀN HẢO
                                // CHỨA ABSTRACT , LÁT HỒI OBJECT LẺ.HÀM ABSTRACT
                                // --> KO CÓ CODE ĐỂ
                                // CHẤM CHA, NHỮNG CON QUA MẶT
                                // CẦN CÓ CODE CỦA CON,@OVERRIDE
                       // lỡ new CHA cần viết luôn CODE ON THE GO


   Cha object Lẻ = new Cha(...) {
        @Override
        Các hàm Cha cần có code

Shape r1 = new Rectangle (....); // có sẵn super() + @override làm sẵn rồi

Shape xxx = new Shape(...){   //  BA SẼ LÀ CÁNH CHIM
            @Override         // ĐƯA CON BAY THẬT XA
            Các hàm cần code cho Cha here() ;
            };

       new Con = new Cha + phần mở rộng  và ; để kết thúc ~~~
vd:    new HCN = super Cha + phần mở rộng làm sẵn rồi ;

* GIÁ PHẢI TRẢ : ĂN THEO , NEW THEO CONTRUCTOR CỦA CHA , MÌNH KO TẠO CLASS
  RỜI KIỂU HCN , HV ĐỂ CÓ PHỄU RIÊNG
                 TỰ VIẾT LẠI CODE CHO CÁC HÀM @OVERRIDE DO MÌNH KO LÀM
                 KHUÔN CÓ SẴN
  LỢI ĐIỂM LÀ BẤT CỨ LÚC NÀO CẦN NEW OBJECT LÀ LÀM ĐƯỢC LIỀN
  VÌ ON THE GO, MƯỢN CHA NEW~~~ SUPER

* DÙNG KHI CẦN OBJECT TRONG 1 TÌNH HUỐNG NÀO ĐÓ MÀ KO MẤT CÔNG PHẢI Tạo
  RA CLASS RỜI....HỌC SAU NÀY

* ĐÍCH ĐẾN LÀ OBJECT , VÙNG NEW , CÓ CODE ĐỂ CHẤM CHẠY
* KHUÔN/CLASS GIÚP MÌNH TẠO OBJECT NHANH THÔI!!!
* LẬP TRÌNH OOP: TẠO VÙNG RAM CHỨA CODE / HÀM XỬ LÝ ĐỂ GỌI MÀ XÀI
  LẬP TRÌNH NÓI CHUNG : VIẾT HÀM XỬ LÝ DATA,

===========================================================================

TỔNG KẾT CHUNG CHO KẾ THỪA - THỪA HƯỞNG ĐẶC ĐIỂM & HÀNH VI
                           - CÓ HỌ HÀNG , BÀ CON , VÌ CHUNG ĐẶC ĐIỂM
                           - LIÊN QUAN ĐẾN CÂY PHÂN LOẠI , PHÂN LOẠI OBJ
                             TRONG CUỘC SỐNG CỦA CON NGƯỜI
                             LOÀI , CHI , HỌ , LỚP , BỘ , NGÀNH ,......
                             VEHICLE, PET , ANIMAL , VĂN PHÒNG PHẨM,....
IS A KIND OF , ĐỌC 1 CHIỀU
CON LÀ 1 PHIÊN BẢN CỦA CHA - HV LÀ 1 HÌNH HCN, MÈO LÀ 1 THÚ CƯNG
CON THỪA HƯỞNG CÁC ĐẶC ĐIỂM HÀNH VI CỦA CHA

- CHA CỤ THỂ -> CON CỤ THỂ  ( ĐỦ CODE CẢ 2)
                      Con có thể @Override nếu muốn , ko ép
                      Con có thể có dị biệt nếu muốn , ko ép
                      Thực ra đã có đủ từ Cha hoàn hảo rồi
  Khai Cha new Cha  - dùng Cha vì Cha hoàn hảo
  Khai Cha new Con  ( đa hình xảy ra, Con qua mặt Cha)
  Khai Con new Con

- CHA TRỪU TƯỢNG - CON HOẶC TRỪ TƯỢNG ( Vô sinh , ko new được object )
                   CON HOẶC PHẢI CODE CHO CHA
                       Con bắt buộc @Override cho Cha
                       Con có thể dị biệt nếu muốn
                       Phải hoàn tất giấc mơ của Cha !!!!
                       ( Vì Cha chỉ nói chưa làm, chưa hoàn hảo)
 Khai Cha new Cha {..@OVERRIDE}; // anonymous do làm biếng tạo Con sẵn
            // TẠO OBJECT CON RỒI, new cha thêm code thì không phải là cha
 Khai Cha new Con , đa hình xảy ra , Con qua mặt hàm @ Cha
 Khai Con new Con
==============================================================
    CUỘC ĐUA KỲ THÚ AGAIN....
 Hamster
 Dog                 -----------> Pet ( nhân tử chung của đám con )
 Cat                                   ( đặc điểm và hành vi )
 Sóc
 2 anh bạn chạy xe Exciter rượt theo con Dog
 trên đường đua lúc này  có Pet và Motor cùng đua , cùng lane, đua cùng nhau , so kè
 tốc độ , cùng Mảng trên đường phố !!!
- Mô phỏng lại trong lập trình thì : Pet và Motor phải cùng mảng!!! mảng nào???
  cùng mảng thì phải cùng kiểu data type
  Pet is kind of Motor  -> gẫy
  Mortor is kind of Pet -> gẫy , Motor là xế cưng , ko là thú cưng

  chỉ vì cùng rượt đuổi nhau , nên mới chung đường
  -> CẢ 2 CÙNG 1 MỤC ĐÍCH , HÀNH ĐỘNG , MỘT THẰNG CHẠY ÉP XUNG ĐỂ THOÁT
                                        THẰNG KIA RƯỢT TAY GA ĐỂ BẮT THẰNG KIA
 TA KO CARE CHUYỆN GÌ KHÁC , NGOÀI 2 ĐỨA ĐUA VỚI NHAU
 TA FOCUS VÀO HÀNH ĐỘNG CHẠY, HÀNH ĐỘNG ĐUA, HÀNH ĐỘNG RƯỢT NHAU , KO CARE CHUYỆN GÌ KHÁC,
 TA ĐANG CHUNG MỤC ĐÍCH , HÀNH ĐỘNG , RÕ RÀNG TA ĐANG LÀ HỘI-ĐUA-THỦ

 HỘI ĐUA THỦ LÀ HỘI/GOM NHÓM NHỮNG GÃ CHỈ TẬP TRUNG VÀO VIỆC DUY NHẤT , ĐUA !!!

  TA CHỈ TẬP TRUNG VÀO HÀNH ĐỘNG , TA ĐÃ CHƠI CHUNG ĐƯỢC VỚI NHAU , KO CARE XUẤT THÂN
 NGOÀI ĐỜI LÀ CÓ THẬT
  ĐÂY LÀ CÁCH TA LẬP HỘI NHÓM NGOÀI ĐỜI

  HỘI NHÓM LÀ GOM THÀNH VIÊN CÓ CHUNG SỞ THÍCH VÀ HÀNH ĐỘNG,KO CARE NGUỒN GỐC XUẤT THÂN
  VÍ DỤ: CLB-PHƯỢT THỦ , GOM NHỮNG BẠN TỪ KHẮP NƠI,QUAN TÂM:
                         CUỘC ĐỜI LÀ NHỮNG CHUYẾN HÀNH XÁC
                         CHẤP BẠN LÀ Student,Teacher,Lecture,...
                         miễn bạn sẵn sàng lên dường
                         Bạn là MEMBER OF HỘI-PHƯỢT-THỦ
                         GOM NHÓM VỀ HỘI NÀO ĐÓ - 1 CLASS PHƯỢT THỦ XUẤT HIỆN

  VÍ DỤ: Bạn là Worker, Student ,Lecturer,Pupil,Employee bạn cần cải thiện tiếng Anh
  bạn tham gia vào CLB Tiếng anh, bạn được đòi hỏi rằng chỉ cần speaking English là đủ
  ko care bạn xuất thân từ đâu, chúng ta chơi chung tiếng anh , cùng giao tiếp tiếng anh
  Worker,Student,Lecturer,Pupil,Employee IS A MEMBER OF ENGLISH-CLUB
                                                        method duy nhất:speakEnglish()
  VÍ DỤ: Worker,Student,Lecturer,Pupil,Employee,....
  ra phố Bụi Viện và bạn thuê 1 cái bình Shisha , đổ thuốc lào Ả-Rập,cả đám cùng kéo
  cần - hút Shisha
  Worker,Student,Lecturer,Pupil,Employee IS A MEMBER OF SHISHAER
  ( chúng mình là gã nghiện ngập shishaer)
  MỖI HỘI PHẢI TẬP TRUNG VÀO HÀNH ĐỘNG MÀ HỘI VIÊN CẦN PHẢI THEO!!! CHẤP HỘI VIÊN TỪ ĐÂU

  VÍ DỤ: Worker,Student,Lecturer,Pupil,Employee,.... TIẾP TỤC PHÊ SHISHA RỒI,
  HƯNG PHẤN TAY LÁI,RỦ NHAU ĐI TỐC ĐỘ , LÊN CON EXCITER,WINNER,RGV,REBEL,.....
  KÉO TAY GA, TĂNG TỐC, CHỈ TẬP TRUNG VÀO TỐC ĐỘ
  Worker,Student,Lecturer,Pupil,Employee,.... IS A MEMBER OF
                                              IS A          DEATH-RACER
  CLB ĐUA-ĐẾN-CHẾT XUẤT HIỆN VỚI HÀNH ĐỘNG ĐUA GÁC TAY GA,GÁC KIM ĐỒNG HỒ

  chung hành động , chung tiếng nói , ở chung với nhau,chung mảng chung kiểu member,chung clb
,GOM NHÓM THEO HÀNH ĐỘNG( THEO INTERFACE).
  tham gia clb,ta chỉ quan tâm hành động

   KHUÔN NÀY DÍNH DÁNG KHUÔN KIA 1 XÍU VỀ  HÀNH ĐÔNG
   ĐỂ CHÚNG CÓ THỂ CHUNG NHAU 1 CHÚT GÌ ĐÓ TRÊN HÀNH ĐỘNG
   TỤ TẬP ĐƯỢC 1 NHÓM HÀNH ĐỘNG , CÓ NHÓM THÌ CÓ TÊN , CÓ CLASS - CLASS LÀ CÁCH GOM NHÓM

* 2.HÌNH THỨC GOM NHÓM:
   - GOM TRÊN ĐẶC ĐIỂM VÀ HÀNH VI - INHERITANCE ( HỌ HÀNG BÀ CON )
    INHERITANCE/ABSTRACT CLASS: TÊN CỦA 1 DÒNG HỌ NHIỀU CON CHÁU CHIA SẺ ĐẶC ĐIỂM,HÀNH VI

   - GOM TRÊN HÀNH VI , TỤ TẬP NHAU LÀM GÌ ĐÓ - INTERFACE/ CHUNG GIAO TIẾP ( HỘI NHÓM )
    INTERFACE: TÊN CỦA 1 HỘI NHÓM ĂN CHƠI HÀNH ĐỘNG

   IS - A -KIND OF   _ CHẶT CHẼ TRONG PHÂN LOẠI ( ĐẶC ĐIỂM VÀ HÀNH VI)

   IS - A -MEMBER OF _ HỘI NÀO ĐÓ ( HÀNH VI , MỤC ĐÍCH ) LỎNG LẺO VIỆC KẾT HỢP

* INTERFACE CŨNG LÀ 1 DẠNG CLASS "CHA" , VÌ CLASS LÀ GOM NHÓM VÀ ĐẶT TÊN NHÓM
  "CHA" NÀY CHỈ CÓ CÁC  HÀNH ĐỘNG ( ABSTRACT , KO CODE , JDK 8,9 CHO PHÉP CÓ CODE ĐẶC BIỆT )
  ĐÁM "CON" , MEMBER CÓ NHIỆM VỤ TRIỂN KHAI/ THI  HÀNH ĐỘNG CỦA " CHA"

  INTERFACE LÀ CLB CÓ NỘI QUY CHUNG CHUNG
  INTERFACE LÀ NHỮNG TỔ CHỨC/HIỆP HỘI CUNG CẤP NHỮNG TIÊU CHUẨN/HƯỚNG DẪN CHUNG CHUNG

  NHỮNG HỘI VIÊN/ CON CÓ NHIỆM VỤ IMPLEMENTS TẤT CẢ

  HIỆP HỘI ĐO LƯƠNG ĐƯA RA TIÊU CHÍ VỀ AT ( nồng độ/hàm lượng chất bảo quản)
  Các cơ sở sản xuất sx theo tiêu chuẩn này

  INTERFACE LÀ BỘ QUY TẮC HÀNH XỬ , CAM KẾT AI ĐÓ PHẢI CẦN THEO

  CỤ THỂ LÀM THẾ NÀO THÌ MỖI THÀNH VIÊN PHẢI LO/LÀMG

* ỨNG DỤNG CỦA INTERFACE
  - Giúp 1 class/object có nhiều cách hành xử khác nhau , tui là member hội nào thì
tôi có hành động Hội đó , giúp cho 1 object/con người đóng nhiều vai , vai nào thì
có hành động tướng ứng. Chính là 1 "hình dạng" của đa kế thừa - multi-inheritance

 - Trong Java 1 class Con chỉ có tối đa 1 Cha - đơn kế thừa , extends đúng 1 class Cha
 single-inheritance. ( c++ nhiều cha , đa kế thừa )

 -> Nay trong Java con 1 Cha , những lại được quyền tham gia nhiều CLB!!! INTERFACE
                   Con 1 cha , những vào chơi nhiều CLB , chơi CLB nào thì hđ CLB đó
                   vẫn đảm bảo tiêu chí Con có nhiều hđ từ bên ngoài , giống như Con
                   có hđ từ nhiều Cha
    Interface/CLB C1 hàm abs...f() ko có code
                  C2 hàm abs...f() ko có code
                  C3 hàm abs...f() ko có code
    Con extends Cha như bt, implements/ tham gia CLB C1,C2,C3
                            Con ơi mày phải có code ngay f() , chỉ duy nhất hàm f()
                                                            ở con có code @Override
                            KO CÒN BỐI RỐI F() VÌ CHỈ CÓ DUY NHẤT 1 PHIÊN BẢN CODE F()

     INTERFACE CŨNG LÀ 1 DẠNG CỦA "KẾ THỪA" HÀNH ĐỘNG, CHUNG HÀNH ĐỘNG

     INTERFACE LÀ BỘ QUY TẮC HÀNH XỬ/ỨNG XỬ/CAM KẾT AI ĐÓ THAM GIA LÀM MEMBER THÌ PHẢI HÀNH ĐỘNG
     ĐÃ CAM KẾT, NHỮNG SÁNG TẠO TRONG HÀNH ĐỘNG ( IMPLEMENT)

 * CODE VIẾT SAO?
   public class Con/Hội-viên implements CLB1,CLB2,CLB3 {
            @Override tất cả hành động của các CLB , tham gia nhiều thì phải hoạt động nhiều;

            }
   CLB ko có đặc điểm , ko có phễu/contructor - những có hàm abstract. Những khi new
   Con thì CLB vẫn sẽ đc new để " Ba sẽ là cánh chim, đưa extends @override
   Member/Con vẫn có 1 vùng Ram của CLB - chứa hàm abstract, con trỏ vẫn trỏ lưng chừng CLB
   vẫn @override vì Con có hàm trùng tên Cha và có code tự làm
   Vẫn theo mô hình Ram của abstract class/Cha truyền thống.Con to hơn cha/CLB về vùng Ram
   super() CHA CLB LÀ SUPER() NGẦM


   public class Con/Hội-viên extends implements CLB1,CLB2,CLB3 {

            @Override tất cả hành động của Cha nếu Cha abstract class
            @Override tất cả hành động của các CLB , tham gia nhiều thì phải hoạt động nhiều;

            };
   Con đóng N vai: dòng họ,vai CLB , giống ngoài đời
   Nếu xui Cha , CLB có cùng tên hàm f() ngoài những hàm khác , thì Con có bị bối ko?
   Con ko bối rối , vì f() của các Cha và các CLB toàn là abstract, Con phải cài code  @Override
   duy nhất hàm f() ko sợ ambugous
   đường nào con cũng @ qua mặt Cha, CLB xài Con, Cac cHa và CLB chỉ kois mà ko làm!!!

* ANONYMOUS
  Object vãng lai tham gia CLB, Vậy thì mày cũng phải hành xử như việc mày tham gia thường xuyên
  phải có hành động tương ứng mới được tham gia, chỉ ngay lúc đó thôi, ON-THE-GO

  GHÉ NGANG MÀ CHƠI, THÌ PHẢI CHƠI/HÀNH XỬ NHƯ NGƯỜI TA ĐANG CHƠI

  Bản chất ta có 1 nhóm nào đó trước đó ,những ta chỉ cần hoà nhập lúc này,tham gia
 lúc này,mà ko cần bộc lộ rõ trước đó ta là ai , nhóm nào , chỉ cần biết JOIN nhóm mới
 lúc này . VD : cắt 1 hình ngẫu nhiễn ( object rồi đó) mà ko biết tên gọi riêng của nhóm
 là gì/class gì?gọi theo tên phân loại chung,nhóm Cha chung -> object thuộc class chưa
 xác định,object thuộc class ANONYMOUS
 căn theo Cha/phân loại chung mà gọi. Hình ngẫu nhiên đó gọi là Hình Học

 Shape x = new Shape(..){
            @Override
            Hàm của phân loại chung,class cha abstract

 };
~~~ Shape r = new Rectangle(....); // khi đã biết object thuộc nhóm rõ ràng trước đó
Rectangle

  CLBcờ = new Student(...); //một sv tham gia CLB cờ - code sẵn @Override
  DeathRacer m = new Motor(...); // mottor đi học còn tham gia đua  - code sẵn runToDead()..

  // gã ghé ngang , ko chuyên nghiệp những ham vui, chơi thì chơi
  CLBCờ hangxom = new CLBCờ {
                @
                Mày hàm chơi, ghé ngang tham gia , thì phải có hành động tương ứng ;

  };

 ABSTRACT CLASS VÀ INTERFACE ĐỀU LÀ 2 THỨ KO HOÀN HẢO, CHỈ NÓI MÀ KO TRIỂN KHAI LÀM
 CON/MEMBER CẦN PHẢI HOÀN TẤT NỐT CÂU CHUYỆN KO HOÀN HẢO @OVERRIDE

 DÙNG THÊM KỸ THUẬT MƯỢN GIÓ BẺ MĂNG , MƯỢN CHA , CLB ĐỂ NEW RA OBJECT THUỘC NGÓM CHA/CLB
                                              @OVERRIDE ON THE GO , TAKE-AWAY
 OBJECT VĂNG LÃI, KO XÁC ĐỊNH NHÓM TRƯỚC MÀ LẠI MUỐN THAM GIA CUỘC CHƠI,THÌ PHẢI HÀNH XỬ
 CƯ XỬ NHƯ  DÒNG HỌ, MEMBER

 KO GỌI CHÍNH XÁC NHÓM BẠN , NHỮNG GỌI BẠN THEO NHÓM BẠN THAM GIA, BẠN CHƠI ĐC MÀ!!!

 VÙNG  RAM VÀ MỌI HÀNH XỬ CHẤM @ QUA MẶT NHƯ BÌNH THƯỜNG, DO LÀM BIẾNG TẠO CLASS RỜI
 - CONCRETE CLASS

 * ỨNG DỤNG CỦA INTERFACE
  - LOSSE COUPLING ( GẮN KẾT LỎNG LẺO ) GIÚP CHO CÁCH TỔ CHỨC CÁC CLASS CÓ RÀNG BUỘC VỚI
    NHAU ĐỂ LÀM NÊN CÂU CHUYỆN LỚN NHỮNG DỄ DÀNG MỞ RỘNG VÀ THAY ĐỔI
  - DÙNG INTERFACE LÀ CÁCH VIẾT CODE GIÚP LINH HOẠT , DẼ DÀNG THAY ĐỔI CODE MÀ KO PHẢI FIX
    PHẦN CODE CŨ, DÙNG DỄ DÀNG MỞ RỘNG CODE THÍCH ỨNG CHO TƯƠNG LAI....
    - INTERFACE LÀ CÁCH KẾT GIAO , MỞ RỘNG GIAO TIẾP KẾT NỐI VỚI XUNG QUANH

    - COMPARABLE/COMPARATOR -> DÍNH ĐẾN LOOSE COUPLING
* MỤC TIÊU CUỐI CÙNG/ TỐI THƯỢNG CỦA INTERFACE : CHƠI CHUNG VỚI NHAU!!! DÙ BẠN KHÁC BIỆT TRONG HÀNH XỬ
  + MỖI THẰNG ĐUA KHÁC NHAU NHỮNG CÙNG ĐƯỜNG ĐUA
  + MỖI THẰNG HÚT KHÁC NHAU , NHỮNG CÙNG CLB PHÊ CẦN
  + MỖI BẠN ĐÁNH CỜ KHÁC NHAU, NHỮNG CÙNG VÁN CỜ
  + MỖI CẢD ĐỒ HOẠ KHÁC NHAU VỀ NĂNG LỰC XỬ LÝ, NHỮNG CHUNG KHE PCI-EX
  + MỖI THIẾT BỊ ĐIỆN KHÁC NHAU VỀ CÔNG NĂNG/TÍNH NĂNG SỬ DỤNG,NHỮNG CHUNG Ổ CẮM 220V

  ==========================================================================

  CHỐT HẠ VỀ OPP:

 - OOP CONCEPTS/ OPP PRINCIPLES / FUNDAMENTAL CONCEPTS OF OPP / FOUR PILLARS OF OOP
  1. ABSTRACTION - TRỪU TƯỚNG HOÁ MỌI VẬT ( ĐỪNG NHẦM LẪN VỚI ABSTRACT CLASS)
  - Là cách tư duy, cách suy nghĩ, chuyển đổi nhưng thứ phức tạp trong cuộc sống thành những thứ đơn
  giản hơn những vẫn diễn tả đúng ý nghĩa của sự vật ban đầu
  - là cách nói về những thứ phức tạp trong cuộc sống thông qua 1 thứ khác đơn giản hơn , vẫn ko làm
  mất đi ý nghĩa của thứ phức tạp ban đầu
  - biểu diễn lại 1 thứ phức tạp ngoài đời đẻ dễ hiểu hơn
  - Lấy ra 1 thông tin quan trọng nhất, tiêu biểu của 1 object phức tạp ngoài đời
  để biểu diễn lại cho ai cũng hiểu được thứ phức tạp
  - một thứ phức tạp ngoài đời đc biểu diễn quá 1 thứ phức tạp hơn, vẫn ko làm mất chất,
  - USING A SIMPLE THINGS TO REPRESENT THE COMPLEX THINGS
  - EXTRACT THE SIGNIFICANT FEATURES/CHARACTERISTIC OF A COMPLEX THINGS TO FORM A SIMPLE/EASY
   CATCHING THINGS WITHOUT LOSING THE ORGINAL MEANING OF THE COMPLEX ONES

   -Tư duy nhắm bắt thông tin cốt lõi quan trọng của object ngoài đời,dùng để biểu diễn object
đó
  -Ví dụ: sinh viên ngoài đời rất phức tạp về infor: tên, tuổi, địa chỉ , tạm trú , chích vaccine
lịch trình di chuyển , gia cảnh, sở thích , ba mẹ , chuyên ngành học , tình trạng học, .... n thông tin
  - Trường đại học ko cần nắm hết info này, vẫn có thể quản lý đc "thứ/object" phức tạp này
  - tìm ra những info đặc trưng đủ quản lý, biểu diễn/minh hoạ/mô tả 1 sinh viên (represent) một sv
  - Sinh Viên ( ID, email, tên, địa chỉ, sdt, chuyên ngành, điểm các môn)
   rút gọn/extract chỉ lấy những info quan trọng nhất, có ý nghĩa nhất để biểu diễn 1 sv bất kỳ
   , RÚT GỌN TỪ N INFO Ở TRÊN CÒN VÀI INFO QUAN TRỌNG, BẠN VỪA THAO TÁC TRỪU TƯỢNG HOÁ 1 BẠN
   SV, BIẾN TỪ PHỨC TẠP THÀNH ĐƠN GIẢN VÃN GIỮ NGUYÊN Ý NGHĨA

   --> TÌM ĐẶC ĐIỂM QUAN TRỌNG CỦA 1 OBJECT , TÌM ĐẶC ĐIỂM CHO 1 CLASS/KHUÔN -> ABSTRACTTION
   BIẾN ĐỔI BIỂU DIỄN INFO KO KHIẾN MẤT GỐC BAN ĐẦU
   MÔ TẢ LẠI 1 CÂU CHUYỆN/THỨ NÀO ĐÓ, ĐỂ AI CX HIỂU ĐƯỢC, TÍNH TRỪU TƯỢNG/TÍNH MÔ TẢ/NGẮN GỌN
   TRỪU TƯỢNG HOÁ TỨC LÀ KỂ LẠI CÂU CHUYỆN,MÔ TẢ TRONG TRÍ NÃO KỂ LẠI CHO AI ĐÓ NGHE VÀ HIỂU ĐƯỢC

   -Bệnh nhân cũng vậy, mã bao nhiêu, tên, dị ứng, lịch sử khám,đơn thuốc

  2.ENCAPSULATION - ( HỆ QUẢ CỦA TRỪU TƯỢNG HOÁ)  CÔ LẬP ĐÓNG GÓI MỌI THỨ
  - Nhận diện 1 đối tượng gồm đặc tính và hành vi, gom chung trong 1 đơn vị object/class
  -  Hàm ( xử lý data) + biến ( data) gom vào 1 đơn vị code/class/object
  - gom xong giấu/che đi bằng thuật ngữ private, show ra nếu muốn theo cách public/protected
  - TẠO CLASS ĐÓNG GÓI MỌI THỨ GỒM ĐẶC ĐIỂM + HÀNH VI , CHE VÀ KO CHE
  - Giống y chang viên thuốc tây con nhộng - vỏ ngoài là protein-kiểu nhựa-sinh học, tan khi uống
  vẫn tách viên thuốc bên trong thấy bột thuốc.
  Nhìn bên ngoài vỏ thuốc con nhộng,ko thấy thuốc bên trong,ENCAPSULATE(V) GÓI LẠI CHE GIẤU,
  CÓ THỂ TRONG SUỐT NẾU MUỐN...NHỮNG TRONG CON NHỘNG, KÉN,VỎ NHỰA SINH HỌC CHẮC CHẮN CHỈ CÓ THUỐC
  -Gom info và xử lý vào trong 1 đơn vị, che giấu show ra khi cần thiết
VÍ DỤ:

  - TIVI : che bằng cái vỏ nhựa đen/xanh/bạc/màn hình, ta chỉ tương tác qua remote/nút bấm
  ko thấy bên trong tivi ra sao, xử lý info + quét data bộ phim wifi/vô tuyến, ko quan tâm
  đứng ngoài tivi giao tiếp qua public nút bấm. tivi chính là encapsulation
  - ATM cũng vậy, ko thấy khay tiên private , ko thấy cục hít tiền, ko thấy hành xử bên trong
  chỉ public cái hành động bấm nút rút tiền,...
  đóng gói , gói cho việc tiền , ko làm việc khác
  - Tivi duyệt web, xem phim, chấm hết
  - xe máy che mất dây,ống,khung,xấu xi qua vỏ,public ra cái nút bấm,tay gas.Xe máy ko quan tâm
  wifi,tiền,..

  --> ENCAPSULATION CHÍNH LÀ CÁCH GOM BIẾN/DATA VÀ HÀM VÀO 1 ĐƠN VỊ ĐỐI TƯỢNG/VẬT THỂ/OBJECT/CLASS
  CHỈ LÀM ĐÚNG VIỆC CỦA NÓ ĐC CHỈ ĐỊNH, THIẾT KẾ
  GOM GÌ THÌ CẦN ABSTRACTION ĐỂ LẤY CÁI ĐẶC TRƯNG
  TIVI XEM PHIM ,KO GÁNH THÊM VIỆC LÒ NƯỚNG

  - ABSTRACTION LẤY RA CÁI ĐẶC TRƯNG, ENCAPSULATION LÀ GÓI TRỌN VẸN ĐÚNG THỨ CẦN LÀM
    nhận diện object                      tạo class instance variable + method()


   3.INHERITANCE - TÁI SỬ DỤNG/CÓ XÀI LUÔN , KO CẦN KO PHẢI THAO TÁC GÌ THÊ,  COPY & PAST
   - Reuse lại code ko cần phải làm, thầm chí ko cần copy & paste
   -Con thừa kế di sản di truyền sự thông minh và giỏi giang từ ba má!!!
   -Tăng tốc quá trình viết code có đoạn code,object đã làm tốt việc của nó rồi
    ta tận dụng để mở rộng thêm khả năng của object mới, bằng cách dùng lại đồ object cũ + dị biệt
    VÍ DỤ:
    TĂNG TỐC LÀM: BA MÁ GIÀU CÓ, CÓ TIỀN,MÌNH THUẬN LỢI, CÓ VỐN LÀM ĂN
                  BÁ MÁ CHO CĂN NHÀ ,MÌNH ĐỠ LO TIỀN TRỌ, TA CHỈ LO TIỀN ĂN
                  BA MÁ CHO VỐN, TA LÀM GIÀU NHANH HƠN,LỜI GIỮ LUÔN
                  THAY VÌ BÒN RÚT,KO CHỊU LÀM THÊM,NAY TA HỘI NHẬP NHANH HƠN
    CÓ THƯ VIỆN VIẾT CODE,LÀM APP CHO NHANH , KO LÀM TỪ ĐẦU
    CÓ THƯ VIỆN , MỞ RỘNG THƯ VIỆN CHO NHU CẦU RIÊNG, TĂNG TỐC VIẾT CODE
    CHA CỤ THỂ, CHA TRỪU TƯỢNG , GIẢNG BÀI 24
    ABSTRACT CLASS CHẲNG QUA LÀ CÁCH GOM, CÁCH PHÂN LOẠI ĐỐI TƯỢNG, NÓ GIỐNG NHƯ GÓM NHÓM NGOÀI ĐỜI
    TẬN DỤNG KẾ THỪA, THÀNH QUẢ OBJECT CÓ CÁI GÌ?? DÙNG LẠI NGUYÊN TẮC TRỪU TƯỢNG HOÁ + ENCAP

     4.POLYMORPHISM - ĐA HÌNH/ĐA ÁNH XẠ - MỘT RA NHIỀU

   - Mùa đông 1946, bác Hồ kêu gọi toàn quốc kháng chiến, ai có súng dùng súng, ai có dao dùng dao
   Chỉ là 1 câu kêu gọi: CHIẾN()
   Nhân dân quất khởi đứng lên:dao, kiếm, liềm,móc câu
                               đa dạng cách giết giặc, đa dạng cách implements hành động CHIẾN()
   từ 1 chữ CHIẾN() có N cách làm, tính đa dạng , biến hình, đa sắc thái, đa nhân cách , đa hình

   Từ 1 hàm của Cha, n Con @Override qua mặt, chính là tính đa hình
   Đảm bảo tính đa dạng của cá hành động vẫn chơi chung và thống nhất hành động qua tên gọi
   @Override hiện thực tính đa hình


 */