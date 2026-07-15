package Arrays.Intermediate;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;

        int[] merged = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {

            if (arr1[i] <= arr2[j]) {

                merged[k] = arr1[i];

                i++;
                k++;

            } else {

                merged[k] = arr2[j];

                j++;
                k++;
            }
        }

        while (i < n) {

            merged[k] = arr1[i];

            i++;
            k++;
        }

        while (j < m) {

            merged[k] = arr2[j];

            j++;
            k++;
        }

        return merged;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] result = mergeArrays(arr1, arr2);

        for (int num : result) {

            System.out.print(num + " ");
        }
    }
}