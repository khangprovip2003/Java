
package studentmanager;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }

    public int getChoice(ArrayList<String> options) {
        int choice = 0;
        boolean validChoice = false;
        while (!validChoice) {
            try {
                for (int i = 0; i < options.size(); i++) {
                    System.out.println((i + 1) + "-" + options.get(i));
                }
                System.out.print("Choose 1.." + options.size() + ": ");
                choice = sc.nextInt();
                if (choice < 1 || choice > options.size()) {
                    throw new InputMismatchException();
                }
                validChoice = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice! Please choose a valid option.");
                sc.nextLine();
            }
        }
        return choice;
    }

    public int getChoice(Object[] options) {
        int choice = 0;
        boolean validChoice = false;
        while (!validChoice) {
            try {
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + "-" + options[i].toString());
                }
                System.out.print("Choose 1.." + options.length + ": ");
                choice = sc.nextInt();
                if (choice < 1 || choice > options.length) {
                    throw new InputMismatchException();
                }
                validChoice = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice! Please choose a valid option.");
                sc.nextLine();
            }
        }
        return choice;
    }
}