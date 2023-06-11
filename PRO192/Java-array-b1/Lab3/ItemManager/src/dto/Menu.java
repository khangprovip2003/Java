package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static int getChoice(Object[] options) {
        do{
            try {
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + "_" + options[i]);
                }
                System.out.println("Choose 1...." + options.length + ": ");
                Scanner sc = new Scanner(System.in);
                return Integer.parseInt(sc.nextLine());
            } catch ( Exception e) {
                System.out.println("Invalid input. Please enter an integer value.");
            }
        }while(true);
    }
}
