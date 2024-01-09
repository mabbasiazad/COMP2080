package solution;

/**
 * InsertionSort
 */
public class InsertionSort {
    public void insertionSort(int[] arr){
        int n =  arr.length;
        for (int ptr_forward = 1; ptr_forward < n; ptr_forward++) {
            int key =  arr[ptr_forward];  //current element
            int ptr_backward = ptr_forward - 1;
            // while (ptr_backward >= 0 && arr[ptr_backward] > key) {
            //    int temp = arr[ptr_backward]; 
            //    arr[ptr_backward] = key; 
            //    arr[ptr_backward + 1] = temp;
            //    ptr_backward = ptr_backward - 1;

            // }

            /* Move elements of arr[0..current-1], that are
               greater than key, to one position ahead
               of their current position */

            while (ptr_backward >= 0 && arr[ptr_backward] > key) {
               arr[ptr_backward + 1] = arr[ptr_backward]; 
               ptr_backward = ptr_backward - 1;
            }

            arr[ptr_backward + 1] = key;
        }
    }
    
    //helper
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
            System.out.println();
            }
    }

    //driver method
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr);
        printArray(arr);
    }
}