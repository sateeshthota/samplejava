public class FindMissingNumber {
    public static void main(String args[]) {
        int[] numbers = {1, 2, 3, 4, 5, 7};
        int missingNumber=0;
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i] != i + 1) {
                missingNumber =  i + 1;
                break;
            }
        }
        System.out.println(missingNumber);
    }
}
