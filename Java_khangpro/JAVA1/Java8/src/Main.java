import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x;
        while(true) {
            try {
                System.out.print("Input an float number: ");
                x = Float.parseFloat(sc.nextLine());

                break;
            } catch (Exception e) {
                System.out.println("ENTER AGAIN!!");

            }
        }
        System.out.printf("The absolute value of %f is: %.2f", x, convert(x));
        System.out.printf("\n");
    }

    public static float convert(float n) {
        float absvalue = (n >= 0) ? n : -n;
        return absvalue;
        // nếu điều kiện trước dấu ? trả về true thì sẽ trả về giá trị 1 còn false thì sẽ trả về giá trị 2
    }

}