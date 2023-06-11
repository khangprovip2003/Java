package data;

// Nên kế thừa ai???
//Shape: khai báo cạnh edge, phễu (super, éo cần thoả hiệp , đảo thứ tự biến nếu muốn )
//       get/set()
// Bắt buộc phải IMPLEMENTS

// Ngon : Kế thừa  Rectangle
//                               không cần khai báo cạnh ,phễu thoả hiệp tí , cùng lắm là làm pain
//                               lúc này SHAPE là ông nội, cây gia phả xuất hiện

public  class Square extends Rectangle {

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    //DONE , không làm gì nữa ( vì HCN có đủ rồi: OWMER,COLOR,2 EDGE EDGE

    @Override
    public void paint() {
        System.out.printf("|SQUARE   |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n",
                owner,color,borderColor,a,getArea());
    }

}
