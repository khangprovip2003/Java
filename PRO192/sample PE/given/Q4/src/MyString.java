
import com.sun.org.apache.bcel.internal.generic.F2D;
import java.lang.reflect.Array;
import java.util.*;

//public class MyString implements IString{
//
//    @Override
//   public int f1(String str) {
//    int count = 0;
//    for (int i = 0; i < str.length(); i++) {
//        char char1 = str.charAt(i);
//        if(Character.isDigit(char1)) {
//            int num1 =  Integer.parseInt("" + char1);    
//            if(isPrime(num1)){
//                count++;
//            }
//        }
//    }
//    return count;
//}
//    private boolean isPrime(int num1) {
//    if(num1 == 1){
//        return false;
//    }
//    if(num1 == 2){
//        return true;
//    }
//    for (int i = 2; i <= Math.sqrt(num1); i++) {
//        if(num1 % i == 0){
//            return false;
//        }
//    }
//    return true;
//}
//}
//
//    @Override
//    public String f2(String str) {
//        String s1[] = str.split("\\s");
//        String s2 = "";
//        for (int i = s1.length - 1; i >= 0; i--) {
//           s2 += " " +s1[i];
//        }
//        return s2.trim();
//       
//    }
//    // số nguyên tố là số chia hết cho 1 và chính nó 
////////////////////////////////////////////////////////////////////////////////
//    @Override
//    public int f1(String str) {
//        int count = 0 ;
//        String world [] = str.split("\\s");
//        boolean b1,b2;
//        for (int i = 0; i < world.length; i++) {
//            b1 = world[i].endsWith("m");
//            b2 = world[i].endsWith("n");
//            if (b1 == true || b2 == true) {
//                count ++;
//            }            
//        }
//        return count ;
//    }
//
//    @Override
//    public String f2(String str) {
//        String arr [] = str.split("\\s");
//    int max = 0;
//    int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if( max < arr[i].length()){
//                max = arr[i].length();
//                count = i;
//            }
//        }
//        String s1 = arr[count];
//        String s2 = "";
//        for (int i = s1.length() -1 ; i >= 0; i--) {
//           s2 += s1.charAt(i) ; 
//        }
//        arr[count] = s2;
//        String s3 = "";
//            for (int i = 0 ; i < arr.length; i++) {
//               s3 +=  " " +  arr[i] ; 
//            }   
//        return s3.trim();
//    }
///////////////////////////////////////////////////////////////////////////////
// example f1 : Count and Return the sum of the even digits in the string
//         f2 : Return the first palindrome in the String 
//public class MyString implements IString {
//
//    @Override
//    public int f1(String str) {
//        int sum = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isDigit(str.charAt(i))) {
//                if (str.charAt(i) % 2 == 0) {
//                    sum += Integer.parseInt("" + c);
//                }
//            }
//        }
//        return sum;
//    }
//     
//    boolean check(String s){
//        String s1="";
//        for(int i=s.length()-1; i>=0; i--){
//            s1+=s.charAt(i);
//        }
//        if(s1.equals(s)){
//            return true;
//        }
//        return false;
//    }
//    
//    
//    
//    @Override
//    public String f2(String str) {
//        int count = 0;
//        String arr[] = str.split("\\s");
//        for (int i = 0; i < str.length(); i++) {
//            if(check(arr[i]) == true){
//                count=i;
//                break;
//            }
//        }
//         return arr[count];
//    }
//       
//}
////////////////////////////////////////////////////////////////////////////////
// example : f1 return sum of prime digits in the string str 
//           f2  suppose x is the first most frequent word in the string str 
//  world = a string without space ).Return the string s, which is obtained by 
// replacing each world x in str with charater 'T'. ( In the sample below x="ab")
//public class MyString implements IString {
//
//    @Override
//    public int f1(String str) {
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (Character.isDigit(c)) {
//                int b = Integer.parseInt("" + c);
//                if (checkPrime(b) == true) {
//                    sum += b;
//                }
//            }
//        }
//            return sum;
//    }
//
//    public boolean checkPrime(int b) {
//        if (b < 2) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(b); i++) {
//            if (b % i == 0) 
//                return false;
//            }
//            return true;
//        }
//    @Override
//public  String f2(String str) {
//    String[] arr = str.split(" ");
//    int maxCount = 0;
//    int vt = 0;
//    for (int i = 0; i < arr.length; i++) {
//        int count = 0;
//        for (int j = i + 1; j < arr.length; j++) {
//            if (check(arr[i], arr[j])) {
//                count++;
//            }
//        }
//        if (count > maxCount) {
//            maxCount = count;
//            vt = i;
//        }
//    }
//    str = str.replaceAll(arr[vt], "T");
//    return str;
//}
//public static boolean check(String arr, String arr1) {
//    if (arr.equals(arr1)) {
//        return true;
//    } else {
//        return false;
//    }
//}
//}
////////////////////////////////////////////////////////////////////////////////
//example : f1- Caculate and return sum of all even digits in str
//          f2- return the string s , which is obtained by reading all character
// is an even digit then rermove it
// Input : a01b2c8d9
//Output : f1 -10  , f2 a1bcd9
public class MyString implements IString {

    @Override
    public int f1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c) == true) {
                int b = Integer.parseInt("" + c);
                if (b % 2 == 0) {
                    sum += b;
                }
            }
        }
        return sum;
    }

    @Override
    public String f2(String str) {
        char arr[] = str.toCharArray();
        String s1 = "";
        int indexArr = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i]) == true) {
                int b = Integer.parseInt("" + arr[i]);
                if (b % 2 != 0) {
                    s1 += arr[i];
                }
            }else{
                 s1 += arr[i];
            }
        }

        return s1;
    }
}
