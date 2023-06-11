/*
    1,ĐỊNH NGHĨA BIỂU THỨC LAMBDA : Lambda Expression là một hàm không tên ( Anonymous Method/Functiop) dùng tên thay thế cho
Anonymous Class trong việc hiện thực hoá đối tượng / implement thuộc về Functional Interface
( Interface chỉ có duy nhất một hàm abstract). Là một cách cài đặt code cho object thuộc vể một Functional Interface.
viết siêu ngắn gọn đến mức bỏ luôn tên hàm @Override , chỉ còn lại cái dây nịt - chỉ còn cái tên tham số và cái body of
method

    2,CÁC CÁCH CHƠI VỚI  ABSTRACT/KẾ THỪA/INTERFACE : Khai Cha new Con(); Khai Con new Cha (); Khai cha new Cha()- nếu
Cha có abstract thì Anonymous class xuất hiện. Nếu Cha-Interface chỉ có duy nhất 1 hàm abstract thì Lambda Expression
xuất hiện

    3, CHƠI VỚI LAMBDA EXPRESION THẾ NÀO :

     - Tạo Function Interface của riêng bạn hoặc sử dụng các Function Interface có sẵn đâu đó trong JDK trong các thư
     viện của nhà người ta (.jar).Function Interface là interface chỉ có 1 hàm abstract duy nhất.Ví dụ :Comparator,
     Runable,.....

     - Tạo Anonymous Inner Class là cách truyền thống , chờ IDE tool gợi ý bấm nút chuyển đổi sang biểu thức Lambda

     -Chủ động sử dụng biểu thức Lambda thay cho Anonymous Inner Class, thực ra ta Focus vào việc viết code cho 1 hàm
     abstract duy nhất , chỉ tập trung vào hàm , loại bỏ tất cả râu ria, new , tên class, tên hàm , chỉ tập trung cái dây
     nịt còn lại đầu vào hàm + body hàm( code trong hàm )

     4. CÁC HÌNH DẠNG CỦA BIỂU THỨC LAMBDA
Có thể viết lambda expression bằng nhiều cách tùy thuộc vào cấu trúc hàm abstract cần cài đặt bên phía Functional Interface.
Template chung của biểu thức Lambda:

    (Tham số/đầu vào của hàm abstract) -> {code cần cài đặt cho hàm abstract}

    • Kiểu dữ liệu truyền vào: không cần, compiler tự suy luận từ tên hàm abstract của Functional Interface

    • Dấu ngoặc tròn ở tham số của hàm ( ): nếu hàm có một tham số thì có thể bỏ qua dấu ngoặc, tham số đứng một mình okie

    • Dấu ngoặc nhọn ở thân hàm { }: nếu thân hàm hay biểu thức lambda chỉ có 1 lệnh thì có thể bỏ luôn { }

    • Lệnh return trong hàm: nếu thân hàm chỉ có 1 lệnh thì có thể bỏ luôn return. Bắt buộc phải sử dụng return khi thân
    hàm/biểu thức Lambda chứa nhiều hơn 1 câu lệnh


    5. CÁC CÁCH VIẾT LAMBDA TIÊU BIỂU
    • () -> expression                          // Không tham số, một ngoặc tròn, một lệnh, không dấu ;
    • biến-obj-x -> expression                  // Một tham số, không ngoặc tròn, một lệnh, không dấu ;
    • (biến-obj-x) -> expression                // Một tham số, một ngoặc tròn, một lệnh, không dấu ;
    • (arguments) -> expression                 // Nhiều tham số cách nhau dấu phẩy, một lệnh, không dấu ;
    • (arg1, arg2, ...) -> {                    // Nhiều tham số cách nhau dấu phẩy, ngoặc nhọn thân hàm {}

    body-statements;     // 1 hoặc nhiều lệnh, dấu ; như hàm bình thường

    return value;       // Nếu hàm cần return thì viết như hàm bình thường
                           } 

 */