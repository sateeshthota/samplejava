public class Fibonacci {
    public static void main(String args[]) {
        // 0,1,1,2,3,5,8,13,21
        System.out.println(Fibonacci.fibonacci(8));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
