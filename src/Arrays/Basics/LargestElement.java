package Arrays.Basics;

public class LargestElement {

    public static int largestElement(int[] arr) {

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                largest = arr[i];
            }

        }

        return largest;
    }

    public static void main(String[] args) {

        int[] arr = {3, 8, 2, 10, 5};

        System.out.println(largestElement(arr));

    }

}
