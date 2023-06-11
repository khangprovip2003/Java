
import java.util.List;
/*
f1:Suppose owners contain at least 2 characters.Count and return number of elements
with owner having 2nd character
Input: (A1B,5) (BC2,4) (CT,3) (D3X,4) (2E1,5) (FY4)
Output:                 2

f2: Remove the second elemnet having maximum price ( do nothing if only one max
element in the list)
Input: (A,4) (C,3) (B,7) (D,3),(E,7) (F,5)
Output: (A,4) (C,3) (B,7) (D,3) (F,5)

f3: Sort the list t ascendingly by the 2nd character of owner 
(A8,1) (B1,2) (C7,3) (D2,4) (E6,5) (F3,6) 
(B1,2) (D2,4) (F3,6) (E6,5) (C7,3) (A8,1)


*/

public class MyCala implements ICala {
// 

    @Override
    public int f1(List<Cala> t) {
        int maxCount = 0;
        for (int i = 0; i < t.size(); i++) {
            int count = 0;
            int count2 = 0;
            for (int j = 0; j < t.get(i).getOwner().length(); j++) {
                char c = t.get(i).getOwner().charAt(j);
                if (Character.isLetter(c)) {
                    count++;
                }
            }
            if (t.get(i).getOwner().length() >= 3) {
                char c2 = t.get(i).getOwner().charAt(2);
                if (Character.isLetter(c2)) {
                    count2++;
                }
            }
            if (count >= 1 && count2 > 0) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    @Override
    public void f2(List<Cala> t) {
        int indexMax = 0;
        int max = t.get(0).getPrice();
        for (int i = 1; i < t.size(); i++) {
            if (max < t.get(i).getPrice()) {
                max = t.get(i).getPrice();
                indexMax = i;
            }
        }
        for (int i = indexMax + 1; i < t.size(); i++) {
            if (t.get(i).getPrice() == t.get(indexMax).getPrice()) {
                t.remove(i);
            }
        }

    }

    @Override
    public void f3(List<Cala> t) {
        for (int i = 0; i < t.size(); i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if (t.get(i).getOwner().length() >= 2 && t.get(j).getOwner().length() >= 2) {
                    char c1 = t.get(i).getOwner().charAt(1);
                    char c2 = t.get(j).getOwner().charAt(1);
                    if (Character.isDigit(c1) && Character.isDigit(c2)) {
                        int b1 = Integer.parseInt("" + c1);
                        int b2 = Integer.parseInt("" + c2);
                        System.out.println(b1);
                        System.out.println(b2);
                        if (b1 > b2) {
                            Cala tmp = t.get(i);
                            t.set(i, t.get(j));
                            t.set(j, tmp);
                        }
                    }
                }
            }
        }

    }
}
