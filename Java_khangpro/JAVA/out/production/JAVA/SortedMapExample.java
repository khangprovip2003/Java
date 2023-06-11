import java.util.*;

public class SortedMapExample {

    public static void main(String[] args) {
        // Tạo một đối tượng TreeMap, đóng vai trò là một SortedMap.
        SortedMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "apple");
        map.put(3, "banana");
        map.put(2, "orange");

        // In ra các phần tử của SortedMap theo thứ tự tăng dần của khóa.
        System.out.println("SortedMap theo thứ tự tăng dần của khóa:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Tạo một đối tượng TreeMap, đóng vai trò là một NavigableMap.
        NavigableMap<Integer, String> navMap = new TreeMap<Integer, String>();
        navMap.put(1, "apple");
        navMap.put(3, "banana");
        navMap.put(2, "orange");

        // In ra các phần tử của NavigableMap theo thứ tự tăng dần của khóa.
        System.out.println("NavigableMap theo thứ tự tăng dần của khóa:");
        for (Map.Entry<Integer, String> entry : navMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Lấy key lớn nhất của NavigableMap nhỏ hơn hoặc bằng 2.
        Map.Entry<Integer, String> floorEntry = navMap.floorEntry(2);
        System.out.println("floorEntry(2): " + floorEntry.getKey() + " - " + floorEntry.getValue());

        // Lấy key nhỏ nhất của NavigableMap lớn hơn hoặc bằng 2.
        Map.Entry<Integer, String> ceilingEntry = navMap.ceilingEntry(2);
        System.out.println("ceilingEntry(2): " + ceilingEntry.getKey() + " - " + ceilingEntry.getValue());
    }
}
