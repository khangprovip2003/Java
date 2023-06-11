package main;
import data.*;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //NGON MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH ( dùng Switch case)
        Shelf tuSE = new  Shelf ("PINK","SE");
        //inputStudentList();
        tuSE.inputAstudent();
        tuSE.inputAstudent();

        tuSE.printStudentList();

    }



    // chơi theo không hướng đối tượng, chơi theo hướng đối tượng thì dùng shelf ( object)
    public static void inputStudentList(){
        Scanner sc = new Scanner(System.in);
        String id , name;
        int yob , count ;
        double gpa ;
        System.out.println("How many students do you want to input? ");
        count = Integer.parseInt(sc.nextLine()); // sc.nextInt(); (trôi lệnh)  // MyToys.getAnInteger

        Student arr[] = new Student[count];  // example count = 5

        // for nhập 5 hồ sơ
        for (int i =0; i < count ; i++){
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.println("Input id: ");
                id = sc.nextLine();
            System.out.println("Input name: ");
                name = sc.nextLine();
            System.out.println("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
            System.out.println("Input gba: ");
                // gpa = sc.nextDouble();   // trôi lệnh thằng thứ 2
                gpa = Double.parseDouble(sc.nextLine());

                arr[i] = new Student(id, name, yob, gpa);
        }

        System.out.println("The student list");
        for (Student x : arr){
            x.showProfile();
        }
    }

}