import java.util.Random;

public class Main {
    public static void main(String[] args) {
        UnsortedArray arr = new UnsortedArray(100);
        arr.addLast(100); 
        arr.listItems();

        Random rand = new Random();
        rand.setSeed(12345);
        for (int i = 0; i < 50; i++)  arr.addLast(rand.nextInt(300));
        arr.listItems();

        arr.efficientRemoveItem(184);
        System.out.println("you have removed one item with efficientRemoveItem method");
        arr.listItems();
        // System.out.println(arr);

        int index_found = arr.binarySearch(141);
        System.out.println("index found: " + index_found);

        // arr.linearSearch(100);
        // arr.removeItem(100); 
        // System.out.println(arr);

        // arr.selectionSort();
        // System.out.println(arr);
       
        // try to change the insertion to sort Descendant
    }
}
