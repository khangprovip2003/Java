public class Sorting {
    // thêm 1 main () ngoài main () ban đầu
    public static void main(String[] args) {
        sortStudentList();
        //sortPrimitiveArray();


    }
    public static void sortStudentList(){
        Student arr [] = new Student[] {new Student("SE9","CHÍN",19,9) ,
                                        new Student("SE5","NĂM",15,5) ,
                                        new Student("SE7","BẢY",17,7) ,
                                        new Student("SE8","TÁM",18,8) ,
                                        };
        System.out.println("The student list before sorting:");
        for( Student x : arr){
            x.showProfile();
        }
        for (int i = 0 ; i< arr.length - 1 ; i++){
            for (int j = i + 1 ; j < arr.length ; j++){
                if (arr[i].getGpa() > arr[j].getGpa()){
                    Student tmp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = tmp ;
                }
            }
        }
        System.out.println("\n The student list after sorting ascending gpa :");
        for (int i = 0;i < arr.length;i++){
            arr[i].showProfile();
        }


    }

    public static void sortPrimitiveArray(){
        int arr[] = {1000, -1000 , 1000 , 5 , 10 , -15 , -20};
        for (int x : arr) {
            System.out.print(x + " ");
        }
            // if thằng đầu lớn hơn thằng sau thì có chuyện , đổi ngay và luôn
        for (int i = 0 ; i< arr.length - 1 ; i++){
            for (int j = i + 1 ; j < arr.length ; j++){
                if (arr[i] > arr[j]){   // so sánh được vì là value primitive
                    int tmp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = tmp ;
                }  // > tăng dần , < giảm dần
            }
        }
        System.out.println("\n Sắp xếp tăng dần  :");
        for (int i = 0;i < arr.length;i++){
            System.out.print( arr[i] + " ");
        }

    }


}
