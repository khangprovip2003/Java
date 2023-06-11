package studentmanagement;

import data.*;

import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        //playWithArrayList();
        //sortPlayWithManually ();
        //playWithSet();
    //====================================
//        Student xxx = getAStudent("se123456");
//        if(xxx != null)   //ko trỏ null tức là trỏ vùng tìm thấy
//        xxx.showProfile();
//        else
//            System.out.println("Not found");
    //===============================
        //sortStudentList();
    //===============================
//        List<Student> arr = initData();
//        //gọi hàm search với 4 bạn sv đã có trong arr, mà thực ra do hàm initData() tạo
//        Student xxx = searchAStudent(arr,"sE888888");
//        if(xxx == null)
//            System.out.println("NOT FOUND!!!");
//        else {
//            //LỠ TÌM THẤY THÌ UPDATE LẠI ĐIỂM SỐ
//            xxx.showProfile(); // xxx đang trỏ vùng new bạn TÁM (8.8)
//            xxx.setGpa(6868);
//        }
//        //RA HẲN NGOÀI IF KIỂM TRA ĐIỂM CÓ 6868 HAY CHƯA???
//        System.out.println("Check student list after updating info of a  student");
//        for(Student x : arr){
//            x.showProfile();
//        }

    }

    //----------------------------------
    //TỬ TẾ HÀM SEARCH VÀ SORT, VÀ UPDATE LUÔN
    //----------------------------------

    // ta search/tìm kiếm 1 hồ sơ sv dựa theo mã số. Có thể nhận vào ds luôn cx đc
    public static List<Student> initData() {
        // hàm trả về 1 cái Túi có sẵn bên trong 1 nhóm SV
        // trả về toạ độ 1 cái Túi, vẫn new Túi mà , trong Túi chứa thẻ sv là chuyện khác
        //
        List<Student> arr = new ArrayList();
        Student chin = new Student("SE999999", "CHÍN LÊ", 2009, 9.9);

        arr.add(new Student("SE444444", "BỐN PHẠM", 2005, 4.4));
        arr.add(chin);
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2008, 8.8));
        return arr; // initData() = arr;   arr ơi mày đang trỏ new Bự nào
        //cho tên hàm trỏ với
    }

    public static Student searchAStudent(List<Student> arr, String id) {
        //arr là cái túi new đâu đó rồi, tên biến là con trỏ mà
        //trong túi này có 1 nhóm sv sẵn rồi, add sẵn rồi
        //if(arr.size() == 0) ~~ arr.isEmpty() // Túi ko có thẻ bài , tức là size() trả về 0
        // có sv nào đc tìm thấy đâu, trả về toạ độ đáy RAM ( null)
        if (arr.isEmpty()) {
            return null;
            // CPU chạy xuống đây, túi có thẻ bài rồi, danh sách có người điền tên rồi
            //for hỏi từng thẻ 1 , id mày là gì???? coi có bằng id cần tìm ko
        }
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if (tmp.getId().equalsIgnoreCase(id)) {
                return tmp; // return thẻ bài thứ i có trỏ vùng id tìm thấy
                //thẻ bài , con trỏ có lưu toạ độ, tao return toạ độ
            }
        }
        // đi hết for mà ko return đc, sure cũng ko thấy ( đáy RAM)
        return null; //HÀM YÊU CẦU TRẢ VỀ TOẠ ĐỘ VÙNG NEW,KO THẤY THÌ VÙNG NULL

    }


    //                            có thể đưa Giỏ từ ngoài vào oke
    public static void sortStudentList() {
        List<Student> arr = new ArrayList();
        Student chin = new Student("SE999999", "CHÍN LÊ", 2009, 9.9);

        arr.add(new Student("SE444444", "BỐN PHẠM", 2005, 4.4));
        arr.add(chin);
        // arr.add(binh); //danh sách thống kê bị trùng , 2 thẻ bài, 2 con trỏ
        //
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÝ", 2008, 8.8));

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tpm2 = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tpm2);
                } // set() là thay đổi info của con trỏ , trỏ chỗ khác
                // lấy thẻ bài ra khắc lại thông tin trỏ
            }
        }
        System.out.println("The Student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    // THỬ NHIỆM HÀM TRẢ VỀ 1 OBJECT, THỰC CHẤT LÀ TRẢ VỀ TOẠ ĐỘ VÙNG NEW
    // (XEM LẠI BÀI OBJECT INSIDE-OUT)
    //Đưa vào mã số sv muốn tìm
    // ta sẽ tìm trong túi thẻ bài,coi có ai có trùng mã số
    //thì trả về thẻ bài, hồ sơ bạn sv đó, trả về toạ độ hồ sơ sv đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList();
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);

        Student tmpStudent = arr.get(0); // lấy được toạ độ sv 0, thè bài 0
        //hỏi xem bạn đó id là gì
        String tmpId = tmpStudent.getId(); //arr.get(0).getId()
        //if(tmpId == id) return tmpStudent; //arr.get(0)
        //trả về toạ độ trong thẻ
        //trả về thẻ bài 0
        if (tmpId.equalsIgnoreCase(id))
            return tmpStudent; //arr.get(0)
        //HOÀN TOÀN KO CÓ SV MỚI XUẤT HIỆN, CHỈ THAM CHIẾU TOẠ ĐỘ VÙNG NEW
        //RETURN GET(0) THẺ BÀI 0, THẺ BÀI 0 TRỎ VÙNG NEW AN NGUYỄN
        return null; // ko tìm thấy ( đáy RAM)
    }

    //Set: là 1 loại giỏ,túi,mà ko cho  phép đựng trùng món
    //tức là ko có món nào xuất hiện quá 1 lần
    //ko cho phép trỏ trùng 1 vùng NEW
    //ĐẾM SỐ NGƯỜI XEM PHIM,LỄ HỘI,TIỆC,ĐẾM MỖI NGƯỜI 1 LẦN
    //LIST:CỨ CÓ VÀO LÀ ĐẾM , VỀ RỒI,QUAY LAỊ VẪN ĐẾM - SỐ LƯỢT NGƯỜI GHÉ
    public static void playWithSet() {
        Set<Student> arr = new HashSet(); //mua cái túi Doraemon
        //mở khoá để thao tác, .hàm()
        Student an = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        arr.add(an);
        arr.add(an); //add trùng
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        //arr.add(new Student("SE999999","BÌNH LÊ",2003,4.9));
        //--> đây ko phải trùng, có new có vùng ram mới,object mới,trùng info bên trong new
        //Set là ko chấp nhận con trỏ trùng vùng new
        //MỖI THẺ BÀI ĐƯỢC ADD VÀO GIỎ, KO TRỎ LẠI 1 VÙNG NEW NÀO ĐÓ

        // ko có hàm get() vì giỏ này đưa đồ vào, thẻ bài vào
        // thẻ bài đưa vô ko giữ nguyên thứ tự như đưa vô
        //lấy thì FOR EACH, QUÉT HẾT
        // Thì có 2 tình huống xảy ra:
        //HashSet: để "lộn xộn" thẻ bài, để thẻ bài có thứ tự theo cách riêng
        //         khác hoàn toàn kiểu ARRAYLIST
        //         ARRAY LIST LÀ VÀO TRƯỚC, ADD TRƯỚC THÌ NGỒI TRƯỚC,SAU NGỒI SAU

        //GIỎ CHỨA MẤY THẺ BÀI? ADD 3 LẦN ĐẤY. ARRAYLIST ADD BAO NHIÊU CÓ BẤY NHIÊU
        //
        System.out.println("The student list");
        for (Student x : arr) {  //duyệt qua từng con trỏ,lấy toạ độ
            //từng thẻ bài gán vào con trỏ x
            x.showProfile();
        }
    }

    //ta tự sort danh sách sinh viên làm bằng tay
    //còn 1 cơ chế ta ko cần dùng vòng for tự viết
    //hàm static:Collections.sort() //dùng interface mới được ( giảng sau)
    public static void sortPlayWithManually() {
        List<Student> arr = new ArrayList(); //đi mua cái túi Doramon
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);      //mày đưa tao toạ độ vùng new
        //arr.add(binh);      //add trùng vùng new vô tư
        //có 2 toạ độ trong túi, 2 thẻ bài trong túi
        //get() từng thẻ bài thì đc toạ độ vùng new
        //[i] đc toạ độ vùng new,y chang mảng, mỗi phần tử mảng là 1 toạ độ
        System.out.println("The Student List");
        // mảng đang giảm dần về điểm,túi đang giảm dần về điểm
        // thẻ bài 1 trỏ điểm cao, thẻ bài 2 trỏ vùng điểm thấp
        for (Student x : arr) { //trong arr là 1 đống con trỏ
            x.showProfile();
        }
        System.out.println("The Student List(printed using for i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        } //NHỚ: CÓ TOẠ ĐỘ LÀ CHẤM LUÔN

        //MẢNG CHƠI [I] SỜ NGAY CON TRỎ THỨ I
        //túi thì phải mở ra để lấy, gọi hàm chấm hàm()

        // đổi được 2 thằng thì đổi được cả giỏ,2 vòng for
        Student tmp = arr.get(0); //tmp trỏ cùng An 9.0
        arr.set(0, arr.get(1)); // con trỏ thứ 0 trong giỏ, phải trỏ thằng BINH 4.9
        arr.set(1, tmp);
        //con trỏ 1 thay cách trỏ, trỏ vào vùng tmp đang trỏ
        //                        tmp đang trỏ AN 9.0
        //vùng new Student() vẫn nằm in, chỉ có thẻ bài trong giỏ
        //trỏ lại vùng new

        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        arr.remove(1); // Xoá An vì đã hoán đổi Bình cho An
        System.out.println("The student list after removing a student");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }

    }


    public static void playWithArrayList() {
        //Student[] arr = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ,500 món đồ có thể bỏ vào
        //món đồ phải đi mua ,new,thảy vào
        //tên mảng chính là má mì,quản lý nhiều đồ, tên túi luôn

        // List arr = new ArrayList(); //Đựng lộn xộn đủ loài con trỏ
        //đúng nghĩa túi Doremon, món gì cũng đựng,dựng tham chiếu thôi
        //nhét được NhanVien,GiangVien,Animal,Dog,...

        //túi đồng nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList();// túi đựng đồng nhất 1 loại GENERIC
        // cách viết 2: List<Student> arr = new ArrayList<>();
        // cách viết 3 : List<Student> arr = new ArrayList<Student>();
        //arr là 1 cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét đồng nhất món đồ dễ chấm chung được,đa hình đc

        //MỞ NGĂN TỦ(TÚI),NHÉT ĐỒ VÀO
        //arr[i] = new Student(....) //mảng
        //arr.add(new Student(...)) // lưu con trỏ thôi,new Student() thoải mái bên ngoài vùng HEAP

        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        arr.add(s1); // giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        arr.add(s2); // sinh ra thêm con trỏ nữa [1]
        // add() vô tận , mảng [ lengh - 1 ] hết mức
        // new cứ nằm trên HEAP, SV cứ ở nhà
        //add() mở khoá kéo,khoá dây, nhét đồ vào,nhét tham chiếu,thẻ bài
        // sinh ra con trỏ
        arr.add(s1); // add trùng nè 1 tên người vào danh sách
        //Set ko báo lỗi , chỉ lấy 1 thôi...đừng đi vào chi tiết vội!!!

        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.0));
        //          new cứ lên HEAP mà nằm, Bệnh nhân cứ về phòng, tớ nắm thẻ bài
        //1 con trỏ nữa lại đc add vào

        //hỏi xem túi đang có bao nhiêu đồ
        //arr.length hỏi túi mà,hỏi má mì mà,tên mảng mà
        System.out.println("The bag has: " + arr.size() + " món đồ");
        //4 Student sinh ra,những thực ra chỉ có 3 sv,do có người đến trùng

        // in mọi người ra
        //tủ có gì,chứa bên trong 1 đống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList [con-trỏ1,con-trỏ2,con-trỏ3,...nếu add() thêm)
        //add() đẩy vào 1 con trỏ , toạ độ,thẻ bài
        //get(vị trí thẻ bài muốn lấy),trả về toạ độ con trỏ thứ i
        //                             trả về địa chỉ vùng new đang trỏ
        //[i] lấy đc tham chiếu bạn thứ i
        //get(i) lấy đc chỗ ngồi tham chiếu thẻ bài thứ i
        //a,thẻ này trỏ bạn sv kia kìa

        //in bạn đầu tiên
        //arr[i].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0);  // trả về toạ độ con trỏ của bạn thứ 0
        //trả về toạ độ gán vào biến Student khác nắm cùng toạ độ là oke
        System.out.println("The student list");
        xxx.showProfile();

        //bạn 1 get(1),có toạ độ chấm luôn cho rồi,thêm biến con trỏ
        // trỏ cùng làm gì
        arr.get(1).showProfile(); // trả về con trỏ 7 viên ngọc rồng

        System.out.println("In xịn sò");
        for (Student x : arr) { // ko sợ NULL PONTER add() đến đâu thêm con trỏ đến đó
            // x = arr.get(i) = arr[i]
            x.showProfile();
        }
        System.out.println("In xịn xò truyền thống");
        for (int i = 0; i < arr.size(); i++) { //size luôn trả về kích thước
            // arr[i].showProfile(); không chơi như này
            arr.get(i).showProfile();
        }
        //có hành động xoá 1 con trỏ , loại bỏ 1 thẻ bài,món đồ
        //gạch tên 1 người khỏi danh sách,
        //vùng new Student() mất hay ko tuỳ vào mấy con trỏ trỏ nó
        //size() giảm liền , mảng ko có,fix cứng số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác( get() hàm set() xưa nay của các object

    }

}
