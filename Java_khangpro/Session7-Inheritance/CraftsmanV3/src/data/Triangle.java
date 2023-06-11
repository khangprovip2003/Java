package data;

public class Triangle {
    protected String owner;
    protected String color;
    protected double a,b,c;

    // nếu e đổ a,b,c không thoả 1 tam giác , tổng 2 cạnh bất kỳ > cạnh còn lại
    // nếu đổ không ra tam giác thì phải làm sao? ( cạnh 3,4,9)
    // có 2 cảnh phổ biến
    // cà chớn tao đưa default
    // cà chớn tao đưa default 3 4 9 -> 3 4 5
    // ném ra ngoài lệ , chủ động giết app , vì tam giác cà chớn không xử lý


    public Triangle(String owner, String color, double a, double b,double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" + "owner='" + owner + '\'' + ", color='" + color + '\'' + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }

    // có 1 bộ thư viện , đồ chơi , class khác đưa vào dùng kèm , giống sài Scanner>>
    // giúp không cần làm thao tác ở trên , tự nó làm giùm , mình chỉ viết mấy câu code ngắn
    // mà có hết đám này , thư viện mang tên LOMBOK
    public double getPerimeter(){
        return a + b + c ;
    }

    public double getArea(){
        // công thức Heron,sqrt(p *...),p = 1/2 chu vi
        double p = getPerimeter() / 2 ;
        return Math.sqrt( p * (p - a ) * (p - b) * (p - c) );
    }
    public void paint(){                             //  50x50=2500.00
        System.out.printf("|TRIANGLE  |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                owner,color,a,b,c,getArea() );
    }
    // Con xài tất cả những gì Cha có ,Cha có thêm , Con có thêm , Cha bớt ,Con bị bớt
    // Kế thừa / Di truyền/cho con -Inherite

    //Biến dị,con khác,thêm bớt mà Cha không có , Không phải OVERRIDE
    // Xin phép Cha, Con theo kiểu truyền thống,tên Hàm giống để con phát ngôn
    // Con sáng tạo điều mới ,Làm đột biến
}
