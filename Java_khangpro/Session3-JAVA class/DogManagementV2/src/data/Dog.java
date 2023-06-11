package data;

public class Dog {
    public  String name;
    private int yob;
    private double weight;
    public Dog(String name,int yob,double weight){
        this.name = name ;
        this.yob  = yob ;          // khi nào xung đột thì dùng this
        //weight = this.weight  ;  //  sai về ngữ nghĩa những không sai cú pháp
        this.weight = weight;
    }


    // ta chủ động đưa nhiều info của ta ra
    public void bark (){
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                    name,yob,weight);
    }


    public void setNewWeight(double weight){
        this.weight = weight ;
    }
    public int getYob (){
        return yob;  // return this.yob cũng được không ảnh hưởng
    }
///////////////////////////////////////////////////////////////////////////////
//    // dùng tool của máy tạo phễu ( constructor )
//    public Dog(String name, int yob, double weight) {
//        this.name = name;
//        this.yob = yob;
//        this.weight = weight;
//    }
//
//    public String getName() {
//        return name;
//    }
//  // dùng tool của máy ( general and set)
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getYob() {
//        return yob;
//    }
//
//    public void setYob(int yob) {
//        this.yob = yob;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//

// 1 object bất kỳ có nhiều info mô tả , ví dụ : xem điện thoại trên thế giới di động có nhiều thông tin
    // đầy đủ thông số : ngày xuất bản, mã số, ....
// gặp chú CSGT, show ra các info mình có : CCCD, Driver lic,....
// việc show info của 1 object là tự nhiên, và đó là 1 hành động nên có của mỗi object,mô tả , đặc tả về object
// hành động đó có thể do ta chủ động được đưa ra, hoặc tự generate theo template có sẵn
// template có sẵn JAVA giúp mình, mình không phải code.


    @Override      // khác với overload , dính đến kế thừa
                   // cả 2 đều liên quan đến 1 khái niệm là POLYMORPHISM - 50 sắc thái // tính đa hình
    public String toString() {          // không được thay đổi tên hàm ( mặc định )
                                        // hàm này show tất cả thông tin ra ( dùng tool ) y chang hàm trên bark
    // cách 1    //return "Dog{" + "name='" + name + '\'' + ", yob=" + yob + ", weight=" + weight + '}';
        // độ lại được quyền , vì chỉ cần trả chuỗi chứa info của mình
        // y chang mình làm card visit

    // cách 2     //String tmpMsg = String.format("|%-10s|%4d|%4.1f|",
                 //                               name,yob,weight) ;   // y chang như printf
                 //return tmpMsg;                                       // trả về chuỗi thô không xuống hàng

    //cách 3
                return String.format("|%-10s|%4d|%4.1f|",
                                                       name,yob,weight) ;

    }
    // hàm gắn việc xử lý info của chính object. Ai giàu info, gã đó nên xử lý
    public int getAge(){
        return  2021-yob ;
    }
    // viết code kiểu này gọi là hard-code, fix value , năm sau phải sửa code thì tuổi mới đúng được
    // chuẩn : lấy giờ hệ thống Windows - yobs ;


}







