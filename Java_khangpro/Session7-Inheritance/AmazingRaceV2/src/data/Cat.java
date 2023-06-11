package data;

import java.util.Random;

public class Cat extends Pet{
    public static double MAX_SPEED = 50;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        //Random rd = new Random(); // rd nắm toạ độ new
       // return rd.nextDouble() * Cat.MAX_SPEED; // trong vùng new có hàm .nextDouble() quan trọng
        // ( 0...1)    *     50   coi như được con số sát 50

        //    object không thèm đặt tên ( xài 1 lần là bỏ luôn)
        // Công ty môi trường dọn dẹp ( Garbage Collector)
        // Lệnh gom rác System.gc() ~~ malloc bên C

        return new Random().nextDouble() * MAX_SPEED ;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n",
                "CAT",name,yob,weight,run());
    }

}
