
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javafx.beans.binding.Bindings;
import javax.smartcardio.Card;
import jdk.nashorn.internal.objects.NativeString;
//
//public class MyBrick implements IBrick {
//
//	@Override
//	public int f1(List<Brick> arg0) {
//		int result  = 0;
//		for (Brick brick : arg0) {
//			if (Character.isDigit(brick.getPlace().charAt(0)) == true && Character.isLetter(brick.getPlace().charAt(brick.getPlace().length()-1))==true) {
//				result++;
//			}
//		}
//		
//		
//		return result;
//	}
//
//	@Override
//	public void f2(List<Brick> arg0) {
//		int max = arg0.get(0).getPrice();
//		int position = 0;
//		for (int i = 0; i < arg0.size(); i++) {
//			if(arg0.get(i).getPrice() > max && arg0.get(i).getPrice() %2 == 1) {
//				max = arg0.get(i).getPrice();
//				position = i;
//			}
//		}
//		arg0.get(position).setPlace("XX");
//		
//	}
//
//	@Override
//	public void f3(List<Brick> arg0) {
//		// find the position of first brick having maximum 
//		int max = arg0.get(0).getPrice();
//		int position = 0;
//		for (int i = 0; i < arg0.size(); i++) {
//			if(arg0.get(i).getPrice() > max ) {
//				max = arg0.get(i).getPrice();
//				position = i;
//			}
//		}
//		//sort all elements before it 
//		Collections.sort(arg0.subList(0, position),new Comparator<Brick>() {
//
//			@Override
//			public int compare(Brick o1, Brick o2) {
//				
//				return o1.getPrice() - o2.getPrice();
//			}
//		});
//	}
//
//}

public class MyBrick implements IBrick {

    @Override
    public int f1(List<Brick> t) {
        int count = 0;
        //char[] ch;
        int n = t.size();
        for (int i = 0; i < t.size(); i++) {
            //ch = t.get(i).getPlace().toCharArray();
            boolean b1 = Character.isDigit(t.get(i).getPlace().charAt(0));
            boolean b2 = Character.isLetter(t.get(i).getPlace().charAt(t.get(i).getPlace().length() - 1));

            if (b1 == true && b2 == true) {
                count++;
            }
        }
        return count;

    }

    @Override
    public void f2(List<Brick> t) {
        int max = t.get(0).getPrice();
        int indexMax = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() % 2 != 0) {
                if (t.get(i).getPrice() > max) {
                    max = t.get(i).getPrice();
                    indexMax = i;
                }
            }
        }
        //   replace(t.get(indexMax).getPlace(), "XX");
        t.get(indexMax).setPlace("XX");

    }

    @Override
    public void f3(List<Brick> t) {
        int max = t.get(0).getPrice();
        int indexMax = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getPrice() > max) {
                max = t.get(i).getPrice();
                indexMax = i;
            }
        }
        for (int i = 0; i < indexMax; i++) {
            for (int j = i + 1; j < indexMax; j++) {
                if(t.get(i).getPrice() > t.get(j).getPrice()){
                    Brick tmp = t.get(i);
                    t.set(i,t.get(j) );
                    t.set(j, tmp);
                }
            }
            
        }
                      
    }

}
