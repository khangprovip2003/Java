import java.util.*;

public class BookList {
    private ArrayList<Book> t;
    private Scanner sc = new Scanner(System.in);

    public BookList() {
        t = new ArrayList<>();
    }

    public void inputAndAdd() {
        int count = 1;
        int n, qua;
        String code, title;
        double price;
        System.out.print("Enter the number book(s) to add:");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.print("Enter code:");
            code = sc.nextLine();
            System.out.print("Enter title:");
            title = sc.nextLine();
            System.out.print("Enter qua:");
            qua = Integer.parseInt(sc.nextLine());
            System.out.print("Enter price:");
            price = Double.parseDouble(sc.nextLine());
            t.add(new Book(code, title, qua, price));
            System.out.print("The new book " + count + " has been added successfully\n");
            count++;
        }
    }

    public void displayAllBook() {
        if (t.isEmpty()) {
            System.out.println("The student list is empty.Nothing to print");
            return;
        }
        System.out.println("There is/are " + t.size() + " book(s)");
        for (Book x : t) {
            //    System.out.println(x.toString());
            System.out.println(x);  // implicitly call the toString()
        }
    }

    public Book searchABook(String code) {
        if (t.isEmpty()) {
            return null;
        }
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getCode().equalsIgnoreCase(code))
                return t.get(i);
        } // nếu thấy sach, trả ngay cái thẻ thứ i tham chiếu vùng new có chứa code tìm thấy

        // đi hết cả for ko rẽ ở trên, sure ko tồn tại
        return null;
    }

    // hàm bao hàm search ở trên
    public void searchABook() {
        String keyword;
        System.out.print("Input the code to search: ");
        keyword = sc.nextLine();
        Book xxx = searchABook(keyword);
        if (xxx == null) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("FOUND.Here book is");
            System.out.println(xxx);
        }
    }

    public void updateABook() {
        String keyword;
        double newGPA;
        System.out.print("Input the code to update : ");
        keyword = sc.nextLine();
        Book xxx = searchABook(keyword);

        if (xxx == null) {
            System.out.println("NOT FOUND! NOTHING TO UPDATE");
        } else {
            System.out.print("Input a new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            xxx.setPrice(newGPA);
            System.out.println("Has been updated successfully");
        }
    }

    public int findMaxPriceIndex() {
        if (t.isEmpty()) {
            System.out.println("The book list is empty.Nothing to findMaxIndex");
        }
        int maxIndex = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getPrice() > t.get(maxIndex).getPrice()) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void sortByCode() {
        if (t.isEmpty()) {
            System.out.println("The book list is empty. Nothing to sort.");
            return;
        }
        for (int i = 0; i < t.size() - 1; i++) {
            for (int j = i + 1; j < t.size(); j++) {
                if (t.get(i).getCode().compareToIgnoreCase(t.get(j).getCode()) > 0) {
                    Book tmp = t.get(i);
                    t.set(i, t.get(j));
                    t.set(j, tmp);
                }
            }
        }
        System.out.println("Book list sorted by code in ascending order.");
    }

    // Phương compareToIgnoreCasethức trả về một giá trị số nguyên cho biết kết quả so sánh
    //Nếu chuỗi đầu tiên lớn hơn chuỗi thứ hai về mặt từ điển, thì phương thức này trả về một số nguyên dương
    //Nếu chuỗi đầu tiên nhỏ hơn chuỗi thứ hai về mặt từ điển, phương thức sẽ trả về một số nguyên âm
    //Nếu hai chuỗi bằng nhau, phương thức trả về 0.
    public void removeTheBook() {
        String keyword;
        System.out.print("Input the code to remove : ");
        keyword = sc.nextLine();
        Book xxx = searchABook(keyword);
        if (xxx == null) {
            System.out.println("NOT FOUND! NOTHING TO REMOVE");
        } else {
            t.remove(xxx);
            System.out.println("Has been removed successfully");
        }
    }

}
