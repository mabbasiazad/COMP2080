public class RecursiveBinarySearch {
    public static void main(String[] args) {
        // Example usage:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 8;
        int result = recursiveBinarySearch(array, key);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    // Recursive Binary Search function
    static int recursiveBinarySearch(int[] arr, int key) {
        return binarySearchIter(arr, key, 0, arr.length - 1);
    }

    static int binarySearchIter(int[] arr, int key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid; // Key found
            } else if (arr[mid] > key) {
                return binarySearchIter(arr, key, low, mid - 1); // Search in the left half
            } else {
                return binarySearchIter(arr, key, mid + 1, high); // Search in the right half
            }
        }

        return -1; // Key not found
    }
}
