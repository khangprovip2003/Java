package collection;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int c = 100;
        printMenuMain();
        while (c != 0) {
            System.out.print("Option : ");
            try {
                c = Integer.parseInt(sc.nextLine());
                switch (c) {
                    case 1:
                        sort();
                        break;
                    case 2:
                        reverse();
                        break;
                    case 3:
                        shuffle();
                        break;
                    case 4:
                        binarySearch();
                        break;
                    case 5:
                        max();
                        break;
                    case 6:
                        maxComparator();
                        break;
                    case 7:
                        fill();
                        break;
                    case 8:
                        addAll();
                        break;
                    case 9:
                        disjoint();
                        break;
                    case 10:
                        frequency();
                        break;
                    case 11:
                        indexOfSubList();
                        break;
                    case 12:
                        copy();
                        break;
                    case 13:
                        nCopies();
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
        System.out.println("[1]. sort(List<T> list)");
        System.out.println("[2].reverse(List<?> list)");
        System.out.println("[3]. shuffle(List<?> list)");
        System.out.println("[4].binarySearch(List<? extends Comparable<? super T>> list, T key)");
        System.out.println("[5]. max(Collection<? extends T> coll)");
        System.out.println("[6]. max(Collection<? extends T> coll, Comparator<? super T> comp)");
        System.out.println("[7].fill(List<? super T> list, T obj)");
        System.out.println("[8].addAll(Collection<? super T> c, T... elements)");
        System.out.println("[9].disjoint(Collection<?> c1, Collection<?> c2)");
        System.out.println("[10].frequency(Collection<?> c, Object o)");
        System.out.println("[11].indexOfSubList(List<?> source, List<?> target)");
        System.out.println("[12]. copy(List<? super T> dest, List<? extends T> src)");
        System.out.println("[13]. nCopies(int n, T o)");
        System.out.println("[0].Exit");
    }
// Phương thức asList() là phương thức static trong Array. Phương thưc chuyển đổi một mảng các phần tử thành một danh sách
    public static void reverse(){
        //Phương thức reverse(List<?> list) được sử dụng để đảo ngược thứ tự các phần tử trong một danh sách.
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        Collections.reverse(words);
        System.out.println(words); // [cherry, banana, apple]
    }
    public static void sort() {
    //Phương thức sort(List<T> list) được sử dụng để sắp xếp các phần tử trong một danh sách theo thứ tự tăng dần.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4]
    }
    public static void shuffle(){
    //Phương thức shuffle(List<?> list) được sử dụng để xáo trộn các phần tử trong một danh sách theo thứ tự ngẫu nhiên
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Collections.shuffle(numbers);
        System.out.println(numbers); // [3, 1, 2, 4] (kết quả sẽ khác nhau ở mỗi lần chạy)

    }
    public static void binarySearch(){
    //Phương thức binarySearch(List<? extends Comparable<? super T>> list, T key) được sử dụng để tìm kiếm phần tử
        // có giá trị bằng key trong một danh sách đã được sắp xếp
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int index = Collections.binarySearch(numbers, 3);
        System.out.println(index); // 2

    }

    public static void max(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int max = Collections.max(numbers);
        System.out.println(max); // 4
    }
    public static void maxComparator(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
    //    Comparator.naturalOrder() để so sánh các số nguyên trong tập hợp.
                Comparator<Integer> comparator = Comparator.naturalOrder();
        Integer maxNumber = Collections.max(numbers, comparator); // returns 9
    //Lưu ý rằng nếu tập hợp truyền vào là rỗng thì phương thức max sẽ ném ra một ngoại lệ NoSuchElementException.
        // max(Collection<? extends T> coll) sử dụng thứ tự tự nhiên của các phần tử để tìm phần tử có giá trị lớn nhất, trong khi phương thức
//max(Collection<? extends T> coll, Comparator<? super T> comp) cho phép bạn chỉ định một trình so sánh tùy chỉnh
// để sử dụng để tìm phần tử có giá trị lớn nhất.
// min sample max

    }

    public static void fill(){
    //Phương thức fill(List<? super T> list, T obj) được sử dụng để thay đổi tất cả các phần tử trong một danh sách thành một giá trị mới.
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        Collections.fill(words, "orange");
        System.out.println(words); // [orange, orange, orange]

    }

    public static void addAll(){
      //  Phương thức này được sử dụng để thêm tất cả các phần tử được chỉ định vào một tập hợp
        List<Integer> list = new ArrayList<>();
        list.add(12);
        Collections.addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list); // Output: [12, 1, 2, 3, 4, 5]
    }

    public static void disjoint(){
    //Phương thức này được sử dụng để kiểm tra xem hai tập hợp có giao nhau hay không ( true/ false)
    //Nếu không có phần tử nào chung giữa hai tập hợp, phương thức sẽ trả về true. Ngược lại, nó sẽ trả về false.
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));

        System.out.println(Collections.disjoint(list1, list2)); // Output: true
        System.out.println(Collections.disjoint(list1, list3)); // Output: false
    }
    public static void frequency(){
    //Phương thức này được sử dụng để đếm số lần xuất hiện của một phần tử trong tập hợp
    //Tham số đầu tiên là tập hợp cần được đếm, tham số thứ hai là phần tử cần được đếm số lần xuất hiện.
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1, 2, 3, 4, 5));
        System.out.println(Collections.frequency(list, 2)); // Output: 3
        System.out.println(Collections.frequency(list, 6)); // Output: 0
    }

    public static void indexOfSubList(){
    //Phương thức này được sử dụng để tìm chỉ số đầu tiên của danh sách target trong danh sách source
    //Nếu không tìm thấy danh sách target trong danh sách source, phương thức sẽ trả về -1.
        List<Integer> source = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> target1 = new ArrayList<>(Arrays.asList(3, 4, 5));
        List<Integer> target2 = new ArrayList<>(Arrays.asList(6, 7, 8));

        System.out.println(Collections.indexOfSubList(source, target1)); // Output: 2
        System.out.println(Collections.indexOfSubList(source, target2)); // Output: -1

    }

    public static void copy(){
    // sao chép tất cả các phần tử từ danh sách src sang danh sách dest.
        List<String> sourceList = new ArrayList<>();
        sourceList.add("apple");
        sourceList.add("banana");
        sourceList.add("orange");

        List<String> destList = new ArrayList<>();
        destList.add("grape");
        destList.add("peach");
        destList.add("watermelon");

        Collections.copy(destList, sourceList);

        System.out.println(destList); //[apple, banana, orange]

    }

    public static void  nCopies(){
        //Phương thức nCopies(int n, T o)
    //trả về một danh sách bao gồm n phần tử có giá trị bằng o
        List<Integer> numberList = new ArrayList<>(Collections.nCopies(5, 10));

        System.out.println(numberList); //[10, 10, 10, 10, 10]


    }





}