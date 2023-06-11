package amazingracev2;
import data.*;
import java.util.Random;
public class AmazingRaceV2 {
    public static void main(String[] args) {
        showRecordsWithTakeAway();
        //showRecords();
    }

    public static void showRecordsWithTakeAway(){
        // đường đua đông vui, có nhiều racer, và có một con gì đó ko nhìn rõ
        //bay theo , vật gì đó bay theo , tức là có tốc độ
        // mình không biết , ko xác định được nhóm của nó là gì,chưa biết class gì
        //vì mày muốn nhập hội,chạy theo được rồi , chơi trò take-away
        //mượn gió bẻ măng, mượn  để new object

        Pet ufo = new Pet("UFO",2001,0.3) {
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                        "XXX",name,yob,weight,run());
            }
        };

        Pet racer [] = new Pet[]{ new Dog("CHIHUHU",2021,0.5),
                new Dog("VÀNG ƠI",1950,10.0),
                new Cat("TOM",1960,15.0),
                new Cat("KITTY",1990,5.0),
                new Hamster("JERRY",1960,0.5),
                ufo // object tạo từ Anonymous vẫn là Pet ( vào mảng)
        };
        System.out.println("The records table");
        for (Pet x : racer){
            x.showRecord();
        }
        for (int i = 0 ; i < racer.length - 1 ; i++){
            for (int j = i + 1; j < racer.length ; j++){
                if (racer[i].run() > racer [j].run()){
                    //tốc độ chạy sẽ bị thay đổi cho mỗi lần so sánh
                }   //S,P,GPA cố định , thoải mái gọi getS(), getGPA() để
            }       //so sánh và đổi chỗ
        }
    }


public static void showRecords(){
        Pet racer [] = new Pet[]{ new Dog("CHIHUHU",2021,0.5),
                                  new Dog("VÀNG ƠI",1950,10.0),
                                  new Cat("TOM",1960,15.0),
                                  new Cat("KITTY",1990,5.0),
                                  new Hamster("JERRY",1960,0.5)
        };  // phần tử mảng Pet thì phỉ gán 1 con Pet nào đó,Cat,Dog,Hamster
            // gán = new Dog(...);   [i] = cần toạ độ vùng new Con nào đó ()
            // new Dog()...: bố trí vùng Ram trong HEAP, gõi phễu đổ vào
            // lấy mốc toạ độ vùng new đưa cho ai đó
            // đa hình  quay trở lại
            // vì mảng Pet, mọi việc CHẤM của Cha ,của PET,Cha toàn là ABSTRACT
            // HOÀN TOÀN KHÔNG ĐÁNG LO , VÌ CON ĐÃ IMPLEMENT
            // CHA QUẤT RỒI CHẠY ĐI CHÚNG MÀY , THẾ LÀ 3 ĐỨA CON CHẠY THEO
            // TỐC ĐỘ CỦA RIÊNG CHÚNG, ĐA HÌNH XUẤT HIỆN , OVERRIDE QUA MẶT CHA XUẤT HIỆN
            System.out.println("The records table");
                for (Pet x : racer){
                    x.showRecord();
                }
                // Tại thời điểm viết code thế này , không sort thành tích chạy được
            for (int i = 0 ; i < racer.length - 1 ; i++){
                for (int j = i + 1; j < racer.length ; j++){
                    if (racer[i].run() > racer [j].run()){
                        // đa hình hàm cha nhưng mà chạy con tương ứng
                    } // mỗi lần run() để so sánh thì tốc độ khác
                      // bài SV , Hình học , S cố định cho n lần gọi
                      // điểm tb cố định cho đến khi cập nhập điểm mới
                      // for hoài, getGPA(), getS() cố định nên ta đảo được
                      // bài AmazingRaces bắt tụi nhỏ chạy 1 lượt để ghi nhận thành tích
                      // ta so sánh trên thành tích  chạy này

                }
            }


    }

}
