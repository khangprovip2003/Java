import data.Dog;

public class Main {

    public static void main(String[] args) {
        // lấy khuôn Dog ra để bắt đầu đổ inf
        // y chang làm thẻ căn cước: lấy thông tin,in lên thẻ,đổ mực
        // sau khi chờ khô, ta được obj thuộc Nhóm vừa đúc
        // đặt tên gọi tắt cho object để dễ dàng nói chuyện , thâm chiếu đến
        // new tạo dựng 1 object
        Dog chiHu = new Dog("CHI HU HU",2021,0.5);
// biến /tên tắt          object
        // có object thì object sẽ biết làm gì đó, chó sẽ biết sủa
        chiHu.bark();

        Dog ngaoDa = new Dog("NGÁO ĐÁ",2020,50.0);
        ngaoDa.bark();

       // chiHu sủa trở lại
        System.out.println(" Chi Hu Hu barks again:");
        chiHu.bark();
        // .bark(); / hành động phải gắn với object, thông qua chấm

        // sau khi thay đổi cân nặng:
        System.out.println("After overweight:");
        chiHu.setNewWeight(5);
        chiHu.bark();

        // thông tin hỏi mới nói
        int chYob = chiHu.getYob();
        System.out.println("CH YOB: " +chYob);

        System.out.println("CH YOB: "+ ngaoDa.getYob()); //định luật bắc cầu hàm trả về giá trị thì sai nó và lồng lệnh khác


    }
    // new xin vùng ram mới đủ chứa info của 1 bạn Dog sẽ đúc, được đổ
    // có 2 vùng name dành cho 2 object do đó ngaoDa không bị đè lên chiHu
    // ENCAPSULATION : Tính đóng gói của thông tin và hành động ( hàm và biến di kèm với nhau, mô tả 1 object,thực thể)
}