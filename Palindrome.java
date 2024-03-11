public class Palindrome {
    
    public static void main(String args[]) {
        String input = "level";
        char[] inputArray = input.toCharArray();
        boolean isPalindrome = true;
        for(int i = 1; i <= inputArray.length/2; i++) {
            if(inputArray[i - 1] != inputArray[inputArray.length - i]) {
                isPalindrome =  false;
                System.out.println("inputArray[i] : " + inputArray[i - 1]);
                System.out.println("inputArray.length : " +inputArray[inputArray.length - i]);
                break;
            }
        }
        System.out.println("isPalindrome : " + isPalindrome);
    }
}
