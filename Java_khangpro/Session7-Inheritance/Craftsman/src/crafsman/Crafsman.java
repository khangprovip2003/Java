package crafsman;

import data.*;


public class Crafsman {
    public static void main(String[] args) {
        // cutShapes();
        sortShapes();
    }

    //cô giáo: sắp xếp các hình tăng dần theo diện tích
    // muốn sắp xếp thì phải vào mảng thì ta mới sort tự động,vì kích thước hình
    // và diện tích hình là chưa biết trước nếu nhập từ bàn phím
    //
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);

        Rectangle rectArr[] = new Rectangle[9];
        // có 9 biến Rectangle,chưa có hình cụ thể nào
        // lớp có 30 chỗ ngồi,chưa có bạn nào đến
        //recArr[i] = new Rect(....) // [i] cần trỏ vùng new Rectangle()
        //                                               new cũ,mới ,không quan tâm
        //                                               chỉ quan tâm vùng clone new Rect
        rectArr[0] = r1; // 2 chàng 1 nàng clone TÍA
//        rectArr[0].paint();
//        rectArr[0].setOwner("YÊU TÍA");
//        r1.paint(); // YÊU TÍA
        rectArr[1] = new Rectangle("MÁ", "PINK", 3.0, 4.0);
        rectArr[2] = new Rectangle("A.HAI", "BLUE", 3.0, 3.0);

        //hình vuông sắp xếp luôn,vào chung mảng luôn!!!

        //rectArr[3] = new Square ("G.A.HAI","BLUE",5.0);
        // không cùng kiểu,không củng hệ ,không cùng data type,không chung mảng,không sort được
        //Lý Thuyết: Muốn sort cho vuông và chữ nhật thì hai thằng này phải cùng mảng
        // Vì vậy nó phải là 1 mảng, còn nay chúng ta gặp vấn đề 2 khuôn độc lập,2 mảng độc lập


        System.out.println("The list of rectangles");

//        for(Rectangle x : rectArr){
//            x.paint();  // x = arr[i]
//        } // dùng như này null POINTER EXCEPTION
        // chỉ for đến chỗ đã trỏ/gán của mảng. count trong bài cái tủ
        System.out.println("Before sorting:");
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
        System.out.println("After sorting ascending by area:");
        // sort tăng dần theo diện tích giống theo gpa
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle tmp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = tmp;
                }
            }

        }
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

        public static void cutShapes() {
            Rectangle r1 = new Rectangle("TÍA", "PINK", 1.0, 2.0);
            r1.paint();

            Square s1 = new Square("MÁ", "PINK", 3);
            s1.paint();

            Disk d1 = new Disk("BÉ NA", "RAINBOW", ":)", 2.0);
            d1.paint();
        }
    }

