package data;

public class Student {
    // public và private gọi chuẩn là instance variablevalue ( đặc điểm của đối tượng)
    // public và private lưu trữ, chia sẻ thông tin 1 object, chỉ được dùng để mô tả 1 object
    // private String id;
    // public String name;
    private  String id;    // static không được gắn phễu , chỉ gắn hàm và biến ( gắn kèm với object)
    // nằm ở vùng nhớ riêng, mà object nào cũng sài ké,chung
    // vùng nhớ sài chung cho các object cùng class
    private  String name;    // nếu dùng static trường hợp này thì tên và mã số sv trùng nhau

    private int yob;          // được gọi là non-static( giữ nguyên sữ liệu được clone đúng)
    private double gba;  // grade point average
    //......
// làm phễu ( construct)
    public Student(String id, String name, int yob, double gba) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gba = gba;
    }
    // getter and setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGba() {
        return gba;
    }

    public void setGba(double gba) {
        this.gba = gba;
    }
    // toString


    @Override
    public String toString() {
        return String.format ("|%8s|%-25s|%4d|%4.1f|\n",
                id,name,yob,gba);
    }
    // dùng như này đẹp hơn
    public void showProfile(){
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n",
                id,name,yob,gba);
    } // NON-STATIC chơi với NON-STATIC (cùng  object), và STATIC

    public int getAge(){
        return 2021 - yob ;
    }


}
