import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortArray {
    public static void main(String[] args) {
        Integer[] arr = {9,6,7,8,2,1, 5,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> numList = Arrays.asList(6,7,6,7);
        Collections.sort(numList);
        System.out.println("numList : " + numList);

        // Removing duplicates
        Integer[] arr1 = {9,6,7,8,7,1, 5,8};
        Arrays.sort(arr1);
        System.out.println("arr1 : " + arr1);

        // Remove duplicates
        List<String> list1 = Arrays.asList("a", "c", "f", "d", "c");
        List<String> list2 = Arrays.asList("e", "c", "f", "b", "c");
        Set<String> result = new LinkedHashSet<String>();
        result.addAll(list1);
        result.addAll(list2);
        TreeSet<String> sortedResult = new TreeSet<String>(result);
        System.out.println("sortedResult: " + sortedResult);

    }
}
