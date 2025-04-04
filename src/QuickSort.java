import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static List<Integer> sort(List<Integer> arr) {
        if (arr.size() <= 1) return arr;

        int pivot = arr.get(arr.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int x : arr) {
            if (x < pivot) left.add(x);
            else if (x == pivot) middle.add(x);
            else right.add(x);
        }

        System.out.printf("Pivot: %d, Left: %s, Right: %s%n", pivot, left, right);

        List<Integer> sorted = new ArrayList<>(sort(left));
        sorted.addAll(middle);
        sorted.addAll(sort(right));
        return sorted;
    }
}
