package data;

import java.util.Random;
// Dog ngoan ngoan ban ngày , tối đi ngủ , nó trốn nhà đi hoang
// đi đua thì nó phải vượt tốc độ bình thường, runToDead() như mọi đua thủ
// Mình vẫn là Con Cháu, học hành như bình thường sinh viên những còn tham gia CLB
// thì phải có hành động của CLB đó
//IMPLEMENTS ALL ABSTRACT METHODS, NỘI QUY CLB, @OVERRIDE
public class Dog extends Pet implements DeathRacer {

    public static double MAX_SPEED = 40 ;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                "DOG", name, yob, weight, run());
    }

    // PHẦN HOANG DÃ TRONG TA , CHỈ BỘC LỘ KHI ĐUA THÔI
    // TỤI MÀY , SV, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    // VÀO SÀI GÒN , CHẮC CHẮN THÊM PHẦN BỘC LỘ KHÁC: NHẬU NHẸT , GAME, CÁ ĐỘ ,..
    @Override
    public double runToDead() {
        return run() * 5; // chạy 5 lần so với bình thường
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%4d|%4.1f|%4.1f|\n",
                "DOG-RACER", name, yob, weight, runToDead());
    }


}
