public class FibonacciRecursive {
    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if (n == 1) return 1; 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int numElem = 20;
        for (int i = 0; i < numElem; i++) {
            System.out.print(fibonacci(i) + " "); 
        }                 
    }
}
