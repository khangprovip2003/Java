package data;


//1. Đọc được 1 câu IS-A 1 chiều , tam giác vuông là 1 phiên bản đặc biệt của 1 tam giác ( 2 cạnh vuông )
//  extends
//2. Đặc tính của class Con . Nếu con trùng đặc tính Cha, Không cần làm gì cả

//3. Tạo phễu cho Con, nhớ giữ bản sắc

//4.Thích thì độ

//a,b(góc vuông),ownwr,color: Cha lo được hết , không cần Con làm

public class RightTriangle extends Triangle {
    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(a * a + b * b ));
    } // new Con chính là new 1 phiên bane Cha
      // Cắt tam giác vuông chính là cắt 1 tam giác
      // super() chính là new TG()
      // cứ new TGV thì chính là new 1 phiên bản TG , new này gọi new

    //In theo cách của mình thì phải tự làm, nếu không thì xài kế thừa của ba má
   @Override // muốn qua mặt cha dành quyền ưu tiên
    public void paint(){                             //  50x50=2500.00
        System.out.printf("|R.TRIANGLE|%-15s|%-10s|%4.1f|%4.1f| -  |%7.2f|\n",
                owner,color,a,b,getArea() );
    }
}
