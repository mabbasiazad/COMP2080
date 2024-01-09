import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UnsortedArray arr = new UnsortedArray(100);
        Random rand = new Random();
                System.out.println(arr);
        for (int i = 0; i < 50; i++)  arr.addLast(rand.nextInt(300));

        arr.addLast(100);
        System.out.println(arr);
        System.out.println(arr.linearSearch(100));

        arr.selectionSort();

        System.out.println(arr);

        // try to change the insertion to sort Descendant

    }
}