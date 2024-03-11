import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sample {
    public static void main(String args[]) {

        String[] array1 = {"a","c","e","k","g"};
        String[] array2 = {"a","b","c","d","e","k","f","g"};

        int[] intArr = { 4, 6, 7, 7};
        
        List<Integer> list1 = Arrays.asList(4, 6, 7, 8, 3);
        
        // Remove duplicates
        Set<String> result = new LinkedHashSet<String>();
        result.addAll(Arrays.asList(array1));
        result.addAll(Arrays.asList(array2));

        System.out.println("result : " + result);
    }
}
