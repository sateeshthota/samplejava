public class Reverse {
    public static void main(String[] args) {
        String input = "reverse";
        String output = "";
        StringBuilder sb = new StringBuilder();
        for(int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        System.out.println("output is " + sb.toString());
    }
}
