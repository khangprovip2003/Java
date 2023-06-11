package data;

//1. IS A xuất hiện 1 chiều extends , chuẩn bị xài lại , không có tự làm
//2.Khai báo các đặc điểm ,Lưu ý :
// 2.1 Nếu Con trùng hết với Cha , không cần làm lại , Cha sẽ làm cho
//    Giả  Consử cũng chỉ làm 2 tài sản ( di truyền), Không cần khai báo gì

// 2.2 Con có đồ riêng , làm riêng , giấu BA, liệu rằng Ba có biết không?
//     biến dị
//Con làm thêm được 1 loại tài sản thay vì Ba chỉ có 2

//3. Làm phễu , giữ bản sắc

public class Child extends Parent {

   private String assetThree; //Rectangle vs . Square (o,c,e)
                              //                       o,c,e,smile

    //Lý thuyết ,Con có 3 thứ : assetOne,assetTwo.assetThree, kế thừa bà giữ 2
    // new Con tức là new Cha
    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
        //super(assetOne, assetTwo);
        // không được đưa xuống đây,vì có Cha mới có không gian cho Con mở rộng
        //Bắt buộc phải new Cha trước , mới extend được, có thêm chỗ mở rộng
        //Để lưu thêm khác biệt
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    @Override
    public void showProfile(){
        System.out.println("CHILD  >  asset1: " + assetOne +
                                   "; asset2: " + assetTwo +
                                   "; asset3: " + assetThree );
    }

    // hàm mới, hành động của Con , khác Cha , Cha không có
    // ngoài đời , Con vào SG đi làm thêm , đi đánh game , đá banh,...
    //tập thêm thể thao mạo hiểm!!!
    public void sayHi(){
        System.out.println("Hey, I am a rich kid");
        System.out.println("By the way, my 3rd asset is " + assetThree);
    }
    //Con có quyền khác trên đặc điểm và hành vi với Cha ( Ngoài kế thừa  & OVERRIDE)
    //Dấu chấm thì sao
    //Khai Con New Con thì xổ tất, đã biết
    //Khai cha new con thì xổ của Cha, không chỉnh sửa phần khác biệt do dùng
    //danh nghĩa người lớn,phải hành xử người lớn
    // muốn xổ tất, kỹ thuật tổ lái con trỏ

}
