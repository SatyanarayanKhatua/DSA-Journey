package Arrays.Intermediate;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {

    public static Set<Integer> findIntersection(
            int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {

            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        System.out.println(
                findIntersection(arr1, arr2)
        );
    }
}
