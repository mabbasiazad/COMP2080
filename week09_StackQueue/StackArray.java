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
        if (topOfStack >= 0) {
            //displayStack();
            String poppedElem = stackArray[topOfStack]; 
            System.out.println("POP " + poppedElem + " was removed form the stack");
            stackArray[topOfStack] = "-1";
            topOfStack--;
            return poppedElem;
        }
        else{
            System.out.println("The stack is empty");
            return "-1"; 
        }

    }

    //enters more than one element to the stack
    public void pushMany(String multipleValues) {
        //enter your code here

    }

    //remove all elements of the stack
    public void popAll(){

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
        stackobj.push("10");
        stackobj.push("15");
        stackobj.push("160");
        stackobj.displayStack();
        stackobj.pop();
        stackobj.displayStack();

        stackobj.pop();
        stackobj.displayStack();

        stackobj.pushMany("15 78 45 78");

    }
    
}