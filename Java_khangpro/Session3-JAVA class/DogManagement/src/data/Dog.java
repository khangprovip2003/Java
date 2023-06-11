package data;

// khuôn dùng để đúc ra các object, đối tượng cần lưu trữ info, thứ tự làm ra để bán
// khuôn phải kín, có phễu để chế/rót/hứng/đổ vào cái data,nguyên liệu
public class Dog {
    // chứa các đặc điểm, chi tiết object tương lai sẽ có
    // khuôn design ra sao, thì object như thế
    private String name ;
    private int yob ;
    private double weight;
    // có khuôn thì phải có phễu/miệng để hứng vật liêu đi vào
    // phễu dùng để nhận vật liệu đúc ra, tạo ra, construct cái object
    public Dog(String iName,int iYob,double iWeight){   // biến toàn cục ( dùng để đúc,mỗi lần tạo là tạo 1 object)
        name = iName ;
        yob  = iYob ;
        weight = iWeight ;
    }
    // phễu còn gọi là constructor, hàm khởi tạo, hàm đúc, hàm tạo dựng
    // ra object vì thông qua nó như cái phễu vật liệu chảy vào khuôn
    // vật liệu khô ra object/bức tượng,cmnd ai đó, hồ sơ được tạo ra
    // Contructor, là hàm cực kỳ đặc biệt vì nó để tạo ra object.
    // cứ mỗi lần sài nó thì phải đưa vật liệu vào tức là có 1 object mới
    // PHỄU là hàm đặc biệt không có giá trị trả về , không void , trả về nguyên bức tượng đang đúc
    // tên 100% giống tên của class
    // tên class/sự phân nhóm đối tượng - tên interface // viết hoa chữ cái đầu và sử dụng quy tắc con lạc đà : Dog
    // viết các hàm để xử lý data( năm sinh )
    // vì bố mẹ đã fill yob = 2002
    // object thì gọi là hành động ( behaviour)
    // biến được đổ value từ lúc đúc ra
    // hàm gọi n lần tương đuơng với các hành động mà obj nào đó lặp đi lặp lại
    // hành động obj gọi n lần trên obj đó
    public void bark (){          // các hàm lấy biến để xử lý
        //System.out.println("Gogogogo...my name is "+ name);
       // System.out.println("Gogogogo...my yob is " + yob );
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                                    name,yob,weight);    //%-10s căn lề bên trái 10.
                                                         // %4.1f tổng cộng chiếm 4 ký tự và 1 phần dành cho thập phân.
    }
    // thay đổi info ba má đã từng đúc cho mình
    public void setNewWeight(double newWeight){
        weight = newWeight ;   // thay đổi trạng thái ko cần return
    }
        // mặc định info sẽ là giấu , khi minh giao tiếp thì mình mới bật nó ra
        // chia sẻ  info khi được hỏi , đó chính là method hàm hành động get ()

    public int getYob (){
        return yob;         // trả ra cho người xem , nếu private thì không cần hàm này
    }
}

// code bên ngoài class giống khuôn bị thủng