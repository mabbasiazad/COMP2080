/**
 * FactorialRecursive
 */
public class FactorialRecursive {

    public int factorial(int n) {
        if (n == 1 || n == 0) return 1; //base case
        return n * factorial(n - 1); //recursion line

    }
    public static void main(String[] args) {
        FactorialRecursive obj = new FactorialRecursive();
        int n = 4;
        int result = obj.factorial(n);
        //int result = factorial(n);
        System.out.println("the result of " + n + "! is equal to: " + result);
        
        
    }
}