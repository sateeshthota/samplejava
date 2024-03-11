import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsMappedList {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(squaredNumbers); // Output: [1, 4, 9, 16, 25]
        List<Integer> sortedNumbers = squaredNumbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers); // Output: [1, 4, 9, 16, 25]

    }
}
