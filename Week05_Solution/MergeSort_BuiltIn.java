import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * mergeSort
 */
public class MergeSort_BuiltIn {

    public List<Integer> mergeSort(List<Integer> list) {
        
        if (list.size() <= 1) {
            return list;
        }
        
        int pivot = list.get(list.size() / 2);
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>(); 
        
        for (Integer x : list) {
            if(x < pivot) left.add(x);
            else if(x == pivot) middle.add(x);
            else right.add(x);
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(mergeSort(left));
        result.addAll(middle);
        result.addAll(mergeSort(right));

        return result;        
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random randNum = new Random(); 

        for (int i = 0; i < 10; i++) {
            list.add(randNum.nextInt(100));
        }

        MergeSort_BuiltIn mergeSort = new MergeSort_BuiltIn();
        List<Integer> sortedList = mergeSort.mergeSort(list);

        System.out.println("Original List: " + list);
        System.out.println("Sorted List: " + sortedList);
    }
}
