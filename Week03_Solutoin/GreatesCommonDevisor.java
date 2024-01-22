public class GreatesCommonDevisor {
    public int gcd(int a, int b) {
        if (b == 0) return a; 
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        GreatesCommonDevisor greatcomdev = new GreatesCommonDevisor();
        int a = 12;
        int b = 8;
        System.out.println("the greatest common devisor of " + a + " and " + b + 
                    " = " + greatcomdev.gcd(a, b)); 
    
 }   
}
