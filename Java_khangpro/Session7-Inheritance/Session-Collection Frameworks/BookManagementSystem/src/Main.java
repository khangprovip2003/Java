import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int c = 9;
        printMenuMain();
        while (c != 0) {
            System.out.print("Option (1,2,3,4,5,6,7,8,0): ");
            try {
                c = Integer.parseInt(sc.nextLine());
                switch (c) {
                    case 1:
                        bookList.inputAndAdd();
                        break;
                    case 2:
                        bookList.displayAllBook();
                        break;
                    case 3:
                        bookList.searchABook();
                        break;
                    case 4:
                        bookList.updateABook();
                        break;
                    case 5:
                        bookList.findMaxPriceIndex();
                        break;
                    case 6:
                        bookList.sortByCode();
                        break;
                    case 7:
                        bookList.removeTheBook();
                        break;
                    case 8:

                        break;
                    case 0:
                        System.out.println("BYE BYE 😑");
                        break;
                    default:
                        System.out.println("Please choose (1,2,3,4,5,6,7,8,0) option!!!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Do you know how to input a positive number?");
            }
        }
    }


    public static void printMenuMain() {
        System.out.println("1. Input & add book(s) to the end.");
        System.out.println("2. Display all books.");
        System.out.println("3. Search a book for given code.");
        System.out.println("4. Update the book’s price for given code.");
        System.out.println("5. Find the (first) max price value.");
        System.out.println("6. Sort the list ascendingly by code.");
        System.out.println("7. Remove the book having given code.");
        System.out.println("8. Load data from file.");
        System.out.println("0. Exit.");
    }
}


