public class RecursiveBinarySearch {
    public static void main(String[] args) {
        // Example usage:
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Employee[] employees = new Employee[4 ]; 

        Employee employee_0 = new Employee(123);
        Employee employee_1 = new Employee(2354);
        
        employees[0] = employee_0;
        employees[1] = employee_1;
        
        int key_id = 123;
        int result = recursiveBinarySearch(employees, key_id);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }

    // Recursive Binary Search function
    static int recursiveBinarySearch(Employee[] arr, int key) {
        return binarySearchIter(arr, key, 0, arr.length - 1);
    }

    static int binarySearchIter(Employee[] arr, int key, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid].id == key) {
                return mid; // Key found
            } else if (arr[mid].id > key) {
                return binarySearchIter(arr, key, low, mid - 1); // Search in the left half
            } else {
                return binarySearchIter(arr, key, mid + 1, high); // Search in the right half
            }
        }

        return -1; // Key not found
    }
}
