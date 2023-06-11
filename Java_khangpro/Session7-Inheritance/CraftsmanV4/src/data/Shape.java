package data;

//KHUÔN TỔ , SINH RA N KHUÔN KHÁC CHO NHANH
//GIÚP V,TR,HBB,TG,OVAL,... Ở CHUNG MẢNG,MỚI SORT ĐƯỢC
// CÙNG PHIÊN BẢN XẾP GẦN NHAU
public abstract class  Shape {
    protected String owner;
    protected String color;
    protected String borderColor;
    // các cạnh thì sao ?
    //protected double a, b, c, radius;
    // KHÔNG ĐƯỢC ĐƯA CÁC CẠNH VÀO ĐÂY VÌ:
    //chúng sẽ kế thừa hết các cạnh, do đó HV sẽ có cạnh,nhiều nữa khác,bán kính
    //Hình tròn ngoài bán kính , thừa kế luôn cạnh
    //bấn kính, cạnh là của riêng từng đứa Con, Dị biệt
    //Dị biệt thì phải ở từng đứa con

    //Cha là nhân tử chung cho các con , Ngoài đời y chang
    //Đám Con có di truyền từ Bá Má: OWNER,COLOR, Đường Bo
    //Những giữ lại khác biệt :
    //                          TR : BK
    //                          V  : Cạnh
    //                          TG : Chiều cao / Đáy ,...
    // anh em trong nhà thì thừa kế từ ba má nhiều thứ , tài sản riêng của mỗi con tạo dựng
    // thì người đó giữ

    // diện tích và chu vi là derived field được tính từ thằng khác, không nên đưa vào

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner='" + owner + '\'' + ", color='" + color + '\'' + ", borderColor='" + borderColor + '\'' + '}';
    }


    // XOÁ KHÔNG CHO , VÌ CẦN KHÁI NIỆM NÀY DIỄN TẢ Ý NGHĨA HÌNH HỌC
    // ĐỂ KHÔNG ĐƯỢC VIẾT CODE, VÌ KHÔNG CÓ CỤ THỂ KÍCH THƯỚC
    // VẪN TỒN TẠI NHỮNG KHÔNG NẮM CHẠM ĐƯỢC , VẪN TỒN TẠI VỚI NGHĨA MÔ TẢ
    //NÓI VỀ NÓ THÔI, NHỮNG CHƯA CỤ THỂ,NÓI NHỮNG CHƯA LÀM, KHÁI NIỆM THÔI
    //HÀM TRỪU TƯỢNG ( ABSTRACT ) , THỨ VÔ HÌNH  MÀ VẪN HƯU HÌNH
    // ĐỂ VÀO CHO ĐỦ BỘ HOÀN THIỆN 1 THỨ GÌ ĐÓ , LÃNH ĐẠO TINH THẦN , KO QUYỀN LỰC
    // ----------->  ABSTRACT  <----------------

    public abstract double getArea(); // chỉ nói mà không có code
    public abstract double getPerimeter();

    //Việc vẽ và in ra thông tin cũng là chung chung vì mỗi hình mỗi khác
    public abstract void paint(); // thiếu S,P để in ấn


    // tao chỉ nói rằng hình học có thứ này , còn mấy đứa V , Tr, CN,... tự lo đi

    //Cha là nhân tử chung của các con
    //ABSTRACT : Khái niệm, nói thôi , chưa cần cụ thể
    //ABSTRACT CLASS : là sự phân loại trong cuộc sống , trong tự nhiên
    //               Để dễ dàng nói về các object, xảy ra cực nhiều trong cuộc sống



//        public double getArea(){
//            // Tính thế mẹ nào???, éo có kích thước vì dị biệt ở từng Con
//                                  // ko có kích thước làm sao tính
//                                  // ko xoá hàm này được , vì hình học phải có S
//            // return ; không được default , vì vô nghĩa  khi new luôn
//            // cạnh đâu mà sửa diện tích , công thức đâu mà tính
//        }
//        // Hình học cần có S như là khái niệm , nói rằng thứ nào chiếm bề mặt, số đó có S
//        // đại diện cho 1 nhóm/series các đồ vật cụ thể khác đều có S,P
//        // để đây như là ý nghĩa tinh thần , đảm bảo đủ để mô tả 1 thứ nào đó
//        // Hình học có S,P
//
//
//        public double getPerimeter(){
//            // Tính thế nào?
//        }


        // diện tích và chu vi không được xem là đặc tính, mà phải xem là hành vi
        //2 hàm S và P để đâu??? Con hay Cha , hay cả 2???
        //Cả 2 : Vừa Di truyền , Vừa là dị biệt ( @Override)
        //Đã nói về hình học , là phải nói S và P, cũng là đặc điểm hình học nói chung

        //Hình cụ thể V, TR,TG, HBB chắc chắn là tính được , cũng là đặc điểm của từng hình
        // Mỗi con sẽ dị biệt trong tính toán, những nói chung là có S, P, thừa kế từ Cha

}
//ABSTRACT là khái niệm , ý tưởng về 1 thứ gì đó
//Với hình học thì getS() getP() là 2 khái niệm luôn phải có , S , P là 2 khái niệm
// cần có khi mô tả về hình học ( hàm thuộc về object phù hợp )

// Những mô tả này có thể là cụ thể , những cũng có thể là ý tưởng,chung chung thôi
// chung chung --> ABSTRACT
// cụ thể      --> CONCRETE

