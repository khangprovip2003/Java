
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int c = 13;
        printMenuMain();
        while (c != 0) {
            System.out.print("Option : ");
            try {
                c = Integer.parseInt(sc.nextLine());
                switch (c) {
                    case 1:
                        appendElementToTheEnd();
                        break;
                    case 2:
                        loopsElement();
                        break;
                    case 3:
                        loopsIndexElement();
                        break;
                    case 4:
                        loopsReverseElement();
                        break;
                    case 5:
                        insertElementPositive();
                        break;
                    case 6:
                        addFirstElement();
                        break;
                    case 7:
                        addFirstSpecifiedElement();
                        break;
                    case 8:
                        addLastSpecifiedElement();
                        break;
                    case 9:
                        insertSomeElementPositive();
                        break;
                    case 10:
                        firstAndLastOccurrence();
                        break;
                    case 11:
                        displayElement();
                        break;
                    case 12:
                        removeElement();
                        break;
                    case 0:
                        System.out.println("BYE BYE 😑");
                        break;
                    default:
                        System.out.println("Please choose true option!!!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Do you know how to input a positive number?");
            }
        }
    }


    public static void printMenuMain() {
        System.out.println("[1].Nối phần tử được chỉ định vào cuối danh sách liên kết");
        System.out.println("[2].Lặp qua tất cả các phần tử trong danh sách liên kết");
        System.out.println("[3].Lặp qua tất cả các phần tử trong danh sách liên kết bắt đầu từ vị trí đã chỉ định");
        System.out.println("[4].Lặp một danh sách liên kết theo thứ tự ngược lại");
        System.out.println("[5].Chèn phần tử được chỉ định vào vị trí xác định trong danh sách liên kết");
        System.out.println("[6].Để chèn các phần tử vào danh sách liên kết ở vị trí đầu tiên");
        System.out.println("[7].Chèn phần tử được chỉ định vào đầu danh sách liên kết");
        System.out.println("[8].Chèn phần tử được chỉ định vào cuối danh sách liên kết");
        System.out.println("[9].Chèn một số phần tử tại vị trí xác định vào danh sách liên kết");
        System.out.println("[10].Lấy vị trí xuất hiện đầu tiên và cuối cùng của các phần tử được chỉ định trong danh sách liên kết");
        System.out.println("[11].Hiển thị các phần tử và vị trí của chúng trong một danh sách liên");
        System.out.println("[12].Xoá một phần tử được chỉ định khỏi danh sách liên kết");
        System.out.println("[0].Exit");
    }

    public static void appendElementToTheEnd() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Nhập phần tử muốn chèn vào cuối danh sách liên kết: ");
        String newElement = sc.nextLine();
        list.add(newElement);
        System.out.println("Các phần tử sau khi chèn :");
        System.out.println(list);
    }

    public static void loopsElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.println("Sau khi lặp tất cả các phần tử trong danh sách liên kết  :");
        for (String x : list) {
            System.out.println(x);
        }
    }

    public static void loopsIndexElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.println("Nhập vị trí chỉ định:");
        int positive = Integer.parseInt(sc.nextLine());
        System.out.println("Sau khi lặp tất cả các phần tử trong danh sách liên kết  :");
        for (int i = positive; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void loopsReverseElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.println(" Sau khi Lặp một danh sách liên kết theo thứ tự ngược lại:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void insertElementPositive() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.print("Nhập phần tử thêm vào:");
        String element = sc.nextLine();
        System.out.print("Nhập vị trí cần thêm:");
        int positive = Integer.parseInt(sc.nextLine());
        list.add(positive + 1, element);
        System.out.println("Danh sách sau khi thêm:");
        System.out.println(list);
    }

    public static void addFirstElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.print("Nhập phần tử cần chèn vào đầu danh sách:");
        String element = sc.nextLine();
        list.add(0, element);
        System.out.println("Danh sách sau khi chèn phần tử đầu tiên:");
        System.out.println(list);
    }

    public static void addFirstSpecifiedElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.print("Nhập phần tử cần chèn vào đầu danh sách:");
        String element = sc.nextLine();
        list.addFirst(element);
        System.out.println("Danh sách sau khi chèn phần tử đầu tiên:");
        System.out.println(list);
    }
    public static void addLastSpecifiedElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.print("Nhập phần tử cần chèn vào đầu danh sách:");
        String element = sc.nextLine();
        list.addLast(element);
        System.out.println("Danh sách sau khi chèn phần tử đầu tiên:");
        System.out.println(list);
    }

    public static void insertSomeElementPositive() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        System.out.print("Nhập số lượng phần tử cần chèn :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhập phần tử thêm vào:");
            String element = sc.nextLine();
            System.out.print("Nhập vị trí cần thêm:");
            int positive = Integer.parseInt(sc.nextLine());
            list.add(positive , element);
        }
        System.out.println("Danh sách sau khi thêm:");
        System.out.println(list);
    }
    public static void firstAndLastOccurrence(){
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Danh sách ban đầu:");
        System.out.println(list);
        String first = list.getFirst();
        System.out.println("First element: " + first);
        String last = list.getLast();
        System.out.println("First element: " + last);
        int firstIndex = list.indexOf(first );
        System.out.println("First occurrence: " + (firstIndex + 1));
        int lastIndex = list.lastIndexOf(last );
        System.out.println("Last occurrence: " + (lastIndex + 1));
    }

    public static void displayElement(){
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        for (int i = 0; i < n; i++) {
            String element = list.get(i);
            System.out.println("Element an index " + (i + 1) + ": " + element);
        }
    }
    public static void removeElement(){
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.print("Nhập phần tử cần xoá:");
        String element = sc.nextLine();
        boolean result = list.remove(element);
        if(result){
            System.out.println("The element "+ element + " was removed the list");
            System.out.println("Sau khi xoá :" + list);
        }else{
            System.out.println("The element was not found in the list");
        }
    }

}

