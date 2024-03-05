import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * StackArray
 */
// Array implemetaion of stack
 public class StackArray {
    private String[] stackArray; 
    //what variables should I monitor for stack
    private int stackSize; 
    private int topOfStack = -1; 
    //an index that keep track of the last element of the stack

    StackArray(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    public void push(String data) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = data;            
        } else {
            System.out.println("list full");
        }
    }

    public String pop() {
        
    }
    
    public void displayStack() {
        for (int n = 0; n < 61; n++) System.out.print("-");

        System.out.println();

        for (int n = 0; n < stackSize; n++) {
            System.out.format("| %2s " + " ", n);
        }

        System.out.println("|");

        for (int n = 0; n < 61; n++)
            System.out.print("-");

        System.out.println();

        for (int n = 0; n < stackSize; n++) {
            if (stackArray[n].equals("-1"))
                System.out.print("|     ");
            else
                System.out.print(String.format("| %2s " + " ", stackArray[n]));
        }

        System.out.println("|");

        for (int n = 0; n < 61; n++) System.out.print("-");
        
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray stackobj = new StackArray(10);
        stackobj.displayStack();
        stackobj.push("aaa");
        stackobj.displayStack();
        stackobj.push("bbb");
        stackobj.displayStack();

    }
    
}