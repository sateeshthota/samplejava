import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateChars {
    public static void main(String[] args) {
        String input = "a,c,e,k,g";
        String input2 = "a,b,c,d,e,k,f,g";
        String[] arr1 = input.split(",");
        String[] arr2 = input2.split(",");
        Set<Character> results = new LinkedHashSet<Character>();
        results.addAll(Arrays.asList(arr1)));
        results.addAll(arr1);

        System.out.println("inputArray1 : " + arr1);
        System.out.println("inputArray2 : " + arr2);
    }
}