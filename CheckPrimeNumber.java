public class CheckPrimeNumber {
    public static void main(String[] args) {
        // (e.g. 2, 3, 5, 7, 11):
        int n = 9;
        boolean isPrime = true; 
        if(n == 0 || n == 1) {
            isPrime = false;
        }
        if(n == 2) {
            isPrime = true;
        }
        for(int i = 2; i < n/2; i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        System.out.println("IsPrime : " + isPrime);
    }
}
