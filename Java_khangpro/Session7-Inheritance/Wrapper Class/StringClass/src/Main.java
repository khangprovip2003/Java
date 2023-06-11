public class Main {
    public static void main(String[] args) {
    playWithStrings();
    }
    public static void playWithStrings(){
        // Tuần sau là tuần đầu tiên của HK Summer 2022
        // không có tiền thì cạp đất mà ăn à (NT)
        // Vạn lời khuyên sẽ vô nghĩa nếu mà bạn ko chủ động bắt đầu để làm
        // Hãy vượt sướng để thành công
        // Có 4 dòng chữ , 4 object
        // Mô tả được : rất nhiều chữ cái, độ dài dòng chữ: ???
        //              gồm các kí tự nhân loại đang dùng
        // -> thuộc 1 nhóm String class String xuất hiện

        String s1 = new String("HELLO");
        String s2 = new String("HELLO"); //~~~ new Integer(2003); ko khuyến khích
        //nhìn không tự nhiên
        String s3 = "HELLO"; // new ngầm
        String s4 = "HELLO";
        //POOL HỒ BƠI TẮM CHUNG, S4 trỏ cùng new s3, 2 chàng 1 nàng
        //POOL PHÂN BIỆT HOA THƯỜNG
        //VẤN ĐỀ BIẾN NÀO NEW TRƯỚC POOL BIẾN SAU NẾU MUỐN XÀI ĐÚNG DỮ LIỆU DATA ĐÓ
        // CHO XÀI KÉ , CỨ GÁN = "HELLO" MÀY KO ĐC new . XÀI CHUNG VS TAU



        String s5 = "hello";
        String s6 = "hello";

        // hỏi s1 có bằng s2 ko - con trỏ?
        boolean result = s1 == s2; // kết quả phép so sánh là true/false
        System.out.println("s1 == s2?| " + result);
        //hỏi s3 có bằng s4 ko?
        System.out.println("s3 == s4?| " + (s3 == s4));
        //hỏi s2 có bằng s3 ko?
        System.out.println("s2 == s3?| " + (s2 == s3));
        //hỏi s4 có bằng s5 ko?
        System.out.println("s4 == s5?| " + (s4 == s5));
        //hỏi s1 có bằng s5 ko?
        System.out.println("s1 == s5?| " + (s1 == s5));

        //KO SO SÁNH 2 OBJECT QUA == MÀ PHẢI CHẤM VÀO BÊN TRONG LẤY VALUE ĐI SO
        //CÁC OBJECT NÊN LÀM SẴN HÀM SO SÁNH BÊN TRONG ĐỂ ĐI SO SÁNH VỚI ĐỨA KHÁC
        //SO SÁNH OBJECT PHẢI CHẤM
        //2 LOẠI CÂU HỎI : equals() compareTo()

    }

}