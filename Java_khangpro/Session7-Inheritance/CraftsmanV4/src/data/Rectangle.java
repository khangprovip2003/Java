package data;

//1. Thấy có cái IS A,

//2. Đặc điểm cho Con, đồng nhất ( Cha lo cho Con) hoặc dị biệt, Con có riêng

//3. Phễu, tôn trọng bản sắc

//4. Vì Cha là abstract chỉ nói chưa có làm,chung chung thôi
//   Nếu con không chịu làm thì , tức là Con trong tình huống này phải là abstract luôn
// 1 CLASS CHỨA HÀM ABSTRACT KO CODE , THÌ CLASS ĐÓ PHẢI LÀ ABSTRACT
//  VÌ NÓ TOÀN NÓI CHUNG CHUNG , DÙ BÊN TRONG NÓ VÀI HÀM CÓ

//CON thừa kế abstract class, mày có 2 lựa chọn
// - Hoặc mày abstract , nếu mày ko chịu viết code cho CHA , thừa kế abstract
                          //   vậy mày là khái niệm luôn còn gì!!!
// - Hoặc mày phải viết code cho hàm abstract của CHA , vì mày đủ info để làm
// mày là cụ thể rồi , vì mọi thứ trong mày là rõ ràng
// CON viết code cho hàm CHA, CHA nói CON làm , IMPLEMENT ABSTRACT METHODS
// implement the body of Parent'abstract methods
//Cha đã nói ý tưởng , Con hiện thực thôi
// Con làm biếng, mày giống Cha abstract , đời cháu cũng thế...
// mãi mãi là nói không làm --> hệ quả gì?

//public abstract class Rectangle extends Shape{
//Vô sinh -> không thể NEW được 1 object cả CHA và CON , vì cả 2 không có code
// Không sinh được object do khuôn không hoàn hảo!!!!!!!!!!!!


public  class Rectangle extends Shape{

    protected double a,b;  // kết hợp với phần làm biếng/extends từ Cha
                         // sẽ tái hợp đầy đủ như chưa có kế thừa


    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor); //Cha phải có trước, làm cánh chim
                                          // Con bay xa,extends, dễ bố trí Ram
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                           owner,color,borderColor,a,b,getArea());
    }


}
