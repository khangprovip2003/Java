/*
MAP

public class Student{
    private String id;

    private int yob;

    private  Integer yob; // tốn ram hơn

}

Map<Integer, String>

Map<int, String> // éo chơi


class TRAI BAO - WRAPPER CLASS (BOXING/UNBOXING)

OOP/JAVA CHÍNH LÀ OOP

* MỌI THỨ TRONG CODE JAVA PHẢI LÀ OBJECT!!!
hiện nay Java có 2 loại data type: PRIMITIVE vs .OBJECT

PRIMITIVE: byte,short,int,long,float,double,char,boolean
8 kiểu dữ liệu nguyên thuỷ
int yob = 2003; // tốn đúng 1 vùng RAM 4 byte ONOFFONOFF TRANS để
                   ra đc 2003

OBJECT: kiểu đối tượng, trong nó phức tạp hơn, ko chỉ là value lấy ra
        xài luôn
        tốn 2 vùng ram. 1 con trỏ/biến obj = new Object nào đó
                        lưu toạ độ vùng new      ( một loạt value khác)
        Scanner,Math,String,                Dog,Cat,Racer,Cabinet,Shelf
        StringTokenizer,File,FileInputStream
        bên trong class từa lưa info + hàm()

TÌM CÁCH BIẾN JAVA THUẦN 100% OBJECT!!!
số 1 2 3 4 5 6 7 8 -9 -10 int

- mô tả/đặc điểm:
    - giá trị/đại lượng : 1, 2
    - nguyên con, trọn vẹn ko lẻ miếng nào về giá trị
- mô tả hành động
    - 1 < 2
    - 3 > 0
    - so sánh các đại lượng của nhau
HOÁ RA CÁI ĐÁM Ở TRÊN CÓ CHUNG ĐẶC ĐIỂM LÀ KO LẺ MIẾNG NÀO, MANG GIÁ TRỊ CÒN
               SO SÁNH ĐƯỢC LẪN NHAU -> CHÚNG THUÔC NHÓM Interger
class Integer xuất hiện/ Nhóm những thằng ko lẻ miếng nào!!!!!
7 ĐỐI TƯỢNG TRÊN THUỘC NHÓM/CLASS INTEGER (Integer)
xuất hiện để nó bao cái value int lại thành object

Integer sẽ bao cái int lại, thành 1 object . Mọi thứ trong Java là object

public class Integer{
    private int value;

    public Integer(int value){
        this.value =
         value;
    }
    //get/set()

    // HÀM SIÊU ĐẶC BIỆT
    public static int parseInt(String num){

            biến chuỗi thành số để đem xài;
    }
}

int yob = Integer.parseInt(sc.nextLine());

//HỒ BƠI,POOR

//XÀI INTEGER THÌ SAO: CỰC KỲ LINH HOẠT, CÓ NHIỀU CÁCH
// CÂN NHẮC KHI XÀI INTEGER, KHI NÀO ĐÒI HỎI OBJECT THÌ MỚI DÙNG, VÌ TỐN RAM
//KO ĐẶC BIỆT GÌ CẢ int cho tiết kiệm ram, nhanh

int yob = 2003 //4 byte trong ram

Integer yob = new Integer(2003); //
Integer yob = 2003; //new ngầm, vẫn new những ko viết ra
                    //BOXING, ĐÓNG HỘP THẰNG PRIMITIVE/LITERAL

int a = yob; //thì sao??. 1 thằng là con trỏ, 1 thằng primitive
         //MỞ VÙNG RAM BỰ INTEGER RA, LÔI ĐÚNG VALUE INT RA XÀI
         //UNBOXING


//KHI THIẾT KẾ COLLECTIONS FRAMEWORKS, CÁC GIỎ Ở ĐÂY CHỈ CHƠI VỚI OBJECT
List<Integer>arr = new ArrayList(); //okie
List<int>    arr = new ArrayList(); // đéo cho, bố chỉ chơi với con trỏ
//Giỏ tao chỉ đựng object/con trỏ.int vào tao ko chịu
//Tao chỉ chơi với Integer

số 0.1 3.14 9.8, 10% float/double

PHÀM NHỮNG THỨ QUANH TA MÀ GOM NHÓM , ĐẶT TÊN CHUNG CHO NHÓM ĐC
THÌ XUẤT HIỆN NHÓM/KHUÔN/CLASS/PHÂN LOẠI


 */