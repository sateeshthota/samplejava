import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamStartsWith {
     public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Devolder");
        // filter names which start with 'C'
        Optional<String> firstElement = names.stream().findFirst();
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("C")).collect(Collectors.toList());
        names.stream().filter(name -> name.startsWith("D")).forEach(System.out::println);

        System.out.println(firstElement); // Output: [Alice]

        System.out.println(filteredNames); // Output: [Alice]
    }
}
