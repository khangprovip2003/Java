package studentmanagement;
import data.*;
public class StudentManagement {
//    public static void main(String[] args) {
//        Shelf se  = new Shelf();
//        Shelf ia = new Shelf();
//        System.out.println("INPUT SE STUDENT(S)");
//        se.addAStudent(); // #1
//       System.out.println("INPUT IA STUDENT(S)");
//        ia.addAStudent(); //#1
//        ia.addAStudent(); //#2
//        System.out.println("SE MAJOR");
//        se.printfAStudentList(); //1 bạn
//        System.out.println("IA MAJOR:");
//        ia.printfAStudentList();// 2 bạn
//
//    }
public static void main(String[] args){
    Shelf se = new Shelf();
    se.addAStudent();
    se.addAStudent();
    se.printfAStudentList();

    se.updateAStudent();
    System.out.println("The student list after updating");
    se.printfAStudentList();
    //search ko thấy
    se.searchAStudent();
    //search thấy
    se.searchAStudent();


}


}
