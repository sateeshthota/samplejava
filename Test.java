import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        // initlaizie array
        // int[] numArray = {3, 4, 5, 6,7};
        // for(int i=0; i< numArray.length; i++) {
        //     System.out.println(numArray[i]);
        // }

        // List<String> sList = Arrays.asList("Anusha", "Sateesh", "Karthikey");
        // List<String> filteredNames = sList.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        // sList.stream().filter(name -> name.startsWith("A")).forEach(System.out::print);;
        // List<Integer> numList = Arrays.asList(4, 6, 7);
        // numList.stream().map(num -> num * num).forEach(System.out::println);
            Stream.of("Anusha", "Sateesh", "Karthikey").forEach(System.out::println);
            List.of("Anusha", "Sateesh", "Karthikey", "Sumukh").stream().filter(name -> name.startsWith("S")).forEach(System.out::println);
            List<Integer> discintList = List.of(6, 7, 8).stream().distinct().forEach(null);;
            System.out.println("Count : " + count);
    }
}
