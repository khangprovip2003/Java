package RomanToNumber;

import java.util.*;

public class RomanToNumber {

    public static void main(String args[]) {
        RomanToNumber ob = new RomanToNumber();
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.println("Enter the roman:");
        str = sc.nextLine();
        System.out.println(
                "Integer form of Roman Numeral" +
                        " is " + ob.romanToDecimal(str));


    }

    // hàm này trả về giá trị lã mã
    public static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    // Tìm kiếm giá trị thập phân của Lã Mã
    public static int romanToDecimal(String str) {

        int res = 0;

        for (int i = 0; i < str.length(); i++) {
            // Lấy giá trị của ký hiệu s[i]
            int s1 = value(str.charAt(i));

            // Lấy giá trị của ký hiệu s[i+1]
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));

                // So sánh 2 giá trị
                if (s1 >= s2) {

                    res = res + s1;
                } else {

                    res = res + s2 - s1;
                    i++;
                }
            } else {
                res = res + s1;
            }
        }

        return res;
    }


}