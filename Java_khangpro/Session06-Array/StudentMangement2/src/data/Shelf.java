package data;
import java.util.Scanner;
public class Shelf {
    private String color;
    private String label;

    // đặc điểm chính cần focus
    // dung lượng, không gian chứa của cái tủ là bao nhiêu ???
    // nhiều cách khác nhau
    //1. đóng sẵn kích thước
    //2. theo yêu cầu ( đưa ra yêu cầu,đưa vào phễu ( constructor))
    private Student [] arr = new Student [500]; // sẵn kích thước
                        // logic mảng: cần có kích thước,chứa chỗ sẵn
                        // value từng phần tử , từng  món đồ từ từ tính

    // khi chơi với mảng , phải biết for đến đâu ,coi chừng null pointer
    // add vào từ từ trái sang phải
    // ta cần biến count nói về số lượng đang có trong mảng
    // sure non static
    private int count = 0 ;

    private Scanner sc = new Scanner(System.in);


    //NON-STATIC cho những đặc tính trên

    // constructor làm những việc gì : đổ info vào
    // đổ màu sắc , tủ dùng cho việc gì ( label)
    // đặt hàng dung lượng chứa, hoặc fix dung lượng
    //CÂU HỎI: Sao em không đưa hồ sơ thật của sinh viên vào
    // mua tủ về phải trống , nhét hồ sơ thật vào từ từ hợp lý hơn
    // nhét ngay 1 lần hết hồ  vào tủ là không thực tế
    // bỏ hồ sơ vào tủ thực sự được lặp đi lặp lại nhiều lần với tủ
    // hàm thêm hồ sơ nằm ở trên cái tủ là hợp lý : ai có nhiều info , kẻ đó xử lý
    //
    public Shelf(String color, String label ) {
        this.color = color;
        this.label = label;
       // this.count = 0; // mới mua tử thì chưa có có hồ sơ cụ thể
        // có thể đưa qua con đươngf phễu , những không hay , vì đây là thứ người dùng
        // khi mua tủ không cần biết , họ chỉ cần biết dung lượng tối đa
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

   // hành động add mới hồ sơ sv lặp lại cho mỗi cái tủ , 1 cái kệ, app dk member
    public void addAStudent(){
        // chơi for vỡ mặt , phải là từ từ , vì nó sẽ được liên tục bổ sung
        // theo quy trình công ty , cách bạn làm với cái tủ
        String id , name;
        int yob  ;
        double gpa ;
        System.out.println("Input student #" + (count + 1) + "/" + arr.length);
        System.out.println("Input id: ");
        id = sc.nextLine();     // TODO: tên rỗng // CHECK TRÙNG ID
                                //  còn trùng còn nhập lại
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.println("Input gba: ");
        // gpa = sc.nextDouble();   // trôi lệnh thằng thứ 2
        gpa = Double.parseDouble(sc.nextLine());

        arr[count] = new Student(id, name, yob, gpa);

        count ++; // đã add xong 1 hồ sơ thì phải sẵn sàng vị trí kế tiếp
        // bao nhiêu lần mở tủ add hồ sơ , bây nhiêu lần count tăng lên
    }

    public void printStudentList2(){
        System.out.println("There is/are "+ count + " student(s) in the list ");
    //    for (Student x:arr){
    //        x.showProfile();
        for (int i =0;i<count;i++)
            arr[i].showProfile();
        }
    public void searchtudent(){
        // đưa id vào từ bàn phím , tìm sv theo id
        // for từ đầu đến count của mảng , lôi từng sv ra hỏi, mã số sv là gì?
        // so sánh id gõ vào, == nhau thì done , tìm ra sinh viên ở vị trí i
        String id;
        System.out.println("Input student id that you want to search: ");
        id = sc.nextLine();
        for(int i = 0; i < count; i++){
            if (arr[i].getId().equalsIgnoreCase(id) == true){ // trả về chuỗi,chuỗi là object,object có quyền chấm tiếp
                // equalsIgnoreCase() so sánh không phân biệt hoa thường
                System.out.println("Student found!!! Here she/he is");
                    arr[i].showProfile();
                    return; // thoát hàm luôn ,vì mã số sinh viên duy nhất ,thấy rồi
                            // không còn ai để for thêm làm gì
            }
        }
        System.out.println("Student not found!!!");
    }


    }


