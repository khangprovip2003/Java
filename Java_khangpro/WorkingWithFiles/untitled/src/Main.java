import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {
    //1.Write String or Array
    //2.Write object or list object
    //3.read data from file

//    public static void main(String[] args) {
//        String txt = "Nguyen Van a";
//        String arr[] = {"nguyen van b", "Nguyen van c","le thi d"};
//    // dùng try,catch để dễ xử lý
////        try{
////            // Ghi dữ liệu thì mặc định xoá dữ liệu cũ và ghi dữ liệu mới vào
////            FileWriter fw =  new FileWriter("data.txt");
////            // BufferedWriter để ghi dữ liệu vào file
////            BufferedWriter bw = new BufferedWriter(fw);
////            bw.write(txt); // ghi txt vào trong file
////            // khi ghi xong thì đóng lại
////            bw.close();
////            fw.close();
////
////        }catch(Exception e){
////        }
////        /////////////////////
////        try{
////            //lúc này xoá dữ liệu cũ Nguyen Van a  và thêm dữ liệu mới là tên trong mảng  .
////            FileWriter fw =  new FileWriter("data.txt");
////            BufferedWriter bw = new BufferedWriter(fw);
////            for(String s : arr){
////                bw.write(s);
////                bw.newLine(); // khởi tạo dòng mới ( xuống dòng)
////            }
////            bw.close();
////            fw.close();
////        }catch(Exception e){
////        }
//    //////////////////////
//        try{
//            //Nó sẽ không xoá dữ liệu cũ mà ghi tiếp vào file
//            FileWriter fw =  new FileWriter("data.txt",true);
//            BufferedWriter bw = new BufferedWriter(fw);
//            for(String s : arr){
//                bw.write(s);
//                bw.newLine(); // khởi tạo dòng mới ( xuống dòng)
//            }
//            bw.close();
//            fw.close();
//        }catch(Exception e){
//        }
//    }

    //  HƯỚNG ĐỐI TƯỢNG

    public void writeToFile(List<Student> list) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student o : list) {
                bw.write(o.toString());
                bw.newLine();
            }

//            bw.write(s.toString());
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    public List<Student> readFromFile(){
        List<Student> list = new ArrayList();
        //ĐỌC DỮ LIỆU TỪ FILE
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = ""; //
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                } else {
                    String txt[] = line.split(";");
                    String name = txt[0];
                    int age = Integer.parseInt(txt[1]);
                    double mark = Double.parseDouble(txt[2]);
                    list.add(new Student(name,age,mark));
                    System.out.println(line);
                }
            }
        } catch (Exception e) {

        }
        return  list;
    }

    public static void main(String[] args) {
//        Student s = new Student("Nguyen van a", 21, 8.5);
//        Student s1 = new Student("Nguyen van b", 22, 8.6);
//        Student s2 = new Student("Nguyen van c", 23, 8.7);
//        Student s3 = new Student("Nguyen van d", 24, 8.8);
//        Student s4 = new Student("Nguyen van e", 25, 8.9);
//        List<Student> list = new ArrayList();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
        Main m = new Main();
        List<Student> list = m.readFromFile();
        //trả về 1 list Student được đọc trong file
        for(Student o : list){
            System.out.println(o);
        }

    }

}