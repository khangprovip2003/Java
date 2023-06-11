package studentmanager;

import java.util.*;

public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        studentList = new ArrayList<>();
    }
/*   "^" và "$" là các ký tự đặc biệt để đánh dấu đầu và cuối chuỗi. Trong trường hợp này, chúng đánh dấu chuỗi chỉ chấp nhận đúng định dạng mẫu.
    "S" là ký tự đầu tiên của chuỗi, là ký tự cố định, phải là chữ cái S in hoa.
    "\d" là ký tự đại diện cho bất kỳ chữ số nào trong phạm vi 0 đến 9.
    "{3}" chỉ định rằng chuỗi phải có đúng 3 chữ số.  
    (?i) không phân biệt  chữ hoa và chữ thường 
    */
   public void addStudent() {
        String code = Inputter.inputPattern("Input code: ", "^(?i)S\\d{3}$");
        while (isCodeDuplicated(code)) {
            System.out.println("Code already exists. Please enter a new code.");
            code = Inputter.inputPattern("Input code: ", "^(?i)S\\d{3}$");
        }
        String name = Inputter.inNonBlankStr("Input name: ");
        int mark = Inputter.inputInt("Input mark (0-10): ", 0, 10);
        studentList.add(new Student(code, name, mark));
        System.out.println("Student " + code + " has been added.");
    }

    private boolean isCodeDuplicated(String code) {
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

public void searchStudent() {
    if (studentList.isEmpty()) {
        System.out.println("Empty list. No search can be performed!");
        return;
    }
    String code = Inputter.inputPattern("Input student code for search: ", "^(?i)S\\d{3}$");
    boolean found = false;
    for (Student student : studentList) {
        if (student.getCode().equalsIgnoreCase(code)) {
            System.out.println("Found: " + student);
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Student " + code + " doesn't exist.");
    }
}



    public void updateStudent() {
        if (studentList.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
            return;
        }
        String code = Inputter.inputPattern("Input code of updated student: ", "^(?i)S\\d{3}$");
        boolean found = false;
        for (Student student : studentList) {
            if (student.getCode().equalsIgnoreCase(code)) {
                String newName = Inputter.inNonBlankStr("Old name: " + student.getName().toUpperCase().trim() + ", new name: ");
                int newMark = Inputter.inputInt("Old mark: " + student.getMark() + ", new mark (0-10): ", 0, 10);
                student.setName(newName);
                student.setMark(newMark);
                System.out.println("Student " + code + " has been updated.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student " + code + " doesn't exist!");
        }
    }

public void removeStudent() {
    if (studentList.isEmpty()) {
        System.out.println("Empty list. No remove can be performed!");
        return;
    }
    String code = Inputter.inputPattern("Input code of removed student: ",  "^(?i)S\\d{3}$");
    Iterator<Student> it = studentList.iterator();
    boolean found = false;
    while (it.hasNext()) {
        Student student = it.next();
        if (student.getCode().equalsIgnoreCase(code)) {
            it.remove();
            System.out.println("Student " + code + " has been removed.");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Student " + code + " doesn't exist!");
    }
}
       
public void printStudentList() {
    int total = studentList.size();

    if (total == 0) {
        System.out.println("Empty list.");
    } else {
        System.out.printf("%-10s %-20s %s\n", "Code", "Name", "Mark");
        for (Student student : studentList) {
            System.out.printf("%-10s %-20s %d\n", student.getCode().toUpperCase(), student.getName().toUpperCase(), student.getMark());
        }
        System.out.printf("Total: %d student(s)\n", total);
    }
}


}
