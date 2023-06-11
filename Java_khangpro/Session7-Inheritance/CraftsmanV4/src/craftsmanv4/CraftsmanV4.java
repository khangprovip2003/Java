package craftsmanv4;
import data.*;

public class CraftsmanV4 {
    public static void main(String[] args) {
    //    playWithShapes();
        sortShapes();
    }

    public static void sortShapes (){
        Rectangle r1 = new Rectangle ("TÍA","PINK","MAGENTA",5,6);
        Shape r2 = new Rectangle ("TÍA","MAGENTA","PINK",6,5);

        //con vs con
        Square s1 = new Square("MÁ","PINK","MAGENTA",7);
        //bố vs con
        Rectangle s2 = new Square("MÁ","PINK","MAGENTA",8);
        // ông nội vs cháu
        Shape s3 = new Square("MÁ","PINK","MAGENTA",9.0);



        Disk d1 = new Disk("BÉ NA","RAINBOW","BLU",":>",6);
        Shape d2 = new Disk("BÉ NA","RAINBOW","BLU",":<",6);

        Triangle t1 = new Triangle("GHỆ BÉ NA","RAINBOW" , "Blue",3 , 4,5);
        Shape t2 = new Triangle("GHỆ BÉ NA","RAINBOW" , "Blue",6 , 8,10);

        // ta có thể khai báo 9 hình này đều là SHAPE, cực đep khi nhìn đội hình đồng nhất
        //In kết quả trước khi sort diện tích

        // Hàm của ??? chạy thế nào ???
        r1.paint(); // CON -> CON
        r2.paint(); // CHA -> CON, @OVERRIDE

        s1.paint(); // CON -> CON
        s2.paint(); // CHA -> CON
        s3.paint(); // ÔNG NỘI -> CHÁU

        d1.paint(); // CON -> CON
        d2.paint(); // CHA -> CON

        t1.paint(); // CON -> CON
        t2.paint(); // CHA -> CON

    // PAINT() Ở ĐÂY CỰC HAY:
    // CHỈ CÓ 1 HÀM PAIN() NHỮNG CÓ ĐA DẠNG CÁCH VIẾT CODE
    //LÚC CHẠY ĐA DẠNG LUÔN, LÚC CHẠY TRÒN, CHỮ NHẬT , TAM GIÁC
    // cùng hàm cha, ông nội, tuỳ cách khai báo , những đám con cháu biết override đúng lúc
    // từ 1 hàm pain() ánh xạ/ chiếu ra N cách viết code/implement khác nhau
    // thực thi ( chạy ) theo N cách khác nhau
    // từ 1 biến hoá ra nhiều, từ 1 có đa hình dạng, đa ánh xạ cách làm cách chạy
    // từ 1 biến hình tranformer, đa nhân cách 50 sắc thái , từ 1 ra nhiều
    // KỸ THUẬT VIẾT CODE TỪ 1 HÀM CÓ N CÁCH THỂ HIỆN CHẠY KHÁC NHAU
    // KỸ THUẬT NÀY GỌI LÀ TÍNH ĐA XẠ , ĐA HÌNH , POLYMORPHISM

    //HAY HƠN NỮA, CHÚNG MÀY VÀO MẢNG GIÚM TAU ĐỂ TAU FOR, TAU SORT
    //MẢNG SHAPE AGAIN

//    Shape[] box = new Shape [9] ; // 9 biến Shape
//        // box [0] box 1 ... là các biến Shape cần trỏ vùng new con mẹ gì đó
//        //                               new Rectangle() new Disk new Square(),...
//        //box [0] = new Rectangle();   đúng những không hay
//        box [0] = r1; // 2 chàng 1 nàng
//        box [1] = r2;
//        box [2] = d1;
//        //.........

        //Shape box [] = new Shape[]{new Disk(),new Rectangle() }

        Shape box[] = new Shape[] {r1,r2,s1,s2,s3,d1,d2,t1,t2};
        System.out.println("The list of Shape");
        for (Shape x : box){
            x.paint();
            // Đa hình siêu đẹp
            // 1 ra nhiều cáh thực thi, đa hình , đa xạ
        }
            // Cha chỉ nói PAINT() anh em nhào vô
    }

    public static void playWithShapes(){
        Rectangle r1 = new Rectangle ("TÍA","PINK","MAGENTA",5,6);
        Shape r2 = new Rectangle ("TÍA","MAGENTA","PINK",6,5);

        Disk d1 = new Disk("MÁ","PINK","MAGENTA",":>",6);
        Shape d2 = new Disk("MÁ","MAGENTA","PINK",":<",6);

        r1.paint(); //   hàm của CON , RECTANGLE
        r2.paint(); //   hàm của CHA,khi chạy thì qua mặt CHA,RECTANGLE, Cha còn ko có code kia kìa
        d1.paint(); //   hàm của CON , DISK
        d2.paint(); //   hàm của CHA, qua mặt CHA, ưu tiên CON
                    // new CHA thì sao? , Bàn vụ này sau ( KHÓ!!!)
                    // Do code Cha không hoàn hảo , không đầy đủ

        ((Rectangle)r2).getArea(); // dị biệt

        // .Pain() chính là tính ĐA HÌNH ( POLYMORHISM ) đã xuất hiện
    }





}
