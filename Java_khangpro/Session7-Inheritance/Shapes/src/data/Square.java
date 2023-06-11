package data;

// vuông trọn vẹn HCN , dị biệt đặc tính
public class Square extends Rectangle  {
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    // muốn in lại theo cách hình V , nên cần viết lại hàm paint(),
    // duy nhất paint() không cần hàm S () , P ()

    @Override
    public void paint() {
        System.out.printf("|SQUARE    |%-10s|%-10s|%-10s|%4.1f| -  |%7.2f|\n",
                owner,color,borderColor,a,getArea());
    }


}
