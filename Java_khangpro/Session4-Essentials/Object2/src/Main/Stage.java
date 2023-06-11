package Main;

import data.Student;

public class Stage {
    public static void main (String[] args){
        checkObjectV8();
        Student ahihi = checkObjectV8(); // ahihi lưu toạ độ KHANG trong hàm thảy ra
        ahihi.showProfile();
        //checkObjectV7();
        //checkObjectV6();
        // checkObjectV5();
        // checkObjectV4();
        // checkObjectV3();
        // checkObjectV2();
        // checkObjectV1();
    }
    // Hàm trả về 1 object
    //đọc chuẩn : hàm trả về 1 toạ độ của 1 object nào đó, vì trả được toạ độ nghĩa là sờ được object,chấm tới object

    public static Student checkObjectV8(){   // Student checkObjectV8 ~ ~ Student x = sẽ là 1 vùng new
        Student x; // biến trong hàm là biến local sẽ bị clear  khi hàm gọi xong ( trong STACK )

        x = new Student("He176045","KHANG NGUYEN",2021,8.9); // vùng này trong HEAP sẽ ko mất
        return x  ;    // x đang lưu toạ  độ vùng clone KHANG, đưa toạ độ 6M đó cho tên hàm
                      // lúc này tên hàm là 6M , hướng 6M

    }

    public static void checkObjectV7(){
    Student x; //khai báo biến,khai báo con trỏ , những chưa trỏ ai

       x=  new Student("He176045","KHANG NGUYEN",2021,8.9);
       // tương tự   int a;
       //            a=10;

    }

    public static void checkObjectV6(){

        // câu chuyện của sinh ra rồi chết non
        // câu chuyện vô danh tên gọi
        //Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        // vùng new đã tương đương toạ độ rồi , đưa toạ độ đi đâu thôi
        // cho biến ( object) nào giữ dùm doạ độ , nghĩa là new chấm lun
        // biến nào mà chấm nhĩa là biến có toạ độ từ new . CHỐT HẠ : new nắm toạ độ
        // chấm là vào trong toạ độ xem có cái gì , trong object có gì

       new Student("He176045","KHANG NGUYEN",2021,8.9).showProfile();
       // không thèm đặt tên cho object để giao tiếp, để object tự giao tiếp
       // object vô danh, xuất hiện xong GARBAGE COLLECTOR phát hiện không con trỏ => giết/clear
        // Muốn RE-USE lại vùng new, tối thiếu ít nhất 1 tên gọi,1 object để còn chấm tiếp
        // ví dụ Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);

    }

    public static void checkObjectV5(){

        // câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        Student x = s1;

        s1.showProfile();
        x.showProfile(); // backup toạ độ new Khang ở trên , thêm 1 con trỏ cùng,trùng
        // chứng mình 2 chàng trỏ 1 nàng

        s1.setName("Mình chơi trốn tìm ");
        // trong vùng clone new Khang đã bị thay đổi tên thành "Mình chơi trốn tìm"
        System.out.println("After s1:");
        // không thèm hỏi s1, hỏi luôn x xem như nào :
        x.showProfile();
        // gọi nhiều tên cùng tham chiếu 1 đối tượng ( 1 object)
        // 1 object có nhiều người ngước nhìn ( tham chiếu)


    }

    public static void checkObjectV4(){
        Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        //trước khi s1 trỏ toạ độ mới , backup toạ độ cũ là xong
        // thế thì giữ lại được Khang
        Student x = s1;  // x là biến lưu toạ độ vùng new , cho toạ độ đi
        // nếu tạo new mới như s1, thì tạo clone mới rồi
        // tương đương : int a = 10 , int b = a; => b = 10; ( không mất value của a)
        s1 = new Student("He176788","LỘC PHÁT",1998,8.8);

        s1.showProfile(); //Lộc Phát
        // System.gc(); // gom rác HEAP ~ free ( bên C)
        x.showProfile(); // Khang trở lại , backup toạ độ new vào 1 biến khác
    }

    public static void checkObjectV3(){
        Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        s1 = new Student("He176788","LỘC PHÁT",1998,8.8);
        //s1 li dị vùng clone KHANG NGYEN , chuyển sang kết nối với Lộc Phát
        // Con trỏ lưu toạ độ mới, biến thay đổi value, lưu Value gần nhất

        // tương đương câu lệnh : int a = 10 ; a= 100 ; ==> a luôn là 100
        // s1 là biến object , new studen là value

        s1.showProfile();
        // mất toạ độ clone Khang, vùng RAM không ai trỏ tới,thì định kì thì chạy app,JVM ( phần chạy song song Window)
        // sẽ kiểm soát app bạn , sẽ clear vùng clone không có trỏ
        // JVM có đoạn code,module giám sát HEAP,xem có đứa nào mồ côi,không có con  trỏ giết ngay luôn~free( trỏ bên C)
        // giám sát gọi tên là Garbage Collector


        // ngoài đời có gán lại biến con trỏ

    }

    public static void checkObjectV2(){
        Student s1 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        Student s2 = new Student("He176045","KHANG NGUYEN",2021,8.9);
        s1.setName("AI RỒI CŨNG KHÁC");
        s1.showProfile();
        s2.showProfile();
        // một new 1 clone,2 sinh viên khác nhau ,2 vùng RAM khác nhau.( lỗi đánh máy nhập tên sai )
        // tôi cần lắm 1 toạ độ vùng new , vùng clone Student
    }

    public static void checkObjectV1(){

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
