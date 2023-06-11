package main;
import data.*;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner (System.in);
        int choice;
        Shelf tuSE = new Shelf ("PINK","SE MAJOR");
    do{
        printMenu();
        System.out.println("Input your choice(1-6): "); //  MyToys
        choice = Integer.parseInt(sc.nextLine());
        //if các choice thì làm gì tương ứng
        switch(choice){
            case 1:
                tuSE.addAStudent();
                break;
            case 2:
                tuSE.printStudentList2();
                break;
            case 3:
            tuSE.searchtudent();
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                System.out.println("Bye,Bye");
                break;
            default:
                System.out.println("Please choose 1-6 option");
                break;
        }
    }while (choice != 6); // còn đúng thì còn lặp
                          // chưa chọn 6, chưa muốn kết thúc, lặp lại cuộc chơi
    }
    public static void printMenu(){
        System.out.println("Welcome to FAP-FPT Academic Portal");
        System.out.println("Choose the following function to play with");
        System.out.println("1.Add a new student profile");
        System.out.println("2.Print the student list");
        System.out.println("3.Search a student by id");
        System.out.println("4.Update a student profile");
        System.out.println("5.Remove a student profile");
    }

    public static void testShelf() {
        //NGON MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH ( dùng Switch case)
        Shelf tuSE = new  Shelf ("PINK","SE Major");

        //inputStudentList();
        tuSE.addAStudent();
        tuSE.addAStudent();
        Shelf tuGD = new Shelf ("RAINBOW","GD Major");
        tuGD.addAStudent();

        System.out.println("The student list for all");
        tuSE.printStudentList2();
        tuGD.printStudentList2();
    }

}
