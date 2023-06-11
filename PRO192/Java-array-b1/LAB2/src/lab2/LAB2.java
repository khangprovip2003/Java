package lab2;

import java.util.*;

public class LAB2 {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int c;
        do {
            printMenuMain();
            System.out.print("Option (1,2,3,4,5,6): ");
            c = sc.nextInt();

            switch (c) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("BYE BYE 😑");
                    break;                   
                default:
                    System.out.println("Please choose (1,2,3,4,5) option!!!");
                    break;
            }
        } while (c != 6);
    }

    public static void printMenuMain() {
        System.out.println("   financing Promoting Technology was established with the mission to develop\n "
                + "a ‘new generation university’ with a    modern educational philosophy which\n "
                + "combines training    activities with the actual need for skills in   the country,\n"
                + "leveraging Vietnam to a level at which it can compete    with developed countries in\n "
                + "the world. financing     Promoting Technology trains industrial engineers, and this\n"
                + "requires a close association with IT firms, combining  training with      reality to be\n "
                + "able to implement the most advanced technologies.\n");
        System.out.println("[1].Capitalize the first character in the string and the beginning of the next sentence");
        System.out.println("[2].Find and remove extra whitespace");
        System.out.println("[3].Find and rewrite New Generation University");
        System.out.println("[4].Find and capitalize VIETNAM");
        System.out.println("[5].Find and redeemfinancing Promoting Technology thành FPT University.\n" +
"Statistics of vowels and consonants in the passage above");
        System.out.println("[6].Exit");
    }


}