public class BinarySearchRecur {
    public static void main(String[] args) {
        int max_number = 3;
        Employee[] employees = new Employee[max_number]; 

        Employee employee0 = new Employee("name_a", 123);
        Employee employee1 = new Employee("name_b", 254);
        Employee employee2 = new Employee("name_c", 458);

        employees[0] = employee0; 
        employees[1] = employee1; 
        employees[2] = employee2;

        int key = 4588; 
        int employee_index = binarySearchRecur(employees, key);

        if (employee_index == -1) System.out.println("the employee key has not found");
        else System.out.println("the employee index is equal to: " + employee_index); 
    }

    public static int binarySearchRecur(Employee[] arr_emp, int key_id){
        return binarySearchRecurIter(arr_emp, key_id, 0, arr_emp.length - 1);
    }
            
    public static int binarySearchRecurIter(Employee[] arr_emp, int key_id, int low, int high){
        if (low <= high) {
            int mid = low + (high - low) / 2; 
            if (key_id == arr_emp[mid].id) return mid;   //key found          
            if (key_id > arr_emp[mid].id) return binarySearchRecurIter(arr_emp, key_id, mid + 1, high);
            else return binarySearchRecurIter(arr_emp, key_id, low, mid - 1);
        }
        return -1;
    }
    
}
