import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
    while(true) {
        try {
            System.out.print("Inpuhjt an integer number: ");
            x = Integer.parseInt(sc.nextLine());

            break;
        } catch (Exception e) {
            System.out.println("ENTER AGAIN!!");

        }
    }
        System.out.printf("The absolute value of %d is: %d", x, convert(x));
        System.out.printf("\n");
    }

    public static int convert(int n) {
        int absvalue = (n >= 0) ? n : -n;
        return absvalue;
        // nếu điều kiện trước dấu ? trả về true thì sẽ trả về giá trị 1 còn false thì sẽ trả về giá trị 2
    }
}
