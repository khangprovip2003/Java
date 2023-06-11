package data;


// CLB NHỮNG GÃ THÍCH ĐUA ĐẾN CHẾT , GOM NHỮNG OBJECT MÀ CÓ CHUNG
// HÀNH ĐỘNG ĐUA , KO CARE CHUYỆN GÌ KHÁC
// CLB LÀ NƠI TẬP HỢP NHỮNG NGƯỜI CÓ CHUNG TIẾNG NÓI, HÀNH ĐỘNG ,GIAO TIẾP/INTERFACE
// CŨNG LÀ HÌNH THỨC GOM KHUÔN, GOM OBJECT PHÂN LOẠI VỀ CÁI GÌ ĐÓ,NHÓM GÌ ĐÓ
// LỎNG LẺO HƠN KẾ THỪA , KO CARE ĐẶC ĐIỂM,CHUNG HÀNH ĐỘNG VÀO CHƠI CHUNG
// MOTOR,DOG,... IS A MEMBER OF , IS A DEATHRACER
// ANH EM MÌNH LÀ STUDENT , SINH RA LÀ SV
// ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ,...
// 1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON , HỘI NHÓM XÃ HỘI
// HỘI BÀ CON DI TRUYỀN VÀ KẾ THỪA
// HỘI XÃ HỘI , CÙNG NHAU CHIẾN


//CHỈ QUAN TÂM HÀNH ĐỘNG , TRONG ĐÂY CHỈ CHỨA HÀNH ĐỘNG
// CLB để anh em tự mình hành động theo của mình
// Vào CLB tiếng anh speakEnglish() theo giọng của mình
// đua thì đua theo cách của mình : lạng lách , tung mình ,...
// Interface CLB để mọi người tự chơi theo cách của mình - chơi - hành động là abstract
// CHỈ NÓI NỘI DỤNG THÔI, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI
// CHỐT HẠ : INTERFACE CHỨA HÀM ABSTRACT
//ko cần ghi ra từ khoá abstract ở cả tên của clb và tên hàm
// VÌ CLB HÀM Ý / NGẦM HIỂU CHỈ CÓ NỘI QUY ĐỂ MỌI NGƯỜI THEO,NỘI QUY CHUNG CHUNG
// ĐỂ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU INTERFACE LÀ ABSTRACT
// ABSTRACT LÀ NÊU Ý TƯỞNG

// JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHỮNG....

public interface DeathRacer {

    //Ai đã chọn nghề tham gia đua thủ , thì phải đua!!!
    //public abstract double runToDead();  //ko sai những thừa ( có thể viết như dưới)
    public double runToDead();
    public void showHowToDead(); // gáy tổ quốc ghi công!!!


}
