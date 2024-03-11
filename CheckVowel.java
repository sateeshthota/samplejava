import java.util.ArrayList;
import java.util.List;

public class CheckVowel {
    public static void main(String[] args) {
        String input = "Hllu".toLowerCase();
        boolean hasVowel = false;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || 
            input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                hasVowel = true;
            }
        }
        
        System.out.println(" regx : " + input.toLowerCase().matches(".*[aeiou].*"));
        System.out.println("hasVowel : " + hasVowel);

        // List<int> list = new ArrayList<int>();
        // DB question

        // elango - architect - sast, dast scan
        // rest api, spring-batch - parameters
        // maven 
        // ejbs 
        // microservices , docker, 
    }
}
