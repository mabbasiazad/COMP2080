public class FactorialTailRecur {
    private static long factorialTRIter(int n, long acc) {
        if (n == 0 || n == 1) return acc;
        return factorialTRIter(n - 1 , n * acc);
    }

    public static long factorialTR(int n) {
        return factorialTRIter(n, 1);
    }

    public static void main(String[] args) {
        int n = 3; 
        System.out.println(n + "! is equal to: " + factorialTR(n));
        
    }
    
}
