import java.util.Optional;
import java.util.function.Function;


public class Main {
    public static void main(String[] args) {
        Optional<String> value = Optional.of("value");
        Function<String, Optional<Integer>> mapper = s -> Optional.of(s.length());

        Optional<Integer> result = value.flatMap(mapper);
        System.out.println(result); // Output: Optional[5]
    }
}

