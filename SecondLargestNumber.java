public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {6,7,4,5,8};
        int largest = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i > largest) {
                secondLargestNumber = largest;
                largest = i;
            } else if(i > secondLargestNumber) {
                secondLargestNumber = i;
            }
        }
        System.out.println("Second Highest : " + secondLargestNumber);
    }
}
