import data.Dog;

public class Main {

    public static void main(String[] args) {

        Dog chiHu = new Dog("CHI HU HU",2021,0.5);
        chiHu.bark();

        Dog ngaoDa = new Dog("NGÁO ĐÁ",2020,50.0);
        ngaoDa.bark();
//
//        System.out.println(" Chi Hu Hu barks again:");
//        chiHu.bark();
//
//        System.out.println("After overweight:");
//        chiHu.setNewWeight(5);
//        chiHu.bark();
//        System.out.println("///////");
//        chiHu.getYob() ;
//
//
//        int chYob = chiHu.getYob();
//        System.out.println("CH YOB: " +chYob);
//        System.out.println("CH YOB: "+ ngaoDa.getYob()
        // show toàn bộ info của tôi,theo cách toString()
        // object có nhiều hành động
        System.out.println("Show all info by using to String()-a new behaviours");

        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);   // nên dùng như này
        System.out.println("ND details: " + ngaoDa.toString()); // dùng cũng được những bi xấu khoảng trắng
        // hàm toString() rất đặc biệt , @Override
        // mục tiêu show ra tất cả  trong info đã đổ vào, hoặc chỉnh sửa
        // y chang như mở Setting trong phone xem phần info điện thoại

        System.out.println(" Play with toString() - gọi thầm tên em");
        System.out.println(chiHu);  // chiHu là biến con trỏ , lưu toạ độ vùng new
                                    // lí thuyết là in ra địa chỉ ( nếu trong C),thực tế trong JAVA gọi toString()

        System.out.println(ngaoDa); // gọi thầm tên em toString()
    // đặc biệt ở đây hàm toString khác với hàm khác là khi xoá hàm thì vẫn gọi được ( . được ) như bình thường
    // lúc này nó sẽ chỉ in ra địa chỉ bộ nhớ  ví dụ    data@15db9742 ( hệ 16/HEX)
    // hiểu nôm na là nếu khuôn không có hàm toString(),JVM( máy ảo)
    // sẽ tự động băm vào RAM của object thành số HEXA ,đại điện VALUE vùng RAM đó
    // HASH NUMBER, nén toàn bộ DATA thành 1 con số , MD5,SHA-256

    // xem tuổi của 1 object, tương tác, hỏi đáp, giao tiếp với object qua dấu chấm
        System.out.println("Get age");
        System.out.println(" NĐ age: " + ngaoDa.getAge());
    }

}