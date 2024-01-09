package solution;

public class BinarySearch {
    
    public static int binarySearch(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;
        while (start != end) {
            int midIndex = (end - start) / 2;
            // System.out.println("start: " + start);
            // System.out.println("end: " + end);
            if (arr[start + midIndex] == x) 
                return start + midIndex;
            else if (arr[start + midIndex] > x) {
                end = start + midIndex;
            }
            else
                start = start + midIndex;            

        }
        return -1;

    }
    //Driver class
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 8, 10, 40, 6}; 
        int x = 10; 
        int result = binarySearch(arr, x);
        if (result == -1) {
            System.out.println("the element has not been found");   
        }
        else {
            System.out.println("the element found at index: " + result);
        }        
    }
}
