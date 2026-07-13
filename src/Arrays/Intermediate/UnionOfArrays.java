package Arrays.Intermediate;

import java.util.HashSet;

public class UnionOfArrays {

    public static void union(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            set.add(num);
        }

        System.out.println(set);

    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,3,4};

        int[] arr2 = {2,3,5};

        union(arr1, arr2);

    }

}
