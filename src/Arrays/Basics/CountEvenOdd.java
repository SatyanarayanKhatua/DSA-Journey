package Arrays.Basics;

public class CountEvenOdd {

    public static void countEvenOdd(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {

            if (num % 2 == 0) {

                evenCount++;

            } else {

                oddCount++;

            }

        }

        System.out.println("Even Count = " + evenCount);
        System.out.println("Odd Count = " + oddCount);

    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 8, 13, 6, 7};

        countEvenOdd(arr);

    }

}
