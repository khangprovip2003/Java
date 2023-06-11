
public class MyString implements IString {
//F1: Count and return number of words ending with 'm' or 'n' 
//F2: Return the string s, which is obtained by reversing the (first) longest 
//word in the string str (word = a string without spaces(s))

//Input f1: am bn cd uvm -> output: 3
//Input f2: ab bc abcde uv bcdef xy -> output: ab bc edcba uv bcdef xy    
    @Override
    public int f1(String arg0) {
        int result = 0;
        arg0 = arg0.toLowerCase();
        String words[] = arg0.split("\\s");
        for (String string : words) {
            if (string.endsWith("m") || string.endsWith("n")) {
                result++;
            }
        }

        return result;
    }

//	@Override
//	public String f2(String arg0) {
//		// TODO Auto-generated method stub
//		String result ="";
//		String word[] = arg0.split("\\s");
//		//find the longest word in the string
//		int max = word[0].length();
//                int position = 0;
//		for (int i = 0; i < word.length; i++) {
//			if (word[i].length() > max ) {
//				max  = word[i].length();
//				position = i;
//			}
//		}
//		//reversing the word
//		result = new StringBuilder(word[position]).reverse().toString();
//		arg0 = arg0.replaceFirst(word[position], result);
//		return arg0;
//	}
// cach 2:    
    @Override
    public String f2(String str) {
        String arr[] = str.split("\\s");
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = arr[0].length();
            if (max < arr[i].length()) {
                max = arr[i].length();
                indexMax = i;
                break;
            }
        }
        String s1 = "";
        for (int i = arr[indexMax].length() - 1; i >= 0; i--) {
            s1 += arr[indexMax].charAt(i);
        }
        String b2 = str.replaceAll(arr[indexMax],s1);
        return b2;
    }

}
