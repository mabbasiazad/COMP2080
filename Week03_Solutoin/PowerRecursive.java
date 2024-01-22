public class PowerRecursive {
    public long power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }

    public long powerHalf(int x, int n) {
        if (n == 0) return 1; 
        long temp = power(x, n / 2);
        if (n % 2 == 0) //if n if ever
            return  temp * temp;
        else
            return x * temp * temp;
    }

    public static void main(String[] args) {
        PowerRecursive obj = new PowerRecursive(); 
        int base = 2;
        int exponent = 6; 
        long result;

        long startTime = System.nanoTime();
        result = obj.power(base, exponent);
        long endTime = System.nanoTime();
        long timeTaken = endTime - startTime;
        System.out.print(base + " ** " + exponent + " = " + result);
        System.out.println("\t method: power " + "\ttime taken: " + timeTaken);

        startTime = System.nanoTime();
        result = obj.powerHalf(base, exponent);
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.print(base + " ** " + exponent + " = " + result);
        System.out.println("\t method: half power " + "\ttime taken: " + timeTaken);

        double base_ = 2.0;
        double exponent_ = 6.0;
        double result_;
        startTime = System.nanoTime();
        result_ = Math.pow(base_, exponent_);
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;
        System.out.print(base_ + " ** " + exponent_ + " = " + result_);
        System.out.println("\t method: builtin power " + "\ttime taken: " + timeTaken);

        
        
        
        
    }
}
