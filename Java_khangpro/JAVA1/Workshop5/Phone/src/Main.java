import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);

        int c = 0;
        System.out.println("Enter list of phone numbers");
        System.out.println("-----------------------------------------");
        while (c != 7) {
            System.out.print("Type of phone number ? (1 -local phone, 2 - Inter phone number, 0 - exit): ");
            try {

                c = sc.nextInt();
                switch (c) {
                    case 1:
                        PhoneNumberJava();
                        break;
                    case 2:

                        break;
                    case 0:

                        break;
                    default:
                        System.out.println("Please choose (1,2,0) option!!!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Do you know how to input a positive number?");
                sc.next();
            }
        }
    }
    public static void PhoneNumberJava(){
        Scanner sc = new Scanner(System.in);
        PhoneNumber p1 = new PhoneNumber();
        System.out.print("Enter area code: " + sc.nextInt(p1.area)  );
        p1.getArea();

    }

}