package data;

import java.util.Scanner;

public class Shelf {
    // đặc điểm cua 1 cái tủ là gì : màu sơn , giá tiền , nhà sx,
    // đặc biệt số ngăn/không gian chứa đồ:___các món đồ nhét vào, món đồ là object
    // chứa nhiều đồ , nhiều object rõ ràng đến thời điểm này là ta cần mảng object
    // tủ sẽ chứa 1 list/mảng/danh sách tạo dựng nên object khác
    //OOP; tìm các object,chúng phối hợp , trộn nhau
    private String color;
    private String lable; //  tủ chén,tủ hồ sơ SE,IA,GD,JP

    //chứa cái gì
    private Student [] ds = new Student [300];
    private Scanner sc = new Scanner (System.in);
    private int count = 0; // mới mua tủ về ,số hồ sơ = 0
                           // nhét thêm 1 hồ sơ thì count++
                           // chơi với mảng chỉ for đến count
    // tui có không gian chứa info, tui sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String lable ) {
        this.color = color;
        this.lable = lable;
    }

    public void inputAstudent(){

        String id , name;
        int yob ;
        double gpa ;
        // for nhập 5 hồ sơ
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.println("Input id: ");
        id = sc.nextLine();
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.println("Input gba: ");
            // gpa = sc.nextDouble();   // trôi lệnh thằng thứ 2
        gpa = Double.parseDouble(sc.nextLine());

        ds[count] = new Student(id, name, yob, gpa);
        count++; // SIÊU VIP
    }

    public void printStudentList(){
        System.out.println("The student list ");
        for (int i = 0;i < count ; i++){
            ds[i].showProfile();    // For hết là toang
        }
    }

}
