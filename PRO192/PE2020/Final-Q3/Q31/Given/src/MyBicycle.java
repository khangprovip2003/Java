
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author asus
 */
public class MyBicycle implements IBicycle {

    @Override
    public void f1(List<Bicycle> a) {
        float min = a.get(0).getPrice();
        int IndexMin = 0;
        for (int i = a.size() - 1; i >= 0; i--) {
            if (min > a.get(i).getPrice()) {
                min = a.get(i).getPrice();
                IndexMin++;
            }
        }
        a.remove(IndexMin);
    }

    @Override
    public int f2(List<Bicycle> a, String name) {
        int count = 0;
        String txt = name.toUpperCase();
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().endsWith(name) || a.get(i).getName().endsWith(txt)){
                count ++;
            }
        }
        return count;
    }

}
