package main;
import one_dimensional_array.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        char c;
        do {
            printMenuMain();
            System.out.print("Option (A,B,E): ");
            c = sc.nextLine().charAt(0);

            switch (c) {
                case 'A':
                    selectChoice();
                    break;
                case 'B':
                    selectChoice2();
                    break;
                case 'E':
                    System.out.println("BYE BYE -_-");
                    break;
                default:
                    System.out.println("Please choose (A,B,C) option!!!");
                    break;
            }
        } while (c != 'E');
    }

    public static void printMenuMain() {
        System.out.println("[A].One-dimensional array");
        System.out.println("[B].Two-dimensional array");
        System.out.println("[E].Exit");
    }

    public static void selectChoice() {
        Scanner sc1 = new Scanner(System.in);
        int choice;
        System.out.print("Input size of array:");
        choice = Integer.parseInt(sc1.nextLine());
        int arr[] = new int[choice];
        System.out.println("Input elements of array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]:", i);
            arr[i] = Integer.parseInt(sc1.nextLine());
        }

        System.out.println("[1].Sort up ascending( using Quick-Sort algorithm");
        System.out.println("[2].Print the largest number and smallest number");
        System.out.println("[3].Remove duplicate elements");
        System.out.println("[4].Statics of even and odd numbers");
        System.out.println("[5].Back to main menu");
        Scanner sc2 = new Scanner(System.in);
        int choice1;
        do {
            System.out.print("Option (1,2,3,4,5): ");
            choice1 = Integer.parseInt(sc2.nextLine());

            switch (choice1) {
                case 1:
                    quickSort(arr);
                    break;
                case 2:
                    printLargestSmallest(arr);
                    break;
                case 3:
                    removeDuplicates(arr,choice);
                    break;
                case 4:
                    evenOddNumbers(arr);
                    break;
                case 5:
                    System.out.println("BYE BYE COME BACK MAIN MENU -_-");
                    break;
                default:
                    System.out.println("Please choose (1,2,3,4,5) option!!!");
                    break;
            }
        } while (choice1 != 5);
    }
    public static void quickSort(int arr[]) {
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        // call quicksort() on array data
        QuickSort.quickSort(arr, 0, size - 1);
        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(arr));
    }
    public static void printLargestSmallest(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The largest number is "+ max +" and smallest is  "+ min);
    }
    public static void removeDuplicates(int arr[],int size){   // size = choice
        QuickSort.quickSort(arr, 0, arr.length - 1);
        int tmp[] = new int[size];
        int n = arr.length;
        int j = 0;
        if(n == 0 || n == 1){
            for(int i = 0; i < arr.length;i++){
                System.out.println(arr[i]);
            }
        }

        for(int i = 0; i < n - 1; i++){
            if (arr[i] != arr[i+1]){
                tmp[j] = arr[i];
                j++;
            }
        }
        tmp[j] = arr[n-1];

        for (int i = 0 ; i <= j; i++){
            System.out.println(tmp[i]);
        }
    }
    public static void evenOddNumbers(int arr[]){
        int count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0 ){
                count1++;
            }else{
                count2++;
            }
        }
        System.out.println("The array has " + count1+" even number and " + count2 +" odd number" );
    }
    public static void selectChoice2() {
        System.out.println("[1].Add two arrays");
        System.out.println("[2].Multiply two arrays");
        System.out.println("[3].Back to main menu");
        Scanner sc3 = new Scanner(System.in);
        int choice2;
        do {
            System.out.print("Option (1,2,3): ");
            choice2 = Integer.parseInt(sc3.nextLine());
            switch (choice2) {
                case 1:
                    int a1, a2, b1, b2;   //a1 = rows , a2 = columns
                    Scanner scanner1 = new Scanner(System.in);
                    do {
                        System.out.print("Enter the numbers of rowsA:");
                        a1 = scanner1.nextInt();
                        System.out.print("Enter the number of columnsA:");
                        a2 = scanner1.nextInt();
                    }while (a1 < 1 || a2 < 1 );
                    Scanner scanner2 = new Scanner(System.in);
                    do {
                        System.out.print("Enter the numbers of rowsB:");
                        b1 = scanner2.nextInt();
                        System.out.print("Enter the number of columnsB:");
                        b2 = scanner2.nextInt();
                    }while(b1 < 1 || b2 < 1);
                    if (a1 != b1 || a2 != b2) {
                        System.out.println("Condition not satisfied!!!!");
                    } else {
                        System.out.println("Condition  is satisfied!!!!");
                        addArray(a1,a2);
                    }
                    break;
                case 2:
                    int c1,c2,d1,d2;        //c1 = rows, c2 = columns;
                    Scanner scanner4 = new  Scanner(System.in);
                    do {
                        System.out.print("Enter the numbers of rowsA:");
                        c1 = scanner4.nextInt();
                        System.out.print("Enter the number of columnsA:");
                        c2 = scanner4.nextInt();
                    }while (c1 < 1 || c2 < 1 );
                    Scanner scanner5 = new Scanner(System.in);
                    do {
                        System.out.print("Enter the numbers of rowsB:");
                        d1 = scanner5.nextInt();
                        System.out.print("Enter the number of columnsB:");
                        d2 = scanner5.nextInt();
                    }while(d1 < 1 || d2 < 1);
                    if ( c2 != d1) {
                        System.out.println("Condition not satisfied!!!!");
                    } else {
                        System.out.println("Condition  is satisfied!!!!");
                        mulArray(c1,d1,d2);
                    }
                    break;
                case 3:
                    System.out.println("BYE BYE COME BACK MAIN MENU -_-");
                    break;
                default:
                    System.out.println("Please choose (1,2,3) option!!!");
                    break;
            }
        } while (choice2 != 3);
    }
    public static void addArray(int a,int b){
        Scanner scanner3 = new Scanner(System.in);
        int[][] matrix1 = new int[a][b];
        int[][] matrix2 = new int[a][b];
        int[][] matrix3 = new int[a][b];
        System.out.println("Enter the elements for the matrix1 ");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print("matrix1["+ i +","+j+"] = " );
                matrix1[i][j] = scanner3.nextInt();
            }
        }
        System.out.println("Enter the elements for the matrix2 ");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print("matrix2["+ i +","+j+"] = " );
                matrix2[i][j] = scanner3.nextInt();
            }
        }
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                matrix3[i][j]= matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix1:");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print(matrix1[i][j]+ "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Matrix2:");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print(matrix2[i][j]+ "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Sum of matrix 1 and matrix 2 :");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print(matrix3[i][j]+ "\t");
            }
            System.out.println("\n");
        }
    }

    public static void mulArray(int a, int b , int c){
        Scanner scanner6 = new Scanner(System.in);
        int A [][] = new int [a][b];
        int B [][] = new int [b][c];
        int C [][] = new int [a][c];
        System.out.println("Enter the elements for the matrix1 ");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < b; j++ ){
                System.out.print("matrix1["+ i +","+j+"] = " );
                A[i][j] = scanner6.nextInt();
            }
        }
        System.out.println("Enter the elements for the matrix2 ");
        for(int i = 0; i < b; i++){
            for (int j = 0; j < c; j++ ){
                System.out.print("matrix1["+ i +","+j+"] = " );
                B[i][j] = scanner6.nextInt();
            }
        }
        // Multiply matrices
        for(int i = 0 ; i < a ; i++){
            for(int j = 0; j < c;j++){
                for(int k = 0; k < b; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Product of matrix 1 and matrix 2 :");
        for(int i = 0; i < a; i++){
            for (int j = 0; j < c; j++ ){
                System.out.print(C[i][j]+ "\t");
            }
            System.out.println("\n");
        }

    }


}
