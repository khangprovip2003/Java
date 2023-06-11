package data;

//1. IS A xuất hiện 1 chiều extends , chuẩn bị xài lại , không có tự làm
//2.Khai báo các đặc điểm ,Lưu ý :
// 2.1 Nếu Con trùng hết với Cha , không cần làm lại , Cha sẽ làm cho
//    Giả sử Con cũng chỉ làm 2 tài sản ( di truyền), Không cần khai báo gì

// 2.2 Con có đồ riêng , làm riêng , giấu BA, liệu rằng Ba có biết không?
//     biến dị

//3. Làm phễu , giữ bản sắc

public class Child extends Parent {
    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    @Override
    public void showProfile(){
        System.out.println("CHILD  > asset1: " + assetOne + "; asset2: " + assetTwo);
    }

    // hàm mới, hành động của Con , khác Cha , Cha không có
    // ngoài đời , Con vào SG đi làm thêm , đi đánh game , đá banh,...
    //tập thêm thể thao mạo hiểm!!!
    public void sayHi(){
        System.out.println("Hey, I am a rich kid");
    }
}
