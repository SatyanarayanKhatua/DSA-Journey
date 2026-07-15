package Arrays.Basics;

public class MaximumDifference {

    public static int maxDifference(int[] arr) {

        int minElement = arr[0];
        int maxDifference = 0;

        for (int i = 1; i < arr.length; i++) {

            int difference = arr[i] - minElement;

            maxDifference = Math.max(maxDifference, difference);

            minElement = Math.min(minElement, arr[i]);
        }

        return maxDifference;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 10, 6, 4, 8, 1};

        System.out.println("Maximum Difference = "
                + maxDifference(arr));
    }
}
