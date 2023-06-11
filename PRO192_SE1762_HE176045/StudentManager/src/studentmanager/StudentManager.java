package studentmanager;

import java.util.*;

public class StudentManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 14;
        StudentList studentList = new StudentList(); // create the object outside the loop
        printMenuMain();
        while (c != 0) {
            System.out.print("Option(0-5): ");
            try {
                c = Integer.parseInt(sc.nextLine());
                switch (c) {
                    case 0:
                        System.out.println("BYE BYE 😍");
                        break;
                    case 1:
                        studentList.addStudent();
                        break;
                    case 2:
                        studentList.searchStudent();
                        break;
                    case 3:
                        studentList.updateStudent();
                        break;
                    case 4:
                        studentList.removeStudent();
                        break;
                    case 5:
                        studentList.printStudentList();
                        break;
                    default:
                        System.out.println("Please choose a valid option!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please input a valid option number!");
            }
        }
        sc.close(); // close the scanner
    }

    public static void printMenuMain() {
        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("=========================");
        System.out.println("[1].Add new student");
        System.out.println("[2].Search a student based on his/her code");
        System.out.println("[3].Update name and mark of a student based on his/her code");
        System.out.println("[4].Remove a student based on his/her code");
        System.out.println("[5].List all students");
        System.out.println("[0].Exit");
    }
}
