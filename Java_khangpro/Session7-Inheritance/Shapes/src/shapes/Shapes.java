package shapes;
import data.*;
public class Shapes {
    public static void main(String[] args) {
        sortShapesWithAnonymous();
        //sortShapes();
        //playWithAnonymousClass();
    }

    public static void sortShapesWithAnonymous(){
        //Anonymous here!!!
        Shape onTheGo = new Shape("THÍ-TUI","RANDOM","RANDOM") {
            @Override
            public double getArea() {
                // cắt hình ngẫu nhiên , ko gọi là hình gì,S phải tự đo
                return 50;
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                System.out.printf("|TAKE-AWAY |%-10s|%-10s|%-10s| -  | -  |%7.2f|\n",
                        owner,color,borderColor,getArea());
            }
        }; //VIP


        Rectangle r1 = new Rectangle("TÍA","PINK","MAGENTA",5.0,6.0);
        Shape r2 = new Rectangle("TÍA","PINK","MAGENTA",6.0,5.0);

        Square s1 = new Square("MÁ","PINK","MAGENTA",7.0);
        Rectangle s2 = new Square("MÁ","PINK","MAGENTA",8.0);
        Shape s3 = new Square("MÁ","PINK","MAGENTA",9.0);

        Disk d1 = new Disk("BÉ NA","RAINBOW","RAINBOW",2.0);
        Shape d2 = new Disk("BÉ NA","RAINBOW","RAINBOW",1.0);

        Shape arr[] = new Shape[]{ r1,r2,s1,s2,s3,d1,d2,onTheGo };
                                                        // hình ngẫu nhiên vẫn là Hình
        System.out.println("The list pf shapes:");
        for (Shape x : arr) {
            x.paint(); // tính đa hình
        }

        //SẮP XẾP TĂNG DẦN THEO S
        for (int i = 0; i < 8 - 1 ; i ++){
            for (int j = i + 1 ; j < 8 ; j ++ ){
                if (arr[i].getArea() > arr[j].getArea()){
                    Shape tmp = arr [i];
                    arr[i] = arr[j] ;
                    arr[j] = tmp ;
                }
            }
        }
        System.out.println("The list pf shapes sorting ascending by area:");
        for (Shape x : arr) {
            x.paint();
        }
    }





    //kĩ thuật tạo object/vùng new mà ko cần khuôn cụ thể
    //dành cho những object vô định hình, ko có công thức để tính toán và nhân bản
    // ko có khuôn cố định , cắt hình ngẫu nhiên , ko phân biệt nhóm Con
    // Những vẫn phải chắc chắn là Hình: có nét , màu , cạnh , bề mặt
    // ko có công thức tính chung , nhân bản lại được nhanh chóng
    // HCN cắt nhanh chóng , hình ELIPSE nhanh , HBH nhanh
    // Hình cắt gấp khcus , mỗi Hình duy nhất , ko nhanh được , không có khuôn
    //OBJECT không thường quen sử dụng ( vãng lai) / làm / gặp
    // Dù là hình kiểu gì , công thức chung : NEW CHA/SUPER CHA + @OVERRIDE
    public static void playWithAnonymousClass(){
        //Shape vanglai = new NoName(...); // bên trong phải full code cho cha
        //Shape   x     = new HCN(..);     // bên trong có code HCN

        // CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO NHIÊU CẠNH MÀ ĐƯA VÀO
        //CHỈ ĐƯA ĐƯỢC MÀU, TẶNG AI, TÔ MÀU VÀ TỰ ĐO S , P LÀ ỔN , KO CÓ CÔNG THỨC
        //NẾU MUỐN RÕ RÀNG THÌ CẮT V , TR ,CN ,TG,HBH, MŨI TÊN,...
        Shape vanglai = new Shape("HÌNH NGẪU NHIÊN","GREEN","BLUE") {
            @Override
            public double getArea() {
                return 50; // vì hình cụ thể , không theo hình dạng nào cả , ta tự đo
            }

            @Override
            public double getPerimeter() {
                return 40;
            }

            @Override
            public void paint() {
                // Khai báo là Con Shape vẫn kế thừa như bình thường
                System.out.printf("|NGẪU NHIỄN|%-10s|%-10s|%-10s|%7.2f|\n",
                        owner,color,borderColor,getArea());
            }
        }; // VIP
        // mày là 1 hình thoải mái vào mảng Shape nếu muốn
        // mày vẫn là Shape , kiểu Shape , có đủ code cho hàm Cha
        // kĩ thuật mượn gió bẻ măng , mượn Cha tạo Con , mượn Shape new Cha
        // NEW ABSTRACT  CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRIDE
        // THOẢ MÃN CÔNG THỨC CON = NEW CHA + @OVERRIDE
        // CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECT ON THE GO , MÀ LÀM BIẾNG
        // LÀM KHUÔN CON RIÊNG LẺ THEO CÔNG THỨC NHÂN BẢN
        vanglai.paint();
    }

    public static void sortShapes(){
        // sort cần mảng , mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TÍA","PINK","MAGENTA",5.0,6.0);
        Shape r2 = new Rectangle("TÍA","PINK","MAGENTA",6.0,5.0);

        Square s1 = new Square("MÁ","PINK","MAGENTA",7.0);
        Rectangle s2 = new Square("MÁ","PINK","MAGENTA",8.0);
        Shape s3 = new Square("MÁ","PINK","MAGENTA",9.0);

        Disk d1 = new Disk("BÉ NA","RAINBOW","RAINBOW",2.0);
        Shape d2 = new Disk("BÉ NA","RAINBOW","RAINBOW",1.0);

        Shape arr[] = new Shape[]{ r1,r2,s1,s2,s3,d1,d2 };
        System.out.println("The list pf shapes:");
        for (Shape x : arr) {
            x.paint(); // tính đa hình
        }
            //GỌI HÀM PAINT() của Cha , Những 3 con tự động qua mặt
            //Chút lo lắng : PAINT() Cha éo cod CODE,ABSTRACT
            //Đừng lo , vì lát mấy đứa con nó lo , Do mình new con
            // New con thì con đã viết code rồi , Cha ngồi im
            //Con giải quyết chuyện hoàn hảo cho Con
            // Từ hàm Cha gọi,Con hưởng ứng , N con hưởng ứng
            // Từ 1 ánh xạ ra nhiều cách thức , Tính đa xạ đa hình ( POLYMORPHISM )

        //SẮP XẾP TĂNG DẦN THEO S
          for (int i = 0; i < 7 - 1 ; i ++){
              for (int j = i + 1 ; j < 7 ; j ++ ){
                  if (arr[i].getArea() > arr[j].getArea()){
                        Shape tmp = arr [i]; // đa hình : getArea của Cha
                        arr[i] = arr[j] ;    // abstract ,đừng lo ,Con sẽ lo
                        arr[j] = tmp ;       // vì [i] luôn trỏ 1 hình cụ thể
                  }                          //        getArea() là cụ thể
              }
          }  // arr[i] đang trỏ 1 hình S là ?
             // arr[j] đang trỏ 1 hình S là ?
             // so sánh 2 S có ổn ko , ko ổn thì đổi việc trỏ
             // arr[i] phải trỏ  vào thằng hình mà arr[j] đang trỏ
             // mày trỏ vào S mà không đúng thứ tự thì phải đổi trỏ
        System.out.println("The list pf shapes sorting ascending by area:");
        for (Shape x : arr) {
            x.paint();
        }



    }


}
