import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UnsortedArray arr = new UnsortedArray(100);
        System.out.println(arr);
        arr.addLast(100); 
        System.out.println(arr);

        Random rand = new Random();
        for (int i = 0; i < 50; i++)  arr.addLast(rand.nextInt(300));
        System.out.println(arr);

        // arr.linearSearch(100);
        // arr.removeItem(100); 
        // System.out.println(arr);

        arr.selectionSort();
        System.out.println(arr);
       
        // try to change the insertion to sort Descendant
    }
}
