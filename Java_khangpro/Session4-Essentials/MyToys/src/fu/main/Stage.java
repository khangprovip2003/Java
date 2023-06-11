package fu.main;

import fu.util.Mytoys;

public class Stage {
    public static void main (String[] args){
        System.out.println("PI: " + Mytoys.PI);  // viết kiểu này không thay đổi PI

         //Mytoys.PI =4.0;  // viết kiểu này là sờ 1 biến, sờ 1 biến thì thay đổi VALUE
        //System.out.println("PI: " + Mytoys.PI); // Lúc này Output: PI : 4.0

//    int n = Mytoys.getAnInteger();
//        System.out.println("m: " + n);

      int choice  ;
     choice = Mytoys.getAChoice("Mời chọn lựa chọn của bạn(1->7): ");
        System.out.println("Your choice: " + choice);

    

    }
}
