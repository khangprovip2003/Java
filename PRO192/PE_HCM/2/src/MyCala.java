
import java.util.List;
/*
f1 : Count and return number of elements that its price is an even number
f2 : Remove element having minimum price
f3 : sort the list t descendingly ny 1st character of thr owwner
inpur : (A8,1) (B1,2) (c7,3) (D2,8) (E6,5) (F3,6)
ouput: : (F3,6) (E6,5) (D2,4) (C7,3) (B1,2) (A8,1)
*/

public class MyCala implements ICala {

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int indexMax = 0;
        int min = t.get(0).getPrice();
        for (int i = 1; i < t.size(); i++) {
            if (min > t.get(i).getPrice()) {
                min = t.get(i).getPrice();
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
                char c = t.get(i).getOwner().charAt(0);
                char c1 = t.get(j).getOwner().charAt(0);
                if (Character.isLetter(c1) && Character.isLetter(c)) {
                    if (Character.compare(c, c1) < 0) {
                        Cala tmp = t.get(i);
                        t.set(i, t.get(j));
                        t.set(j, tmp);
                    }
                }
            }
        }
    }

}
