
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Khang
 */
public class MyCat implements ICat {

    @Override
    public int f1(List<Cat> list) {
        int count = 0;
        for (Cat cat : list) {
            if (cat.getArea().contains("A") || cat.getArea().contains("B")) {
                count++;
            }
        }
        return count;
    }
// Xóa phần tử lớn thứ 2
    @Override
    public void f2(List<Cat> list) {
        int max = 0;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i).getLeg()) {
                max = list.get(i).getLeg();
                count = i;
            }
        }
        for (int i2 = count + 1; i2 < list.size(); i2++) {
            if (max == list.get(i2).getLeg()) {
                count2 = i2;
                break;
            }
        }
        list.remove(count2);
    }
 // xóa phần tử unit digit  
    @Override
    public void f3(List<Cat> list) {
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = list.get(i).getLeg();
            arr[i] %= 10;
        }

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (arr[i] > arr[j]) {
                    Cat tmp = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, tmp);
                    
                    int tmp1 = arr[i];
                    arr[i]= arr[j];
                    arr[j] = tmp1;
                    
                }
            }

        }
    }

}
