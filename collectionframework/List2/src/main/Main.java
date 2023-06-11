package main;

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
                        deleteFirstLastElement();
                        break;
                    case 2:
                        deleteAllElement();
                        break;
                    case 3:
                        swapTwoElement();
                        break;
                    case 4:
                        shuffleElement();
                        break;
                    case 5:
                        connectTwoElemnet();
                        break;
                    case 6:
                        copyList();
                        break;
                    case 7:
                        convertListToArray();
                        break;
                    case 8:
                        compareLiked();
                        break;
                    case 9:
                        checkEmptyList();
                        break;
                    case 10:
                        replaceElement();
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
        System.out.println("[1].xóa phần tử đầu tiên và cuối cùng khỏi danh sách liên kết");
        System.out.println("[2].xóa tất cả các phần tử khỏi danh sách liên kết");
        System.out.println("[3].hoán đổi hai phần tử trong danh sách liên kết");
        System.out.println("[4].xáo trộn các phần tử trong danh sách liên kết.");
        System.out.println("[5].nối hai danh sách liên kết");
        System.out.println("[6].sao chép một danh sách liên kết sang một danh sách liên kết khác");
        System.out.println("[7].chuyển một danh sách liên kết thành danh sách mảng");
        System.out.println("[8].so sánh hai danh sách liên kết");
        System.out.println("[9].kiểm tra danh sách liên kết có trống hay không");
        System.out.println("[10].thay thế một phần tử trong danh sách liên kết");
        System.out.println("[0].Exit");
    }


    public static void deleteFirstLastElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }

    public static void deleteAllElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        list.removeAll(list);
        System.out.println(list);
    }

    public static void swapTwoElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("List don't swap: " + list);
        System.out.println("Enter element1 position to swap: ");
        int element1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter element2  position to swap: ");
        int element2 = Integer.parseInt(sc.nextLine());
        String tmp = list.get(element1);
        list.set(element1, list.get(element2));
        list.set(element2, tmp);
        System.out.println("List after swap: " + list);
    }

    public static void shuffleElement() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        Collections.shuffle(list);
        System.out.println("List: " + list);
    }

    public static void connectTwoElemnet() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        LinkedList<String> list2 = new LinkedList<String>();
        System.out.print("Nhập số lượng phần tử :");
        int n2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n2; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        list.addAll(list2);
        //Sau khi thực hiện lệnh này, danh sách list sẽ chứa tất cả các phần tử của cả hai danh sách list và list2.
        System.out.println("List: " + list);
    }

    public static void copyList() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        LinkedList<String> list2 = new LinkedList<String>();
        Collections.copy(list2, list);
        // sao chép tất cả các phần tử từ danh sách list2 sang danh sách list.
        System.out.println("List after: " + list2);
    }

    public static void convertListToArray() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Array:");
        Object arr[] = list.toArray();
        for (Object element : arr) {
            System.out.println(element);
        }

    }

    public static void compareLiked() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        LinkedList<String> list2 = new LinkedList<String>();
        System.out.print("Nhập số lượng phần tử :");
        int n2 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("List1 bằng  list2 : " + list.equals(list2));
    }

    public static void checkEmptyList() {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        if (list.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println("List isn't Empty");
        }
    }

    public static void replaceElement(){
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử " + (i + 1) + ":");
            String element = sc.nextLine();
            list.add(element);
        }
        System.out.println("Input positive element want to replace:");
        int positive = Integer.parseInt(sc.nextLine());
        System.out.println("Input value element: "  );
        String element = sc.nextLine();
        list.set(positive,element);
        System.out.println(list);
    }

}