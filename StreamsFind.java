import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsFind {
    public static void main(String args[]) {
        List<Integer> numList = Arrays.asList(1, 5, 9, 7, 10);
        Optional<Integer> result = numList.stream().filter(num -> num % 2 == 0).findAny();
        result.ifPresent(System.out::println);
    }
}
