/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Khang
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
        String arr[] = str.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                char c = arr[i].charAt(j);
                if (Character.isDigit(c)) {
                    int b = Integer.parseInt("" + c);
                    if (b % 2 != 0) {
                        count ++;
                    }
                }
            }
        }
        return count ;
    }

    boolean check(String s){
        String s1="";
        for(int i=s.length()-1; i>=0; i--){
            s1+=s.charAt(i);
        }
        if(s1.equals(s)){
            return true;
        }
        return false;
    }
    
    
    
    @Override
    public String f2(String str) {
        int count = 0;
        String arr[] = str.split("\\s");
        for (int i = 0; i < str.length(); i++) {
            if(check(arr[i]) == true){
                count=i;
                break;
            }
        }
         return arr[count];
    }
       
}
    

