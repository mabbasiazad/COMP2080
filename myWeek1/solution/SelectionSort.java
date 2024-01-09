package solution;
/**
 * SelectionSort
 */
public class SelectionSort {
    public void selectionSort(int[] arr) {
        int n = arr.length;
        for (int ptr_a = 0; ptr_a < n - 1; ptr_a++ ){
            int minIndex = ptr_a;
            
            for (int ptr_b = ptr_a + 1; ptr_b < n; ptr_b++){
                if (arr[ptr_b] < arr[minIndex]){
                    minIndex = ptr_b;
                }
            }

            if (minIndex != ptr_a) {
                int temp = arr[ptr_a];
                arr[ptr_a] = arr[minIndex];
                arr[minIndex] = temp;
            }
        } 

    }

    // Auxilary method to print the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
            System.out.println();
            }
    }

    //driver method
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int[] arr = {10, 8, 12, 7, 3};
        obj.selectionSort(arr);
        obj.printArray(arr);
        
    }
}