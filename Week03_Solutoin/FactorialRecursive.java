/**
 * FactorialRecursive
 */
public class FactorialRecursive {
    public long factorial(int n) {
        if (n == 0 || n == 1) return n;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        FactorialRecursive obj = new FactorialRecursive();
        int n= 3;
        System.out.println(n + "! is equal to: " + obj.factorial(n));
    }
}