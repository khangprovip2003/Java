package data;

// hình vuông là phiên bản đặc biệt của hình chữ nhật,độ lại 2 cạnh kề bằng nhau
// không mất đi bản sắc hình chữ nhật 4 góc vuông
// Hình vuông sự mở rộng,nâng cấp ,đặc biệt hoá,phiên bản mới,sự điều chỉnh
// chỉnh/thay đổi nhỏ từ hình chữ nhật
// Cách chế tạo khuôn mới từ khuôn cũ , kế thừa ,dừng lại ,đứng trên vai
// không phải là COPY & PASTE
// Phiên bản cũ là mình làm các Khuôn từ đầu , không kế thừa
// sản phẩm chọi nhau,không cùng 1 nhà

//1. mới A extends cũ B:
//                            HCN khuôn gốc để độ: class Cha , parent, super, base
//       HV                       kế thừa từ HCN : class Con , child , sub , derived
                                                                    // biến hình  chế ra
//2.đặc điểm của con là gì?
//             Vì HV là ( phiên bản ) HCN, nên nó có tất cả mọi thứ từ HCN
//              tao là HV, tao phải có những cái HCN đang có
//Không cần làm lại FIELD/INSTANCE VARIBLE

//3.Cần phễu,để đúc phiên bản mới , cần vật liệu đưa vào , gửi cha giữ
// đổ lên cha, vì có mọi thứ từ Cha( phiên bản gốc)
// tôn trọng bản sắc của Con , Con HV , owner , color ,edge,only edge
//                       Con lại đồng thời là 1 phiên bản HCN , O , C ,W, L
// code tự sinh ra , nó sẽ căn theo phễu cha,4 tham số,để đổ 4 tham số
//                                  phễu con phải 4,mất BẢN SẮC ( EDGE)
public class Square extends Rectangle {
                                             //trade-off
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge); // HV có cạnh edge là HCN 2 cạnh edge edge
    }//super ~~ new Rectangle(owner,color,width,length)
     //new HV chính là new HCN
     // new HV chính là new 1 phiên bản HCN
     // cắt 1 HV bản chất là cắt 1 HCN
     //          có color,owner,cạnh --> HCN dưới dạng HV cx là thế

    //    private String owner;
    //    private String color;
    //    private double edge;

    //@Override : là hiện tượng hàm con trùng 100% tên hàm của cha
    //            dính đến khái niệm gọi là tính đa hình , đa xạ ,đa kế thừa
    //            50 sắc thái , biến hình,TRANSFORMER,POLYMORPHISM
    //            Hiện tượng con qua mặt cha , thể hiện bản sắc của con,cha ngồi im để
    //            con lên tiếng,vờ như không có cha

    public void paint(){
        System.out.printf("|SQUARE    |%-15s|%-10s|%4.1f|  - |%7.2f|\n",
                owner,color,width,getArea() );
    }
    //Về lí xong khuôn vuông, vì đổ DATA như truyền thống,dùng lại hết của HCN
    //Không cần viết lại code,Không COPY & PASTE
    //Không chỉnh sửa dây chuyền sản xuất quá nhiều,Tất nhiên đang cùng dòng SP,Series.


}
