import java.util.Random;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        UnsortedArray arr = new UnsortedArray(100);
        arr.listItems();
        // arr.addLast(100); 
        // System.out.println(arr);

        Random rand = new Random();
        rand.setSeed(12345);
        for (int i = 0; i < 50; i++)  arr.addLast(rand.nextInt(300));
        arr.listItems();
        //UnsortedArray originalArray = (UnsortedArray) arr.clone();
        UnsortedArray originalArray = new UnsortedArray(arr); 

        System.out.println("array after removItem");
        arr.removeItem(280);
        arr.listItems();

        System.out.println("original array");
        originalArray.listItems();

        originalArray.efficientRemoveItem(280); 
        System.out.println("array after efficientRemoveItem");
        originalArray.listItems();

        // arr.linearSearch(100);
        // arr.removeItem(100); 
        // System.out.println(arr);

        // arr.selectionSort();
        // System.out.println(arr);
       
        // try to change the insertion to sort Descendant
    }
}
