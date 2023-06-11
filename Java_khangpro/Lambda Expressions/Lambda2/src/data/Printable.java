package data;
@FunctionalInterface
// không thêm cũng được những thêm thì trình biên dịch sẽ thực thi rằng bạn có chính xác phương thức trừu tượng
// trong giao diện của mình , Nếu interface có nhiều hơn 1 phương thức trừu tượng thì không dùng đc lambda
public interface Printable {
     //void print(String suffix );

    // void print(String prerfix ,String suffix );

     String print(String suffix);

}
