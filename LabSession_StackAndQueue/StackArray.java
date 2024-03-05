// Array Implementation of Stack

import java.util.Arrays;

/**
 * stack
 */
// stack allow you to have access to the last element inserted
 public class StackArray {
    private String[] stackArray; // Array to store the stack
    //we're going to monitor the size of the stack and the top of the stack
    private int stackSize; // Size of the stack
    private int topOfStack = -1; // an index to keep track of the top of the stack; -1 means the stack is empty

    // Constructor
    StackArray(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");
    }

    // Push operation: add an element to the top of the stack
    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
        } else {
            System.out.println("Sorry, but the stack is full.");
            return;
        }
        displayTheStack();
        System.out.println("PUSH " + input + " was added to the stack");
    }

    // Pop operation: remove the top element from the stack
    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " was removed from the stack");
            String poppedElem = stackArray[topOfStack];

            //when an element is removed, it is replaced with -1. 
            //The element is still there but it is not accessible
            stackArray[topOfStack] = "-1";

            topOfStack--;
            return poppedElem;
        } else {
            displayTheStack();
            System.out.println("Sorry, but the stack is empty.");
            return "-1";
        }
    }

    //to see what's at the top of the stack but not remove it
    public String peek() {
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " is at the top of the stack");
        return stackArray[topOfStack];
    }

    public void pushMany(String multipleValues) {
        // your code here
    }

    public void popAll() {
        // your code here
    }

    public void displayTheStack() {
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
        StackArray stackarray = new StackArray(10);
        stackarray.displayTheStack();

        stackarray.push("10");
        stackarray.push("15");
        stackarray.push("20");

        stackarray.displayTheStack();
        System.out.println("Popped: " + stackarray.pop());

        // do it as an exercise
        stackarray.pushMany("12 23 45");
        stackarray.displayTheStack();
    }

}