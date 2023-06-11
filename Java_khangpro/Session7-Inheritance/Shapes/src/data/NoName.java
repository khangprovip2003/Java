//package data;
//
//public class NoName extends Shape {
//    public NoName(String owner, String color, String borderColor) {
//        super(owner, color, borderColor);
//    }
//
//    @Override
//    public double getArea() {
//        //hình cắt bên WORD là hình duy nhất, S ko thể có công thức , mà
//        // là con số đo được thước + tích phân
//        // đảm bảo S là con số, còn tính theo công thức hay đo đạc ko anhr hưởng
//        // nếu bạn chế tạo Khuôn , sẽ là công thức nhân bản
//        //hình mình đang cắt là uni
//        return 50 ; // giả bộ cho hình
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 40;
//    }
//
//    @Override
//    public void paint() {
//        System.out.printf("|NGẪU NHIỄN|%-10s|%-10s|%-10s|%7.2f|\n",
//                owner,color,borderColor,getArea());
//    }
//
//}

// NẾU TA LÀM BIẾNG 1 CÁI KHUÔN CHO 1 CÁI HÌNH CỤ THỂ KO HÌNH DẠNG
// SAU NÀY TA NHÂN BẢN THÌ HÌNH NÀO CX 50 ( VÔ LÍ)
//CẮT NGẪU NHIÊN DIỆN TÍCH NGẪU NHIÊN
// CÔNG THỨC TÍNH KO CÓ LUÔN
//NẾU CHỦ ĐỘNG LÀM CLASS CON THẾ NÀY , THÌ NÓ LẶP LẠI GIỐNG V , TR ,CN
//CẦN CÓ CÔNG THỨC CHUNG CHO S,P,ĐỂ CÒN CLONE CÁC HÌNH

// BÊN WORL HÌNH ĐỘC ĐÁO, DUY NHẤT, KO THỂ DÙNG KHUÔN RỜI NoName ĐANG ĐƯỢC
//TA CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE MÀ NEW TRỰC TIẾP THÔI
//TRẢ RA S , P HARD-CODE ĐÚNG NGHĨA LÀ 1 HÌNH DUY
//CHẾ KHUÔN CLASS DÀNH CHO NHÂN BẢN
