public class PrintStars {
    public void printstars(int n) {
        if (n == 0) return;
        printInRow(n); 
        System.out.println();
        printstars(n - 1);
    }

    private void printInRow(int n) {
        if (n == 0) return;
        System.out.print("* ");
        printInRow(n - 1);
    }

    public static void main(String[] args) {
        PrintStars obj = new PrintStars(); 
        int n = 4;
        obj.printstars(n);
    }
}
