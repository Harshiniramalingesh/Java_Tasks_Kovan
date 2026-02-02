package recursivemethods;

public class FibonacciNumbers {
    
    static long[] memo;

    static long fib(int n) {
       
        if (n <= 1) {
            return n;
        }

     
        if (memo[n] != 0) {
            return memo[n];
        }

       
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        memo = new long[n + 1];

        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
