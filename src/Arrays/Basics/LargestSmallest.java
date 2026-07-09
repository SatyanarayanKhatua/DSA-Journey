package Arrays.Basics;

public class LargestSmallest {

    public static void findLargestSmallest(int[] arr) {

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {

                largest = arr[i];

            }

            if (arr[i] < smallest) {

                smallest = arr[i];

            }

        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

    }

    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 20, 3};

        findLargestSmallest(arr);

    }

}
