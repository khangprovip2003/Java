package data;

public class Rectangle {
    protected String owner; //____   protected : cho thằng con và cha nhìn được
    protected String color; //____
    protected double width; //____
    private double length;//____

    // private double area; // đặc điểm/đặc tính được tính từ các đặc tính khác
    //  từ width * length --> đặc tính dẫn xuất-derived field
    // thành tiền = số lượng * đơn giá
    // không nên dùng  vì nó là dẫn xuất tính từ kẻ khác,tính tức là xử lý,hàm xuất hiện
    //hàm thuộc về kẻ có nhiều info
    //ví dụ khác:lưu tuổi,lưu cả năm sinh -> mỗi năm tuổi lên 1 nhát...
    public Rectangle(String owner, String color, double width, double length) {
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "owner='" + owner + '\'' + ", color='" + color + '\'' + ", width=" + width + ", length=" + length + '}';
    }

    //ai có nhiều info,gã đó tính,hàm thuộc về...
    public double getArea(){
        return width * length;
    } //re-use các chỗ khác

    public void paint(){                             //  50x50=2500.00
        System.out.printf("|RECTANGLE |%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner,color,width,length,getArea() );
    }


}
