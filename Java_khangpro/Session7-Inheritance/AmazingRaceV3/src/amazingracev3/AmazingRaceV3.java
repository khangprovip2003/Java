package amazingracev3;
import java.util.*;
import data.*;

public class AmazingRaceV3 {
    public static void main(String[] args) {
        runToDead();
    }

    public static void runToDead(){

//        public static void playAnonymous(){
//            List list = new ArrayList();
//            // abstract,Interface đó
//            List list = new List() {
//                @Override
//                public int size() {
//                    return 0;
//                }
//
//                @Override
//                public boolean isEmpty() {
//                    return false;
//                }
//
//                @Override
//                public boolean contains(Object o) {
//                    return false;
//                }
//
//                @Override
//                public Iterator iterator() {
//                    return null;
//                }
//
//                @Override
//                public Object[] toArray() {
//                    return new Object[0];
//                }
//
//                @Override
//                public Object[] toArray(Object[] a) {
//                    return new Object[0];
//                }
//
//                @Override
//                public boolean add(Object o) {
//                    return false;
//                }
//
//                @Override
//                public boolean remove(Object o) {
//                    return false;
//                }
//
//                @Override
//                public boolean containsAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean addAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean addAll(int index, Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean removeAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public boolean retainAll(Collection c) {
//                    return false;
//                }
//
//                @Override
//                public void clear() {
//
//                }
//
//                @Override
//                public Object get(int index) {
//                    return null;
//                }
//
//                @Override
//                public Object set(int index, Object element) {
//                    return null;
//                }
//
//                @Override
//                public void add(int index, Object element) {
//
//                }
//
//                @Override
//                public Object remove(int index) {
//                    return null;
//                }
//
//                @Override
//                public int indexOf(Object o) {
//                    return 0;
//                }
//
//                @Override
//                public int lastIndexOf(Object o) {
//                    return 0;
//                }
//
//                @Override
//                public ListIterator listIterator() {
//                    return null;
//                }
//
//                @Override
//                public ListIterator listIterator(int index) {
//                    return null;
//                }
//
//                @Override
//                public List subList(int fromIndex, int toIndex) {
//                    return null;
//                }
//            };
//        }

        //CÓ QUYỀN ANONYMOUS CHẠY VÀO
        //MĨ NHẪN NGƯ CỦA CHÂU TINH TRÌ NHẢY VẢO!!!
        //Người cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá , dụ
        // thuỷ thủ đến bắt ăn thịt !!!
        //Nếu ta làm class Mermaid rời - concrete, phải chuột tạo mới class Mermaid
        // viết code bình thường, code này có hàm bătThuyThuVaAnThit()
        // bắt Mermaid implement DeadRacer, bắt người cá đi đua là chuyện quá đáng
        //ko phù hợp logic, người cá ko thích di chuyển đi đua!!!

        // Những có 1 nàng người cá thích ăn chay , lên bờ chơi với con người
        //ko theo logic chung người cá là ăn thịt người thuỷ thủ
        //object lẻ không nhập chung đoàn Mermaid truyền thống
        //ko bắt Mermaid implements DeadRacer
        // Mĩ nhân ngữ  phá đoàn, tham gia đua dưới kênh cho vui
        // không bắt cả họ người cá đi đua
        // object đánh lẻ, đánh lẻ đua , thì chỉ cần đua tốc độ là được rồi
        // Anonymous Class , ko thèm tạo class rời , mà vẫn tham gia CLB
        // chỉ cần có hành động của CLB là oke rồi , ghé ngang thôi thì cũng phải
        // hành động , implement all absstract method on the go ,take-away

        //làm class riêng lẻ để nhân bản nhiều Member
        //làm on the go dành cho vãng lai ghé ngang
        // --> CẢ 2 ĐỀU PHẢI IMPLEMENT,@OVERRIDE VÌ CHA, CLB KO HOẢN HẢO
        // OBJECT ON THE GO , CẦN CÓ HÀM ĐUA VÀ GÁY THÀNH TÍCH LÀ XONG, KO CẦN LÀM CLASS
        //VÀ CÓ SẴN ĐỂ NHÂN BẢN
        //DeathRacer mnnCTT = new Mermaid(); //class rời này sẽ có @Override
                                             //Có 2 hàm runToDead() showHowTo()
                                             // y chang Motor à
        // mượn gió bẻ măng, ko có khuôn sẵn thì phải code @Override từ đầu
        // cho mỗi lần chơi cho làm biếng tạo Khuôn
        // on the gio @Override
        DeathRacer mnnCTT = new DeathRacer() {
            // VÙNG KHÔNG GIAN CỦA CLASS MERMAID MÀ TA LÀM BIẾNG LÀM CỦA CHA / CLB
            // BA SẼ LÀM CÁNH CHIM (new/super()) new DeathEacer()
            // đưa con extends / implements thật xa thật nhiều @Override
            // ta có quyền như truyền thống, thêm đặc điểm,....
            // đừng lạm dụng, on-the-go thì nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50.0;
             @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED ;
            }
            //Anonymous làm biếng tạo class rời chơi cả abstract class và interface
            // bên Abstract class thì ta còn có đặc điểm của Cha cho để xài
            //Anonymous của Interface, đua thì đua , hỏi han làm gì,ko có info

            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n",
                                    "MERMAIR","MNN CTT",runToDead());
            }
        };

        Dog d1 = new Dog("NGÁO ĐÁ",2021,50.0);
        // chấm full hàm của Con, đủ code hàm Cha,CLB

        Pet d2 = new Dog("VÀNG ƠI",1950,10.0);
        // chấm full hàm Cha , chạy ko sợ vì đa hình Con qua mặt Cha
        // tao là " danh nghĩa Cha" thì chỉ xổ Cha thôi
        // ép kiểu được , tổ lái con trỏ được , new Dog mà sợ gì

        DeathRacer d3 = new Dog("NANH TRẮNG",1901,20.0);
        // chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        // tao là đua thủ chỉ quan tâm đua thôi
        // chạy ko sợ vì Con qua mặt, có đủ hàm Override đã làm rồi , đa hình tiếp
        // ép con trỏ được luôn , new Dog mà sợ gì

        Motor m1 = new Motor ("EXCITER","150.0cm3","58F8-22204");
        DeathRacer m2 = new Motor("WINNER","150.0cm3","56F6-6789");

        // khai báo mảng kiểu truyền thống
//        DeathRacer racer[] = new DeathRacer[5];
//        racer[0] = new Dog(...);
//        racer [1] = new Motor(...);

        // mnn vẫn là 1 racer, có hành động đua gấp 3 lần vật lý giới hạn
        // em xứng đáng tham gia câu lạc bộ đua
        DeathRacer racer[] = {mnnCTT,d1,(Dog)d2,d3,m1,m2};  // KHAI BÁO MẢNG GẮN VALUE
        // ÉP VỀ DOG KO THÌ BẮT CẢ CAT CHẠY LUÔN
        // toàn bộ là DeathRacer , đa hình là đa hình trên runToDead() showHowTo()
        // Con tự lo , Con Motor chạy theo kiểu Motor , Con Dog chạy theo kiểu Dog
        System.out.println("The racing record");
        for (DeathRacer x : racer){
            x.showHowToDead();
        }

    }

}


