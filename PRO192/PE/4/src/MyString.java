/*
f1 - count and return number of world containing exacly 2 digits in the string str
(without space )
f2- Find the first world x which appears exactly 3 times in the string str.Return
the string s, which is obtained by replacing each world x i n str with character
"V" 
*/

public class MyString implements IString {

    @Override
    public int f1(String str) {
        String arr[] = str.split("\\s");
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            char c;
            int count = 0;
            for (int j = 0; j < arr[i].length(); j++) {
                c = arr[i].charAt(j);
                if (Character.isDigit(c)) {
                    count++;
                }
            }
            if (count == 2) {
                result++;
            }
        }
        return result;
    }

@Override
public String f2(String str) {
    //Sử dụng StringBuilder để xây dựng chuỗi kết quả, cho phép chúng ta hiệu quả thay đổi các từ riêng lẻ và nối chúng lại với nhau.
    StringBuilder result = new StringBuilder();
    String[] words = str.split("\\s");
    for (int i = 0; i < words.length; i++) {
        if (words[i].replaceAll("[^x]","").length() == 3) { //để kiểm tra xem từ hiện tại có chứa chính xác ba 'x' hay không
            String modifiedWord = words[i].replace("x", "V"); //để thay thế tất cả các 'x' trong từ hiện tại bằng 'V'.
            result.append(modifiedWord);  //để thêm từ đã sửa đổi (nếu nó chứa đúng ba 'x') hoặc từ gốc (nếu không phải) vào chuỗi kết quả.
        } else {                          // Chúng ta cũng thêm một ký tự dấu cách giữa các từ, trừ từ cuối cùng.  
            result.append(words[i]);
        }
        if (i < words.length - 1) {
            result.append(" ");
        }
    }
    return result.toString();
}



}
