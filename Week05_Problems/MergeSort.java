import java.util.Random;


public class MergeSort {
    private static void mergeSort(int[] array) {
        //your code here
        int arrayLength = array.length; 
        
        //1- base condition


        //2- defining midIndex, leftHalf and rightHalf


        //3- devide the array into leftHalf and rightHalf



        //recursive call of leftHalf and rightHalf

    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        //your code here
        //1- define iterators for three arrays
        

        //2- compare until leftHalf or rightHalf runs out
        

        //3- add the remaining elements        
    }
    //helpers methods
    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Random rnd = new Random(); 
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(100);
        }

        System.out.print("Original Array: ");
        printArray(numbers);

        mergeSort(numbers);

        System.out.print("Sorted Array: ");
        printArray(numbers);
    }
}
