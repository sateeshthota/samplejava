import java.util.*;
import java.util.stream.*;

public class Sum {
    public static void main(String args[]) {
        Integer array1[] = {1, 4, 6, 7, 1};
        
        // int total = 0;
        // for(int i =0; i < array1.length; i++) {
        //     total = total + array1[i];
        // }
        int sum = Stream.of(array1).mapToInt(n -> n).sum();
        
        System.out.println("Sum : " + sum);
        removeDuplicates();
    }

    private static void removeDuplicates() {
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
        List<String> distinct = list.stream().distinct().collect(Collectors.toList());
        System.out.println("distinct : " + distinct);

    }
}
