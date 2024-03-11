import java.util.Arrays;
import java.util.List;

public class StreamsReduce {
    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(1,5,6,8,9);
        int sum = numbers.stream().reduce(0, (a,b) -> a + b);
        System.out.println("sum : " + sum);
    }
}
