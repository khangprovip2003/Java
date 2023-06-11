package data;

import java.util.*;

public class Shelf {
    //Tủ sẽ có nhiều ngăn chứa được nhiều món đồ. Ta xài mảng,ArrayList,Collections nói chung
    // để lưu nhiều đồ
    //từ từ các bạn sv đến nhập học , nộp hồ sơ, và ta cất vào tủ arr
    private List<Student>arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    //làm biếng làm phễu luôn, mọi thứ sẽ default, Túi từ từ đc add() vào
    // ko chơi trò mua cái tủ có sẵn luôn 1 cái Túi, trong Túi có sẵn hồ sơ!!!
    //nếu muốn làm, thì new sẵn túi bên ngoài,có sv sẵn đưa vào trong tủ

    //default/empty constructor. Ko làm gì cả
    public Shelf() {

    }
    // hành động của tủ là thêm hồ sơ, tìm hồ sơ, sắp xếp hồ sơ, xoá hồ sơ, update hồ sơ
    public void addAStudent(){

        String id,name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" +( arr.size() + 1) + " ");
        //DÙNG LẠI HÀM SEARCH ĐỂ KIỂM TRA COI ID ID HỒ SƠ SV MỚI LIỆU RẰNG CÓ CHƯA
        // CẦM TRÙNG ID-BÊN DATABASE LÀ PRIMARY KEY- KHOÁ CHÍNH CẤM TRÙNG
        //TƯƠNG ĐƯƠNG ĐĂNG KÝ MEMBER,LOGIN NAME,ACCOUNT NAME CHỬI TRÙNG KO CHO ĐI TIẾP
        // CÒN TRÙNG LÀ CÒN CHỬI, KO CHO ĐI TIẾP-VÒNG LẶP


        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();
            // trim(): cắt khoảng trắng dư/ toUpperCase(): ĐỔI QUA HOA
            //String là object, là vùng new ( học sau)
            Student xxx = searchAStudent(id); // id vừa gõ kiểm tra liền
            if (xxx == null) //id ko tồn tại  trong giỏ, thoát,đi tiếp
                break;
            else
                System.out.println("Duplicated id. Try with another one!!!");
        };
        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
            // chống trôi lệnh
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        arr.add(new Student(id,name,yob,gpa));
//        Phần "new Student(id,name,yob,gpa)" tạo ra một đối tượng học sinh mới và truyền bốn tham số cho constructor của lớp Học sinh, chúng là "id", "name", "yob" (năm sinh) và "gpa".
//
//                Phương thức "arr.add()" sau đó thêm đối tượng học sinh mới vào cuối danh sách mảng "arr".
//
//                Chung cấu, dòng code này tạo ra một đối tượng học sinh mới và thêm nó vào danh sách mảng "arr", nó được sử dụng để lưu trữ một tập hợp các đối tượng học sinh.
        System.out.println("The new student has been added successfully");
    }

    public void printfAStudentList(){
        if(arr.isEmpty()){
            System.out.println("The student list is empty.Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + "student(s)");
        for (Student x : arr){
            x.showProfile();
        }

    }
    // ta làm hàm tìm kiếm sv : đóng 2 mục đích:
    //1.phục vụ tính năng tìm 1 sv theo id
    //2.phục vụ thêm cho cái việc kiểm tra id có trùng hay ko khi tạo mới
    //  1 hồ sơ sv
    // hàm search() có 2 cách trả về : trả về  vị trí tìm thấy trong Túi/int pos
    //                                 trả về 1 object/toạ độ của object/tham chiếu
    public Student searchAStudent(String id){
        if (arr.isEmpty()){
            return null;
        }
        for ( int i = 0 ; i < arr.size(); i++){
            if(arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        } // nếu thấy sv, trả ngay cái thẻ thứ i tham chiếu vùng new có chứa id tìm thấy

        // đi hết cả for ko rẽ ở trên, sure ko tồn tại
            return null;
    }

    // hàm bao hàm search ở trên
    public void searchAStudent(){
        String keyword;
        System.out.print("Input the id to search: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);
        if(xxx == null){
            System.out.println("NOT FOUND!!!");
        }else{
            System.out.println("FOUND.Here she/he is");
            xxx.showProfile();
        }
    }
    //cách2
    public void updateAStudent(Student x , double newGPA){
        x.setGpa(newGPA);
    }
// cách 3
//    public void updateAStudent(String id , double newGPA){
//        Student xxx = searchAStudent(id);
//        if (xxx == null){`
//            System.out.println("NOT FOUND!!! Nothing to update");
//            return;
//        }
//            //xxx.setGpa(newGPA);
//            updateAStudent(xxx,newGPA);
//    }
        public void updateAStudent(){
        String keyword;
        //double newPrice ; //CHỬI NHIỀU SV, GIÁ TIỀN KIỂU INT???????
        double newGPA;
        System.out.print("Input the student id to update info: ");
        keyword = sc.nextLine();
        Student xxx = searchAStudent(keyword);

        if(xxx == null){
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
        }else{
            System.out.print("Input a new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            updateAStudent(xxx,newGPA);
        }
    }
// cách 1
//    public void updateAStudent(){
//        String keyword;
//        //double newPrice ; //CHỬI NHIỀU SV, GIÁ TIỀN KIỂU INT???????
//        double newGPA;
//        System.out.print("Input the student id to update info: ");
//        keyword = sc.nextLine();
//        Student xxx = searchAStudent(keyword);
//        if(xxx == null){
//            System.out.println("NOT FOUND! NOTHING TO UPDATE");
//        }else{
//            System.out.println("FOUND.Here she/he is before updating");
//            xxx.showProfile();
//            System.out.print("Input a new gpa: ");
//            newGPA = Double.parseDouble(sc.nextLine());
//            xxx.setGpa(newGPA);
//            System.out.println("The student profile after updating new gpa");
//            xxx.showProfile();
//        }
//    }
}
