
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import jdk.nashorn.internal.parser.TokenType;

public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        int ave = 0;
        int sum = 0;
        int count = 0;
        for (Car car : t) {
            sum += car.getRate();
            count++;
        }
        return ave = (int) sum / count;
    }

    @Override
    public void f2(List<Car> t) {
//        Collections.sort(t, new Comparator<Car>(){
//            @Override
//            public int compare(Car o1, Car o2) {
//            if(o1.getRate() > o2.getRate()){
//                return 1;
//            }else if (o1.getRate() < o2.getRate()){
//                return -1;
//            }else{
//                return o1.getMaker().compareToIgnoreCase(o2.getMaker());
//            }                                                                                                                                                                                                                                                                             
//            }
//        
//    });
        // 
        int IndexMax = FindMax(t);
        int IndexMin = FindMin(t);
            Car tmp = t.get(IndexMin);
            t.set(IndexMin, t.get(IndexMax));
            t.set(IndexMax, tmp);

        
    }

    @Override
    public void f3(List<Car> t) {
        Collections.sort(t, new Comparator<Car>(){
            @Override
            public int compare(Car o1, Car o2) {
            int alphabe = o1.getMaker().compareToIgnoreCase(o2.getMaker());
            if( alphabe == 1 ){
                return  1;
            }else if ( alphabe == 0 ){
                if(o1.getRate() < o2.getRate()){
                    return 1;
                }
            }
                    return -1;
            }
        
    });
    }

    private int FindMax(List<Car> t) {
        int max = t.get(0).getRate();
        int count = 0;
        for (int i = 1; i < t.size() ; i++) {
            if (max < t.get(i).getRate()){
                max = t.get(i).getRate();
                count = i;
            }
            
        }
        return count;
    }

    private int FindMin(List<Car> t) {
        int min = t.get(0).getRate();
        int count = 0;
        for (int i = 1; i <t.size() ; i++) {
            if (min > t.get(i).getRate()){
                min = t.get(i).getRate();
                count = i;
            }
        }
        return count;
    }

}
