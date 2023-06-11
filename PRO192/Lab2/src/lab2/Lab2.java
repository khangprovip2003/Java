package lab2;

import processor.Processor;

import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        String text1 = "financing Promoting Technology was established with the mission to develop a ‘new generation university’ with a    modern educational philosophy which combines training    activities with the actual need for skills in   the country, leveraging Vietnam to a level at which it can compete    with developed countries in the world. financing     Promoting Technology trains industrial engineers, and this requires a close association with IT firms, combining   training with      reality to be able to implement the most advanced technologies.";
        Processor p1 = new Processor(text1);
        Scanner sc = new Scanner(System.in);
        int c = 0;
        printMenuMain();
        while (c != 7) {
            System.out.print("Option (1,2,3,4,5,6,7): ");
            try {
                c = sc.nextInt();
                switch (c) {
                    case 1:
                        p1.capitalizeFirstLetterInEachSentence();
                        System.out.println(p1.getText());
                        System.out.println("DONE!!!");
                        break;
                    case 2:
                        p1.removeExtraSpaces();
                        System.out.println(p1.getText());
                        System.out.println("DONE!!!");
                        break;
                    case 3:
                        p1.rewriteNewGenerationUniversity();
                        System.out.println(p1.getText());
                        System.out.println("DONE!!!");
                        break;
                    case 4:
                        p1.capitalizeVietnam();
                        System.out.println(p1.getText());
                        System.out.println("DONE!!!");
                        break;
                    case 5:
                        p1.replaceFinancingPromotingTechnologyWithFPTUniversity();
                        if (p1.getText().contains("Financing Promoting Technology")) {
                            System.out.println("Because you chose option 1, this option cannot be used ( PLEASE CHOICE 7 TO EXIT TO INPUT AGAIN) 😭");                          
                        } else {
                            System.out.println(p1.getText());
                            System.out.println("DONE!!!");
                        }
                        break;
                    case 6:
                        System.out.println("Vowels: " + p1.countVowels());
                        System.out.println("Consonants: " + p1.countConsonants());
                        System.out.println("DONE!!!");
                        break;
                    case 7:
                        System.out.println("BYE BYE 😑");
                        break;
                    default:
                        System.out.println("Please choose (1,2,3,4,5) option!!!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Do you know how to input a positive number?");
                sc.next();
            }
        }
    }

    public static void printMenuMain() {
        System.out.println("   financing Promoting Technology was established with the mission to \n "
                + "develop a ‘new generation university’ with a    modern educational philosophy \n "
                + "which combines training    activities with the actual need for skills in   the country,\n"
                + " leveraging Vietnam to a level at which it can compete    with developed countries in\n "
                + "the world. financing     Promoting Technology trains industrial engineers, and this\n"
                + " requires a close association with IT firms, combining  training with      reality to be\n "
                + "able to implement the most advanced technologies.\n");
        System.out.println("[1].Capitalize the first character in the string and the beginning of the next sentence");
        System.out.println("[2].Find and remove extra whitespace");
        System.out.println("[3].Find and rewrite New Generation University");
        System.out.println("[4].Find and capitalize VIETNAM");
        System.out.println("[5].Find and replace financing Promoting Technology thành FPT University");
        System.out.println("[6].Statistics of vowels and consonants in the passage above");
        System.out.println("[7].Exit");
    }

}

       


