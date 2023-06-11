package Main;

import data.Student;

public class Stage {
    public static void main (String[] args){

        Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        s1.showProfile();
        // s1 đang nắm/lưu toạ độ vùng RAM object trong HEAP
        //     new làm cực kỳ nhiều việc
        // việc 1: clone khuôn bao gôm object và static
        // việc 2: gọi phễu đổ data vào vùng clone
        // việc 3: chốt lại toạ độ vùng new vừa rồi , đem toạ dộ đó gán cho biến con trỏ

        // s1 gọi là : reference var/object var/"pointer" var
        // new Student : object( vùng Ram bự trong HEAP),instance,thể hiện,bức tượng
        Student x = s1 ;        // 2 con trỏ cùng trỏ vùng new , 2 chàng trỏ 1 nàng
        // tương đương int a =10;
        //             int b = a;
        // b mang giá trị a đang có mà a vẫn còn giá trị đó




    // s1 là biến , vậy nó có thể thay đổi value
    // sếp với bạn trẻ là sơn tùng
    // sếp với ngừoi đi làm, là trỏ đến người trả tiền cho mình
    // sếp lúc tham chiếu đến người này người kia
        // vậy s1 có thể tham chiếu vùng RAM này, vùng Ram kia
        s1 = new Student ("He666788","BINH NGUYEN",1998,8.8);

        System.out.println("S1 now is Binh");
        s1.showProfile();

        System.out.println("Khang after s1 từ chối chơi:");
        x.showProfile();   // Khang vẫn là Khang ( không mất Ram cũ )

        // Khang nguyên lúc này không còn ai trỏ , không có cách nào lấy lại được thông tin này
        // toạ độ new cũ ta không giữ lại
        // biến object là tay cầm con diều , new chính là con diều
        // khi  tay cầm nối dây với con diều mới , con diều cũ bay mất
        // 1 vùng Ram không còn ai trỏ tới thì JVM có chương trình ngầm gọi là:
        // công ty môi trường đô thị ( GARBAGE COLLECTOR) đi gom nhưng vùng new mồ côi không con trỏ.
        // để dọn FREE RAM FREE HEAP để trả lại RAM không xài cho new sau

        // 1 biến có quyền trỏ vùng new, giữ lại AN được ko , mà vẫn có Bình
        // lưu toạ độ thôi mà
        new Student("SE666666","ĐẠI GIA",2001,9.9).showProfile();
    }


}
