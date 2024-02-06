import java.util.Random;

public class QuickSort {

    private static void quickSort(int[] array){
        quickSort(array, 0 , array.length - 1);
    }

    private static void quickSort(int[] array, int lowIndex, int highIndex){
        //define base condition

        int pivot = array[highIndex]; 
        
        //start partitioning


        //stop partitioning

        //recursive call of left and right subarray sort
    }

    //helper methods
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] numbers = new int[1000000];

        for (int i = 0; i < numbers.length; i++) {
           numbers[i] = rnd.nextInt(100); 
        }

        System.out.print("Original Array: ");
        //printArray(numbers);

        quickSort(numbers);
        System.out.print("Sorted Array: ");
        //printArray(numbers);

    }
}
