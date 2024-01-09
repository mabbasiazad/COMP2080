package solution;

public class LinearSearch {
    
    public static int linearSearch(int[] arr, int x) {
        for (int i=0; i<arr.length; i++){
            if (arr[i] == x) {
                return i;                
            }
        }

        return -1;
    }
    //Driver Code
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40}; 
        int x = 10; 
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("the element has not been found");   
        }
        else {
            System.out.println("the element found at index: " + result);
        }
        
    }
}
