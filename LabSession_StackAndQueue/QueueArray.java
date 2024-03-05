//Queue allow you to have access to the first element inserteds

import java.util.Arrays;

public class QueueArray {
    String[] queueArray;
    //we're going to monitor the following items
    int queueSize;
    int front, rear, numberOfItems = 0;

    QueueArray(int size) {
        queueSize = size;
        queueArray = new String[size];
        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {
        if (numberOfItems + 1 <= queueSize) {
            queueArray[rear] = input;
            rear++;
            numberOfItems++;
            displayTheQueue();
            System.out.println("INSERT " + input + " was added to the queue");
        } 
        else {
            displayTheQueue();
            System.out.println("Sorry, but the queue is full.");
        }
    }

    public void remove() {
        if (numberOfItems > 0) {
            System.out.println("REMOVE " + queueArray[front] + " was removed from the queue");
            queueArray[front] = "-1";
            front++;
            numberOfItems--;
            displayTheQueue();
        } else {
            displayTheQueue();
            System.out.println("Sorry, but the queue is empty.");
        }
    }

    public void peek() {
        displayTheQueue();
        System.out.println("PEEK " + queueArray[front] + " is at the front of the queue");
    }


    /**
     * Inserts an element into the queue based on priority.
     * If the queue is empty, the element is inserted at the rear.
     * Otherwise, the element is inserted at the appropriate position based on its priority.
     * The elements with higher priority are placed towards the front of the queue.
     * @param input The element to be inserted.
     */
    public void priorityInsert(String input) {
        int i;
        if (numberOfItems == 0) {
            // If the queue is empty, simply insert the element at the rear
            insert(input);
        } else {
            // Find the appropriate position to insert the element based on its priority
            for (i = numberOfItems - 1; i >= 0; i--) {
                if (Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    // Shift elements to the right to make space for the new element
                    queueArray[i + 1] = queueArray[i];
                } else {
                    // Break the loop if the current element has higher or equal priority
                    break;
                }
            }
            // Insert the element at the appropriate position
            queueArray[i + 1] = input;
            rear++;
            numberOfItems++;
            displayTheQueue();
            System.out.println("PRIORITY INSERT " + input + " was added to the queue");
        }
    }


    
    public void displayTheQueue(){
		
		for(int n = 0; n < 61; n++)System.out.print("-");		
		System.out.println();		
		for(int n = 0; n < queueSize; n++){			
			System.out.format("| %2s "+ " ", n);			
		}		
		System.out.println("|");		
		for(int n = 0; n < 61; n++)System.out.print("-");		
		System.out.println();		
		for(int n = 0; n < queueSize; n++){			
			if(queueArray[n].equals("-1")) System.out.print("|     ");			
			else System.out.print(String.format("| %2s "+ " ", queueArray[n]));			
		}		
		System.out.println("|");		
		for(int n = 0; n < 61; n++)System.out.print("-");		
		System.out.println();		
		// Number of spaces to put before the F	
		int spacesBeforeFront = 3*(2*(front+1)-1);		
		for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");		
		System.out.print("F");		
		// Number of spaces to put before the R		
		int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);		
		for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");		
		System.out.print("R");		
		System.out.println("\n");
    }

    public static void main(String[] args) {
        QueueArray queuearray = new QueueArray(3);
        queuearray.displayTheQueue();

        queuearray.insert("10");
        queuearray.insert("15");
        queuearray.insert("20");

        queuearray.remove();

        queuearray.peek();


    }
}
