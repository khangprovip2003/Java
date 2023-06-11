package part1;
import java.util.Scanner;
public class Part1 {

    public static int yourChoice(String inputMsg){
        Scanner sc = new Scanner(System.in);
        int number;
        do{

           try {
               System.out.println(inputMsg);
                 number = Integer.parseInt(sc.nextLine());  // xoa buffer
               if (number >= 1){
                   return number;
               }else{
                   System.out.println("The number is invalid");
               }

           }catch (Exception e){
               System.out.println("The number is invalid");
           }


        }while (true);




    }



}
