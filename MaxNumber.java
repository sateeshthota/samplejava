public class MaxNumber {
    
    public static void main(String args[]) {
        int[] nums = {300,15,6,94,1046};
        int max = nums[0];
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
        }
       System.out.println("Max num is " + max);
    }
}
