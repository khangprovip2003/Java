import java.util.Optional;

public class Main {
    public static void main(String[] args) {
    //    Optional<Object> empty = Optional.empty(); // opt+cmd+v
//        Optional<String> empty = Optional.of("hello");
//        System.out.println(empty.isPresent());
//        System.out.println(empty.isEmpty());
//
//       String orElse = empty.orElse("world");
//        System.out.println(orElse);
    ////////////////////////////////////
//     //   Optional<String> hello = Optional.of(null);// NullPointerException
//        Optional<String> hello = Optional.ofNullable(null);
//        System.out.println(hello.isPresent());
//        System.out.println(hello.isEmpty());

//        String orElse = hello
        // map allows me to do a transformation on the actual value
 //               .map(String:: toUpperCase )
//                .orElse("world");
// Or
//                .map(String:: toUpperCase )
//                .orElseGet(() -> {
//                    //...extra computation to retrieve the value
//                    //return the value
//                    return"world";
//                });
// orElseGet() allows us to pass a runnable and inside
        //////////////////////////
//Or
       //         .map(String:: toUpperCase )
       // .orElseThrow(IllegalAccessError::new);
//   System.out.println(orElse);

        /////////////////////////////////
        Optional<String> hello = Optional.ofNullable("hello");
        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());
        hello.ifPresent(word -> {
            System.out.println(word);
        });



    }
}