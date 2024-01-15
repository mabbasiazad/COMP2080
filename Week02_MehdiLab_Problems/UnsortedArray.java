import java.util.Arrays;

public class UnsortedArray {
    private int[] m_array; 
    private int maxSize; 
    private int numElements;

    public UnsortedArray(int maxSize){
        this.maxSize = maxSize;
        numElements = 0;
        m_array = new int[maxSize];
    }

    public boolean addLast(int item) { 
        if (numElements < maxSize) {
            m_array[numElements] = item;
            numElements++;
            return true;
        }
        else{
            return false;
        }
    }

    public int linearSearch(int item) {
        for (int i = 0; i < numElements; i++){
            if (item == m_array[i]){
                System.out.println("the item found in the index of " + i);
                return i;
            }
        }

        return -1; 
    }

    boolean removeItem(int item) {

        int index = linearSearch(item);

        if (index == -1) return false;
        else {
            m_array[index] = 0;
            return true;
        }
    }

    //Note:  first revise the remove item. instead of zeroing the found element
    // swap it with the last element of the array and decrease the num_Element by one
    public boolean efficientRemoveItem(int item) {
        /*
        Removes the first occurrence of item from the
        array. If found, the item must be removed by
        shifting down all items after it down by 1. The
        function returns true if the removal was successful
        (if found) and false otherwise (not found) 
        */

        //your code here
        return false;
    }

    // find the biggest!
    public void selectionSort(){
        // we need the loop for filling the array
    
        for (int i = 0; i < numElements; i++) {
            // go through the array!
            // we have to find the smallest
            int smallestLocation = i;
    
            for (int j = i+1; j <numElements ; j++) {
    
                // comparison!
                if(m_array[j] < m_array[smallestLocation]) {
                    smallestLocation = j;
                }
                    
                }
            // time to swap!
            int temp = m_array[smallestLocation];
            m_array[smallestLocation] = m_array[i];
            m_array[i] = temp;   
            }    
        }
    
    public void listItems() {
        //writ you code here
    }

    @Override
    public String toString() {
        return "UnsortedArray{" +
                "m_array=" + Arrays.toString(m_array) +
                ", maxSize=" + maxSize +
                ", numElements=" + numElements +
                '}';
    }

}