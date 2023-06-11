import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // 3,Sắp xếp mảng
        //sortWithObjectArray2();
        //sortPrimitiveArray();
        //sortWithObjectArray();
        // playWithObjectArray();


        // 2,ARRAY object
        //playWithStudentArray();
        //playWithStudentObject();

        // 1,ARRAY PRIMITIVE

        // playWithPrimitiveArray3();
        //playWithPrimitiveArray2();
        //playWithPrimitiveArray();
    }

    // Sắp xếp MẢNG
    public static void sortWithObjectArray2(){
        Student[] arr = new Student [2];
        arr[0] = new Student("SE123456 ","AN NGUYEN ",2001 ,9.0);
        arr[1] = new Student("SE123457 ","BINH NGUYEN ",2000 ,5.0 );
       // không dùng toán tử < > = cho các biến object
        // if ( arr[0] > arr[1]) // sai vì đây là 2 địa chỉ
       if (arr[0].getGpa() > arr[1].getGpa()){
           Student x = arr[0];
           arr[0] = arr [1];
           arr[1] = x ;
           for (int i = 0; i < arr.length;i++){
               arr[i].showProfile();
           }
       }

    }

    public static void sortPrimitiveArray(){
        int a = 9;
        int b = 5;
        // in a trước, in b sau , giảm dần 9 5
        // tui muốn tăng dần value 5 9
        System.out.println("a: " + a + " | b: "+b);
//        a = b;
//        System.out.println("a: " + a + " | b: "+b);
        // backup a 9 trước khi a chơi với 5 để tránh mất dữ liệu 9
        // chỉ đổi , sắp xếp khi bị lộn xộn a>b l xộn tăng dần
        // if (a>b) thì mới swap
       if (a>b) {


           int tmp = a; // temporary,temp,tmp  ( tmp giữ value 9 của a)
           a = b;
           b = tmp;
       }
    }


    public static void sortWithObjectArray(){
        Student[] arr = new Student [2];
        arr[0] = new Student("SE123456 ","AN NGUYEN ",2001 ,9.0 );
        arr[1] = new Student("SE123457 ","BINH NGUYEN ",2000 ,5.0 );
       //  arr[0] = arr[1] ; //new BÌNh đang được 2 con trỏ// output: arr[0] và arr[1] đều có value thằng BÌNH
                                                                // thằng AN mồ côi
        System.out.println("The student name");
        for (Student x : arr){

            x.showProfile();
        }
        // sắp xếp mảng tăng dần theo điểm trung bình ( so sánh gpa)
        System.out.println("After sort :");
        Student x = arr[0];
        arr[0] = arr [1];
        arr[1] = x ;
        for (int i = 0; i < arr.length;i++){
            arr[i].showProfile();
        }
        // sắp xếp mảng object , vùng new giữ nguyên
        // đổi cách trỏ [i] trong mảng
    }

    public static void playWithObjectArray(){
        Student[] arr = new Student [2];
        arr[0] = new Student("SE123456 ","AN NGUYEN ",2001 ,9.0 );
        arr[1] = new Student("SE123457 ","BINH NGUYEN ",2000 ,5.0 );
        System.out.println("The student name");
        for (Student x : arr){
            // x = arr[0] ; x = arr[1] // 2 chàng x và arr[0] cùng trỏ new AN NGUYỄN
                                       // 2 chàng x và arr[0] cùng trỏ new BINH NGUYỄN
            x.showProfile();
        }
    // sắp xếp mảng tăng dần theo điểm trung bình ( so sánh gpa)


    }

    // ARRAY OBJECT


    public static void playWithStudentArray(){
       // lưu hồ sơ sinh viên cả lớp
       //10 biến/tên tắt + 10 value phức tập ~10 nhát new
       // lưu 10 số tự nhiên
       //10 biến/ tên tắt + 10 value đơn
        int arr [] = new int [10]; // arr[0] ~ int x; arr [1] ~ int y
        Student    s1,   s2 ,  s3,   s4,  s5,  s6;// khai báo LẺ
        //        x[0]  x[1]  x[2]  x[3]
        // s1 ngoặc tròn


        Student list[] = new Student[3]; // đừng nhầm lẫn khi new , 2 loại ngoặc , ngoặc tròn
                                        // () gọi là phễu 1 object
                                        // [] dành cho nhiều tên , nhiều biến , nhiều tên gọi tắt
        // x chấm xổ ra length là biến mom quản lý các biến con ( không phải là 1 sinh viên)
        list[0] = new Student ("SE123456","AN NGUYỄN",2001,5.6);
        list[1] = new Student ("SE123457","BÌNH LÊ",2000,5.7);
        list[2] = new Student ("SE123458","CƯỜNG VÕ",1999,5.8);
        // những con trỏ còn lại mang giá trị gì ( biến student chưa gán)
        // list từ 3 -> 9  ???? o là DEFAULT
                            // Trỏ vào toạ độ 0 của RAM,địa chỉ 0 của
                            // BYTE đầu tiên trong RAM toàn là số OFOFOFOF
        // tức là byte đầu tiên ( thứ 0) toạ độ thứ 0 của ram chứa toàn số 0 gọi là byte NULL
        System.out.println("The list of student");
        for (int i = 0; i < list.length;i++){
            list[i].showProfile();
        }
        //s1 = null;  // có value rồi ,sôs 0, toạ độ o ở đáy RAM
        //s1.showProfile(); // out put : NULL PointerException

    //   NGUYÊN TẮC: khi chơi với mảng phải có biến COUNT để cho biết mảng đã gán value đến đâu,FOR đến đó
    //               không FOR đến . length, bị DEFAULT với PRIMITIVE, bị NULL với Mảng OBJECT
    }

    public static void playWithStudentObject(){
        Student x;// biến object // tớ chuẩn bị nói 1 đứa
         x = new Student("SE123456","KHANG NGUYEN",2001,5.6);
         x.showProfile();

    }


    // ARRAY PRIMITIVE

   public static void  playWithPrimitiveArray3()    {
       int arr1[] = {5,10,15,20}; // new ngầm , không nói rõ
       int arr3[] = new int []{5,10,15,20}; // giống cách trên
       int arr2[] = new int [5];

       int arr[] ;
       arr = new int [5];
       // có nhiều biến trùng tên rồi, sài từng biến theo yêu cầu
       arr[0]=5;
       arr[1]=10;
       arr[3]=15;
       // arr là 1 biến đặc biệt , là biến object , trỏ 1 vùng new
       // có quyền chấm , chấm gì? , tệ nhất .toString()
       // arr là biến phức tạp bởi vì nó có nhiều info ở bênt rong vì info này là cá phần tử của mảng
       // arr[0] ~~ arr.get ( thằng thứ 0) -> đc 5 / arr[0] đc 5
       // arr.length - lưu đặc điểm của 1 mảng , có bao nhiêu phần tử
       // -> arr.length là non-static / hằng số đặc biệt ăn theo từng mảng, mỗi mảng khác nhau ở kích thước
       System.out.println("Array has: "  + arr);
                                                // gọi tầm tên em , convert data của các biến thành mã HEXA
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
   // arr là biến con trỏ thằng nào public của vùng new  là chấm
   // arr[i] là primitive  không chấm được
       for(int  i : arr){
           System.out.print(i + " ");
       }
        // get() set() không có mà thay bằng chơi trực tiếp [] ngoặc vuông
       // thay đổi bên trong value bên trong biến
   }



    public static void playWithPrimitiveArray2(){
        // bên c;
        // float* arr = calloc (7,sizeof(float));

        double arr[] = new double[10]; // default gán hết = 0 ;
                      // new () là phễu để đúc object!!!!
        arr[0] =39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        System.out.println("The array has value of (for i)");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        // arr[0] chấm thì không xổ gì vì nó là biến primitive
        // arr.length chấm thì xổ được vì nó là biến object,con trỏ ,REFERENCE

        System.out.println("\nThe array has value of (for i)");
        for (double x : arr)
            System.out.print(x+ " ");
    }


    public static void playWithPrimitiveArray(){
        //double vol [365]; // java cấm khai báo kích thước mảng ,số phần tử
        // double v[365] = {0,0,5,20} // java cấm khai báo như này
        float v [] = {0,0,5,10,15,20,25 }; // mảng có 7 phần tử, có sẵn value
        // 7 biến float v[0] = 0; v[1] =0, v[2] =5 ,...
        // 7 biến float nằm trên HEAP , có new ngầm , có malloc ()
        System.out.println("The array has value of (printed by individual)");
        v[0] = 6868;
        System.out.println(v[0] + "; "+ v[1]+"; "+ v[2] + "; ");
        for(int i =0;i<7;i++){
            System.out.print(v[i] + " ");
        }
        //ta có thể xem mảng như tập hợp các value ( như MATH)
        // ta có thể xài khái niệm với mọi,mỗi để duyệt qua toàn bộ mảng
        System.out.println("\nThe Array v has values of (using for each)");
        // với mọi x là một con số tự nhiên đang muốn lấy từng phần tử của tập hợp v
        for (float x : v) {
            // x =v[0] , x = v[1] , x = v[2] , x = v[i] với mọi x là 1 biến lẻ , bằng từng thẳng lẻ trong mảng sỉ
            // sout (v[i]) ~~ sout (x)
            System.out.println(x + " ");
        }

    }

}