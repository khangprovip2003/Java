package data;

import java.sql.SQLOutput;

public class PhepCong extends Tinhtoan {
    public double a;
    public double b;

    public PhepCong(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public  void tinhToan(){
        System.out.println( "ADD: " + (a + b) );
    }


}
