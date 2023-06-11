package data;

import java.util.Random;
//Chơi thêm kế thừa, Motor is a kind of Vehicle ( abstract class)

// MOTOR MUA VỀ CHẠY ĐI HỌC , CHUYỆN BÌNH THƯỜNG , HÀM RUN()
// NHỮNG TRÊN ĐƯỜNG, THẰNG VỚ VẨN NÀO ĐÓ NÓ NẸT-BÔ, MÌNH KÉO TAY GA MẠNH HƠN
// TỐC ĐỘ DỮ HƠN BÌNH THƯỜNG, LÚC NÀY NGOÀI VIỆC MOTOR THÔNG THƯỜNG, TA CON LÀ ĐUA-THỦ
// GIA NHẬP HỘI ĐUA VÀ CHỈ ĐUA -> TỚ LÀ 1 ĐUA THỦ
// KO DÙNG TỪ EXTENDS , XÀI TỪ LÀ 1 MEMBER CỦA
//                          IMPLEMENTS
//              TỚ THAM GIA CLB , TRIỂN KHAI VIỆC ĐUA
// THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
// IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB , ĐI ĐUA MÀ KO CHỊU ĐUA SAO ĐƯỢC
//@OVERRIDE
// CHÚNG TA THAM GIA CLB NÀO THÌ THÊM HÀNH ĐỘNG CỦA CLB ĐÓ , @OVERRIDE HÀNH ĐỘNG ĐÓ
// TRONG TA CÓ NHIỂU HÀNH ĐỘNG ỨNG VỚI TỪNG CLB TA THAM GIA , HỢP LÝ NGOÀI ĐỜI
// VỀ LOGIC , TA CÓ THỂ THAM GIA N CLB , NHỮNG TA CHỈ CÓ 1 DÒNG HỌ
//TRONG JAVA , 1 CON TỐI ĐA 1 CHA, ĐƠN KẾ THÙA
//             1 CON THAM GIA N CLB, VẬY SẼ CÓ HÀNH ĐỘNG CỦA N CLB

// ( C++ , 1 CON NHIỀU CHA LUÔN , ĐA KẾ THỪA!!!)

public class Motor implements DeathRacer {

    public static final double MAX_SPEED = 100;
    private String model;  // Exciter 2021,Winner 2020
    private String volum;  // số phân khối  125.0 cm3
    private String vin;    // biển số, số khung ,Vehicle Identifier Number

    public Motor(String model, String volum, String vin) {
        this.model = model;
        this.volum = volum;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVolum() {
        return volum;
    }

    public void setVolum(String volum) {
        this.volum = volum;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Motor{" + "model='" + model + '\'' + ", volum='" + volum + '\'' + ", vin='" + vin + '\'' + '}';
    }
    // Hành vi máy là chạy , có tốc độ đc ghi nhận

    public double run(){
        return new Random().nextDouble() * MAX_SPEED ;
    }                     // chạy ngẫu nhiên  không quá 180 km

    // Quay video và gáy tốc độ
    public void showRecord(){
            System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|\n",
                                        "MOTOR", model, volum, vin, run());
    }                                                //150.0cm3 //58F8-567.89 //180.0

    @Override
    public double runToDead() {
        // CHẠY TỐC ĐỘ CAO
        return  run() * 3; // run() giả sử 150 x 3 đua đến chết còn gì??
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%11s|%5.1f|\n",
                "MOTOR-RACER", model, volum, vin, runToDead());
    }


}





