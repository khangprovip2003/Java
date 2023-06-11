import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 13;
        printMenuMain();

        while (c != 0) {
            System.out.print("Option : ");

            try {
                c = Integer.parseInt(sc.nextLine());
                switch (c) {
                    case 0:
                        System.out.println("BYE BYE 😍");
                        break;
                    case 1:
                        modificationElement();
                        break;
                    case 2:
                        mapSize();
                        break;
                    case 3:
                        mapCopy();
                        break;
                    case 4:
                        deletedMap();
                        break;
                    case 5:
                        checkEmptyMap();
                        break;
                    case 6:
                        shallowCopyMap();
                        break;
                    case 7:
                        checkSpecifiedKey();
                        break;
                    case 8:
                        checkSpecifiedValue();
                        break;
                    case 9:
                        collectionViewOfMapping();
                    case 10:
                        getValueOfSpecifiedKey();
                        break;
                    case 11:
                        setOfKeysMap();
                        break;
                    case 12:
                        setOfValuesMap();
                        break;
                    default:
                        System.out.println("Please choose true option!!!");
                }
            } catch (Exception var4) {
                System.out.println("Do you know how to input a positive number?");
            }
        }

    }

    public static void printMenuMain() {
        System.out.println("[1].Liên kết giá trị được chỉ định với khóa được chỉ định trong HashMap");
        System.out.println("[2].Đếm số lượng ánh xạ khóa-giá trị (kích thước) trong một bản đồ");
        System.out.println("[3].Sao chép tất cả các ánh xạ từ bản đồ được chỉ định sang bản đồ khác");
        System.out.println("[4].Loại bỏ tất cả các ánh xạ khỏi một bản đồ");
        System.out.println("[5].Kiểm tra xem một bản đồ có chứa các ánh xạ khóa-giá trị (trống) hay không");
        System.out.println("[6].Lấy một bản sao nông của một cá thể HashMap");
        System.out.println("[7].Kiểm tra xem một bản đồ có chứa một ánh xạ cho khóa được chỉ định hay không");
        System.out.println("[8].Kiểm tra xem một bản đồ có chứa một ánh xạ cho giá trị được chỉ định hay không");
        System.out.println("[9].Tạo một khung nhìn tập hợp của các ánh xạ có trong một bản đồ.");
        System.out.println("[10].Lấy giá trị của một khóa được chỉ định trong bản đồ");
        System.out.println("[11].Có được một khung nhìn tập hợp các khóa có trong bản đồ này");
        System.out.println("[12].Để có được một chế độ xem tập hợp các giá trị có trong bản đồ này");
        System.out.println("[0].Exit");
    }


    public static void modificationElement() {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map.put(key, value);
        }
        System.out.println("Map ban đầu: " + map);
        System.out.println("Nhập giá trị key và value mới");
        System.out.print("Nhập giá trị Key: ");
        String newKey = sc.nextLine();
        System.out.print("Nhập giá trị value: ");
        String newValue = sc.nextLine();
        map.put(newKey, newValue);
        System.out.println("Map sau khi liên kết giá trị : " + map);
    }

    public static void mapSize() {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map.put(key, value);
        }
        System.out.println("Map ban đầu: " + map);
        System.out.println("Size of Map: " + map.size());
    }

    public static void mapCopy() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Map1 : " + map1);
        HashMap<String, String> map2 = new HashMap<>();
        map2.putAll(map1);
        System.out.println("Map2 sau khi sao chép: " + map2);
    }

    public static void deletedMap() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Map: " + map1);
        map1.clear();
        System.out.println("Sau khi loại bỏ ánh xạ ra khỏi Map: " + map1);
    }

    public static void checkEmptyMap() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        boolean result = map1.isEmpty();
        if (result) {
            System.out.println("Map is a empty");
        } else {
            System.out.println("Map isn't not empty");
            System.out.println("Map: " + map1);
        }
    }

    public static void shallowCopyMap() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        //HashMap<String, String> map2 = ( HashMap<String,String>)map1.clone();
        HashMap<String, String> map2 = new HashMap<>(map1);
        System.out.println("Map1: " + map1);
        System.out.println("Shallow copy Map: " + map2);
    }

    public static void checkSpecifiedKey() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Map1: " + map1);
        System.out.print("Enter specified key to check: ");
        String keyCheck = sc.nextLine();
        if (map1.containsKey(keyCheck)) {
            System.out.println("The map contains a mapping for the key: " + keyCheck);
        } else {
            System.out.println("The map doesn't contains a mapping for the key");
        }
    }
    public static void checkSpecifiedValue() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Map1: " + map1);
        System.out.print("Enter specified value to check: ");
        String valueCheck = sc.nextLine();
        if (map1.containsValue(valueCheck)) {
            System.out.println("The map contains a mapping for the value: " + valueCheck);
        } else {
            System.out.println("The map doesn't contains a mapping for the value");
        }
    }
    public static void collectionViewOfMapping(){
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Map1: " + map1);
        Set<Map.Entry<String, String>> entries = map1.entrySet();

        System.out.println("Print out each mapping in the collection view");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        /*
        entry trong Map như một cái hộp chứa hai đồ vật,một đồ vật là key và đồ vật còn lại là value.Khi gọi phương thức
        entrySet(), bạn sẽ nhận được một tập hợp các cái hộp này, mỗi cái hộp được đại diện bởi một đối tượng Map.Entry.

        Bạn có thể lặp qua từng entry trong Set và truy xuất đến key và value của entry bằng cách sử dụng các phương
        thức getKey()  và getValue() của interface Map.Entry
 ->   Vì vậy, khi bạn muốn truy cập vào cả key và value của một đối tượng Map, phương thức entrySet() là một lựa chọn tốt.
         */
        }
    }

    public static void getValueOfSpecifiedKey(){
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Map1: " + map1);
        System.out.print("Enter specified key to get: ");
        String getKey = sc.nextLine();
        String getValue = map1.get(getKey);
        System.out.println("The value of key " + getKey + " is " + getValue );
    }
    public static void setOfKeysMap(){
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Each key in the key set");
        Set<String> keys = map1.keySet();
        for (String x : keys ){
            System.out.println(x);
        }
    }
    public static void setOfValuesMap() {
        HashMap<String, String> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử :");
        int n1 = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n1; ++i) {
            System.out.println(" phần tử " + (i + 1));
            System.out.print("Nhập giá trị Key: ");
            String key = sc.nextLine();
            System.out.print("Nhập giá trị value: ");
            String value = sc.nextLine();
            map1.put(key, value);
        }
        System.out.println("Each value in the value set");
        Collection<String> values = map1.values();
        for (String x : values) {
            System.out.println(x);
        }
    }


}
